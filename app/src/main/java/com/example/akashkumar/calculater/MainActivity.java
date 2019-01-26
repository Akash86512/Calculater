package com.example.akashkumar.calculater;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.lang.Math;





public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et1;
    Button bt1,bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0;
    Button sum, sub, mul, div, dot, equal, c,m3,br1;
    double a;
    double r;
    char opr;

    double b;

    double d;
    int d1;
    double d12;
    double f;

    Button square,fact,sin,cos,tan,log;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.number);
        sum = (Button) findViewById(R.id.sum);
        sub= (Button) findViewById(R.id.sub);
        mul= (Button) findViewById(R.id.mul);
        div= (Button) findViewById(R.id.div);
        dot= (Button) findViewById(R.id.dot);
        equal= (Button) findViewById(R.id.equal);
        c= (Button) findViewById(R.id.c);
        bt1= (Button) findViewById(R.id.bt1);
        bt2= (Button) findViewById(R.id.bt2);
        bt3= (Button) findViewById(R.id.bt3);
        bt4= (Button) findViewById(R.id.bt4);
        bt5= (Button) findViewById(R.id.bt5);
        bt6= (Button) findViewById(R.id.bt6);
        bt7= (Button) findViewById(R.id.bt7);
        bt8= (Button) findViewById(R.id.bt8);
        bt9= (Button) findViewById(R.id.bt9);
        bt0= (Button) findViewById(R.id.bt0);
        m3= (Button) findViewById(R.id.m3);
        br1= (Button) findViewById(R.id.br1);


        square= (Button) findViewById(R.id.square);
        fact= (Button) findViewById(R.id.fact);
        sin= (Button) findViewById(R.id.sin);
        cos= (Button) findViewById(R.id.cos);
        tan= (Button) findViewById(R.id.tan);
        log= (Button) findViewById(R.id.log);

        sin.setOnClickListener(this);
        cos.setOnClickListener(this);
        tan.setOnClickListener(this);
        br1.setOnClickListener(this);

        sum.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        dot.setOnClickListener(this);
        equal.setOnClickListener(this);
        c.setOnClickListener(this);
        m3.setOnClickListener(this);
        sum.setOnClickListener(this);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt0.setOnClickListener(this);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        // client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void square(View v)
    {
        a=Double.parseDouble(et1.getText().toString());
        r=a*a;
        et1.setText(String.valueOf(r));

    }
    public void fact(View v)
    {
        int r1=1,i;
        d1=Integer.parseInt(et1.getText().toString());
        for (i=1;i<=d1;i++)
        {
            r1=r1*i;
        }

        et1.setText(String.valueOf(r1));

    }

    public void tan(View v)
    {
        a=Double.parseDouble(et1.getText().toString());
        d=Math.toRadians(a);
        et1.setText(String.valueOf(Math.tan(d)));



    }

    public void log(View v)
    {
        a=Double.parseDouble(et1.getText().toString());

        et1.setText(String.valueOf(Math.log10(a)));

    }







    @Override
    public void onClick(View v) {


        switch(v.getId())
        {
            case R.id.bt1:
            {
                if(et1.getText()==null) {
                    et1.setText("1");
                }else{
                    et1.append("1");
                }
                break;
            }
            case R.id.bt2:
            {
                if(et1.getText()==null) {
                    et1.setText("2");
                }else{
                    et1.append("2");
                }
                break;
            }
            case R.id.bt3:
            {
                if(et1.getText()==null) {
                    et1.setText("3");
                }else{
                    et1.append("3");
                }
                break;
            }
            case R.id.bt4:
            {
                if(et1.getText()==null) {
                    et1.setText("4");
                }else{
                    et1.append("4");
                }
                break;
            }
            case R.id.bt5:
            {
                if(et1.getText()==null) {
                    et1.setText("5");
                }else{
                    et1.append("5");
                }
                break;
            }
            case R.id.sin:
            {

                if(et1.getText()==null) {
                    et1.setText("");
                }else{
                    et1.append("sin(");

                }
                break;
            }
            case R.id.cos:
            {

                if(et1.getText()==null) {
                    et1.setText("");
                }else{
                    et1.append("cos(");

                }
                break;
            }
            case R.id.bt6:
            {
                if(et1.getText()==null) {
                    et1.setText("6");
                }else{
                    et1.append("6");
                }
                break;
            }
            case R.id.bt7:
            {
                if(et1.getText()==null) {
                    et1.setText("7");
                }else{
                    et1.append("7");
                }
                break;
            }
            case R.id.bt8:
            {
                if(et1.getText()==null) {
                    et1.setText("8");
                }else{
                    et1.append("8");
                }
                break;
            }
            case R.id.bt9:
            {
                if(et1.getText()==null) {
                    et1.setText("9");
                }else{
                    et1.append("9");
                }
                break;
            }
            case R.id.bt0:
            {
                if(et1.getText()==null) {
                    et1.setText("0");
                }else{
                    et1.append("0");
                }
                break;
            }
            case R.id.dot:
            {
                et1.setText(et1.getText()+".");
                break;
            }
            case R.id.c:
            {

                et1.setText("");
                break;
            }
            case R.id.sum:
            {

                a=Double.parseDouble(et1.getText().toString());
                opr='+';
                et1.setText("");
                break;
            }
            case R.id.br1: {
                String s = et1.getText().toString();
                String s1 = s.replace("sin(", "");
                f = Double.parseDouble(s1);
                opr = 's';
                et1.setText(s+")");

                break;

            }




            case R.id.sub:
            {


                a=Double.parseDouble(et1.getText().toString());
                opr='-';
                et1.setText("");
                break;
            }
            case R.id.mul:
            {

                a=Double.parseDouble(et1.getText().toString());
                opr='*';
                et1.setText("");
                break;
            }
            case R.id.div:
            {

                a=Double.parseDouble(et1.getText().toString());
                opr='/';
                et1.setText("");
                break;
            }
            case R.id.m3:
            {

                a=Double.parseDouble(et1.getText().toString());
                opr='%';
                et1.setText("");
                break;
            }
            case R.id.equal:
            {


                if(opr=='+')
                {
                    b=Double.parseDouble(et1.getText().toString());
                    r=a+b;
                    et1.setText(String.valueOf(r));
                }
                if(opr=='-')
                {
                    b=Double.parseDouble(et1.getText().toString());
                    r=a-b;
                    et1.setText(String.valueOf(r));
                }
                if(opr=='*')
                {
                    b=Double.parseDouble(et1.getText().toString());
                    r=a*b;
                    et1.setText(String.valueOf(r));
                }
                if(opr=='/')
                {
                    b=Double.parseDouble(et1.getText().toString());
                    r=a/b;
                    et1.setText(String.valueOf(r));
                }
                if(opr=='%')
                {
                    b=Double.parseDouble(et1.getText().toString());
                    r=a%b;
                    et1.setText(String.valueOf(r));
                }
                if(opr=='s')
                {

                    d12=Math.toRadians(f);
                    et1.setText(String.valueOf(Math.sin(d12)));

                }
                if(opr=='c')
                {

                    d12=Math.toRadians(f);
                    et1.setText(String.valueOf(Math.cos(d12)));

                }
                break;
            }

        }

    }

}







