package com.example.mysecondapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText editText;
    private EditText editPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        editPassword=findViewById(R.id.editPassword);
    }

    public void btnSubmitOnClick(View view) {
        String name =editText.getText().toString();
        String name2 =editPassword.getText().toString();
        String msg="name"+name + " ,pass"+name2;
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

    }
    //todo: add event handler for submit button
}