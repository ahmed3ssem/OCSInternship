package com.example.smart.internshiptask;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button GO;
    private EditText email;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=(EditText) findViewById(R.id.editText);
        pass=(EditText) findViewById(R.id.editText2);
        GO=(Button) findViewById(R.id.button);
        GO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail=email.getText().toString();
                String pas=pass.getText().toString();
                if(email.getText().toString().isEmpty()||pass.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Please! write your email and Password",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Email is = "+mail+"\n Pass is = "+pas,Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
