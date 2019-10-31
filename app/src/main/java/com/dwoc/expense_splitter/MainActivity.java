package com.dwoc.expense_splitter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements Register_fragment.OnregisterPressed{
Register_fragment fragment=Register_fragment.newInstance();
EditText loginedittext_phonenumber,loginedittext_password;
Button loginbutton_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginbutton_login=findViewById(R.id.login_button);
        loginedittext_phonenumber=findViewById(R.id.login_phnumber_box);
        loginedittext_password=findViewById(R.id.login_password);
        loginbutton_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phnumber=loginedittext_phonenumber.getText().toString();
                String password=loginedittext_password.getText().toString();
                if (!phnumber.isEmpty() && !password.isEmpty()){
                    Toast.makeText(MainActivity.this,"WOOOW you filled all fields",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"plz fill all fields",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void gotoregister_fragment(View view) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction ft=fragmentManager.beginTransaction();
        ft.replace(R.id.register_framelayout,fragment).addToBackStack(null).commit();

    }

    @Override
    public void OnRegister(String phnumbher, String first_name, String last_name, String password) {
        Toast.makeText(MainActivity.this,"pressed and it works",Toast.LENGTH_SHORT).show();
    }


}
