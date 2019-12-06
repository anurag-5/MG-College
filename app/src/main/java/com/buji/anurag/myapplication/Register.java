package com.buji.anurag.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText t1,t2,t3,t4,t5,t6;
    Button b1;
    String a,b,c,d,e,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        t1=(EditText)findViewById(R.id.ename);
        t2=(EditText)findViewById(R.id.erno);
        t3=(EditText)findViewById(R.id.eano);
        t4=(EditText)findViewById(R.id.ecname);
        t5=(EditText)findViewById(R.id.epassword);
        t6=(EditText)findViewById(R.id.erpassword);
        b1=(Button)findViewById(R.id.btn3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=t1.getText().toString();
                b=t2.getText().toString();
                c=t3.getText().toString();
                d=t4.getText().toString();
                e=t5.getText().toString();
                f=t6.getText().toString();

                if((a.equals("") && b.equals("")) && (c.equals("") && d.equals("")) && (e.equals("") && f.equals("")))
                {
                    Toast.makeText(getApplicationContext(),"field empty",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent intent=new Intent(getApplicationContext(),loggedin.class);
                    startActivity(intent);
                }



            }
        });
    }
}
