package com.example.miniprojetlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Create_Account extends AppCompatActivity {

    private EditText editName , editPrenom , editPhone , editMail , editPassword ;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        editName = findViewById(R.id.editName);
        editPrenom = findViewById(R.id.editPrenom);
        editPhone = findViewById(R.id.editPhone);
        editMail = findViewById(R.id.editMail);
        editPassword = findViewById(R.id.editPassword);
        button = findViewById(R.id.inscrire1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewCompte();
            }
        });

    }
    private void  NewCompte(){
        String name = editName.getText().toString().trim();
        String prenom = editPrenom.getText().toString().trim();
        String  phone = editPhone.getText().toString().trim();
        String mail = editMail.getText().toString().trim();
        String  password = editPassword.getText().toString().trim();

        if (!name.isEmpty() && !prenom.isEmpty() && !phone.isEmpty() && !mail.isEmpty() && !password.isEmpty() ){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this,"Enter the portlets Correctly please ",Toast.LENGTH_SHORT).show();
        }
    }
}