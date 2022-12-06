package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button one, two, three, four, five, six, seven, eight, nine, zero, equal, allclr, add, sub, mul, div, clear1, clearline;
    TextView display,display1, symb, display2;
    String str="", str1;
    char sym;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        clearline = findViewById(R.id.clearline);
        clear1 = findViewById(R.id.clear1);
        allclr = findViewById(R.id.allclr);
        equal = findViewById(R.id.equal);

        display = findViewById(R.id.res);
        display1 = findViewById(R.id.str1);
        symb = findViewById(R.id.sym);
        display2 = findViewById(R.id.str2);

        one.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w){
                one1();
            }
        });

        two.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w){
                two2();
            }
        });

        three.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w){
                three3();
            }
        });

        four.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w){
                four4();
            }
        });

        five.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w){
                five5();
            }
        });

        six.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w){
                six6();
            }
        });

        seven.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w){
                seven7();
            }
        });

        eight.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w){
                eight8();
            }
        });

        nine.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w){
                nine9();
            }
        });

        zero.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w){
                zero0();
            }
        });

        clearline.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w){
                clrline();
            }
        });

        add.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w){
                ad();
            }
        });

        sub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w){
                su();
            }
        });

        mul.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w){
                mu();
            }
        });

        div.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w){
                di();
            }
        });

        equal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w){
                eql();
            }
        });

        allclr.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w){
                ce();
            }
        });

        clear1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w){ del1(); }
        });

    }



    private void one1() {
        str=str+'1';
        display.setText(str);
    }

    private void two2() {
        str=str+'2';
        display.setText(str);
    }

    private void three3() {
        str=str+'3';
        display.setText(str);
    }

    private void four4() {
        str=str+'4';
        display.setText(str);
    }

    private void five5() {
        str=str+'5';
        display.setText(str);
    }

    private void six6() {
        str=str+'6';
        display.setText(str);
    }

    private void seven7() {
        str=str+'7';
        display.setText(str);
    }

    private void eight8() {
        str=str+'8';
        display.setText(str);
    }

    private void nine9() {
        str=str+'9';
        display.setText(str);
    }

    private void zero0() {
        str=str+'0';
        display.setText(str);
    }

    private void clrline() {
        str="";
        display.setText(str);
    }

    private void ce() {
        str="";
        display.setText(str);
        display1.setText(str);
        symb.setText(str);
        display2.setText(str);
    }

    private void del1(){
//        StringBuffer sb= new StringBuffer(str);
//        sb.deleteCharAt(sb.length()-1);
//        display.setText(sb);
        if(str=="") {
            Toast.makeText(this, "Enter Value", Toast.LENGTH_SHORT).show();
        }
        else{
            str = str.substring(0, str.length() - 1);
            display.setText(str);
        }
    }

    private void ad() {
        str1=str;
        display1.setText(str1);
        sym='+';
        symb.setText("+");
        str="";
        display.setText(str);
    }

    private void su() {
        str1=str;
        display1.setText(str1);
        sym='-';
        symb.setText("-");
        str="";
        display.setText(str);
    }

    private void mu() {
        str1=str;
        display1.setText(str1);
        sym='*';
        symb.setText("*");
        str="";
        display.setText(str);
    }

    private void di() {
            str1=str;
            display1.setText(str1);
            sym='/';
            symb.setText("/");
            str="";
            display.setText(str);

    }

    private void eql(){
//        char[] ch = new char[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            ch[i] = str.charAt(i);
//        }
//        for (int i = 0; i < str.length(); i++){
//            if(ch[i]=='+')
//                break;
//        }
//        int a = Integer.parseInt(String.valueOf(ch));
//        display.setText(a);
        if(str==""||str1=="")
            Toast.makeText(this, "Enter Value", Toast.LENGTH_SHORT).show();
        else {
            display2.setText(str);
            int n1 = Integer.parseInt(str1);
            int n2 = Integer.parseInt(str);
            int result;
            String s;

            switch (sym) {
                case '+':
                    result = n1 + n2;
                    s = String.valueOf(result);
                    display.setText(s);
                    break;

                case '-':
                    result = n1 - n2;
                    s = String.valueOf(result);
                    display.setText(s);
                    break;

                case '*':
                    result = n1 * n2;
                    s = String.valueOf(result);
                    display.setText(s);
                    break;

                case '/':
                    try {
                        float divres = n1 / n2;
                        s = String.valueOf(divres);
                        display.setText(s);
                        break;
                    } catch (ArithmeticException e) {
                        Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                    }


            }
        }



//        if (sym=='+'){
//            int result= n1+n2;
//            String s=String.valueOf(result);
//            display.setText(s);
//        }
    }

}