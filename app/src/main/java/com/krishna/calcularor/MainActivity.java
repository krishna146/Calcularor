package com.krishna.calcularor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnClear, btnPercentage, btnDelete, btnDivide, btn7, btn8, btn9, btnMultiply, btn4, btn5, btn6, btnSubtraction, btn3, btn2, btn1, btnAdd, btn00, btn0, btnPoint, btnEqualTo;
    TextView etResult;
    float a, b;
    float sum, subtraction, division, multiplication;
    Boolean add, subtract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClear = findViewById(R.id.btnClear);
        btnPercentage = findViewById(R.id.btnPercentage);
        btnDelete = findViewById(R.id.btnDelete);
        btnDivide = findViewById(R.id.btnDivide);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnMultiply = findViewById(R.id.btnMultiply);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btnSubtraction = findViewById(R.id.btnSubstraction);
        btn3 = findViewById(R.id.btn3);
        btn2 = findViewById(R.id.btn2);
        btn1 = findViewById(R.id.btn1);
        btnAdd = findViewById(R.id.btnAdd);
        btn00 = findViewById(R.id.btn00);
        btn0 = findViewById(R.id.btn0);
        btnPoint = findViewById(R.id.btnPoint);
        btnEqualTo = findViewById(R.id.btnEqualTo);
        etResult = findViewById(R.id.etResult);
        add = false;
        divide = false;
        subtract = false;
        multiply = false;

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etResult.setText("");
                sum = 0;
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNumberClick("1", 1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNumberClick("2", 2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNumberClick("3", 3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNumberClick("4", 4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNumberClick("5", 5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNumberClick("6", 6);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNumberClick("7", 7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNumberClick("8", 8);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNumberClick("9", 9);
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNumberClick("0", 0);
            }
        });
        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNumberClick("00", 00);
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etResult.getText().toString().isEmpty()) {
                    etResult.setText(".");


                } else {
                    etResult.setText(etResult.getText().toString() + ".");
                }
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etResult.getText().toString().isEmpty()) {
                    etResult.setText("");
                } else {
                    etResult.setText(etResult.getText().toString() + "+");
                    add = true;
                }
            }
        });
        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etResult.getText().toString().isEmpty()) {
                    etResult.setText("");
                } else {
                    etResult.setText(etResult.getText().toString() + "-");
                    subtract = true;
                }
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etResult.getText().toString().isEmpty()) {
                    etResult.setText("");
                } else {
                    etResult.setText(etResult.getText().toString() + "X");
                    multiply = true;
                }
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etResult.getText().toString().isEmpty()) {
                    etResult.setText("");
                } else {
                    etResult.setText(etResult.getText().toString() + "/");
                    divide = true;
                }
            }
        });
        btnEqualTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etResult.getText().toString().isEmpty()) {
                    etResult.setText("");
                } else {
                    if (add) {
                        sum = a + b;
                        etResult.setText(Float.toString(sum));
                        add = false;

                    } else if (multiply) {
                        multiplication = a * b;
                        etResult.setText(Float.toString(multiplication));
                        multiply = false;

                    } else if (subtract) {
                        subtraction = a - b;
                        etResult.setText(Float.toString(subtraction));
                        subtract = false;

                    } else {
                        division = a / b;
                        etResult.setText(Float.toString(division));
                        divide = false;

                    }

                }
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etResult.getText().toString().isEmpty()) {
                    etResult.setText("");
                } else {
                    String value = etResult.getText().toString();
                    value = value.replace(value.substring(value.length() - 1), "");
                    ;
                    etResult.setText(value);
                }
            }
        });

    }

    void onNumberClick(String text, int value) {

        if (etResult.getText().toString().isEmpty()) {

            etResult.setText(text);
            a = value;

        } else {

            if (add || multiply || divide || subtract) {

                if (etResult.getText().toString().endsWith("+") || etResult.getText().toString().endsWith("X") || etResult.getText().toString().endsWith("/") || etResult.getText().toString().endsWith("-")) {

                    etResult.setText(etResult.getText().toString() + text);
                    b = value;
                    if (!etResult.getText().toString().isEmpty()) {

                        if (sum != 0) {
                            a = sum;
                            sum = 0;
                        } else if (subtraction != 0) {
                            a = subtraction;
                            subtraction = 0;
                        } else if (multiplication != 0) {
                            a = multiplication;
                            multiplication = 0;
                        } else if (division != 0) {
                            a = division;
                            division = 0;
                        }

                    } else {

                        sum = 0;
                        subtraction = 0;
                        division = 0;
                        multiplication = 0;

                    }
                } else {

                    etResult.setText(etResult.getText().toString() + text);
                    b = Float.parseFloat((b + text));

                }

            } else {

                etResult.setText(etResult.getText().toString() + text);
                a = Float.parseFloat(etResult.getText().toString());

            }

        }

    }


}