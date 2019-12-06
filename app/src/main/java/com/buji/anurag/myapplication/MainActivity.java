package com.buji.anurag.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et,et2;
    Button btn;
    String getUname,getPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText)findViewById(R.id.ed);
        et2=(EditText)findViewById((R.id.ed2));
        btn=(Button)findViewById((R.id.bt));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUname=et.getText().toString();
                getPassword=et2.getText().toString();
                Log.d("user",getUname);
                Log.d("pass",getPassword);
                if(getUname.equals("anurag")&getPassword.equals("1234"))
                {
                    Toast.makeText(getApplicationContext(),"succesful ",Toast.LENGTH_LONG).show();
                }


            }
        });
    }
}
