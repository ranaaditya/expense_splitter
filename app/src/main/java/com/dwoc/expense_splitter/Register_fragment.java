package com.dwoc.expense_splitter;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Register_fragment extends Fragment {

    EditText registeredittext_phonenumber,registeredittext_firstname,registeredittext_lastname,registereditetxt_password;
    Button registerbutton_register;
    OnregisterPressed listener;
    public Register_fragment() {
        // Required empty public constructor
    }

    public static Register_fragment newInstance() {
        Register_fragment fragment = new Register_fragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_register_fragment, container, false);

        registerbutton_register=view.findViewById(R.id.register_button);
        registereditetxt_password=view.findViewById(R.id.register_password);
        registeredittext_firstname=view.findViewById(R.id.register_first_name);
        registeredittext_lastname=view.findViewById(R.id.register_last_name);
        registeredittext_phonenumber=view.findViewById(R.id.register_password);
        registerbutton_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phnum,first_num,last_num,passsword;
                phnum=registeredittext_phonenumber.getText().toString();
                first_num=registeredittext_firstname.getText().toString();
                last_num=registeredittext_lastname.getText().toString();
                passsword=registereditetxt_password.getText().toString();
                listener.OnRegister(phnum,first_num,last_num,passsword);
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            listener=(OnregisterPressed)context;
        }catch(ClassCastException e){
            throw  new ClassCastException(context.toString()+"do not has OnRegisterpressed interface");
        }

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }
    public interface OnregisterPressed{
        void OnRegister(String phnumbher,String first_name,String last_name,String password);
    }

}

