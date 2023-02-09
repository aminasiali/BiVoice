package com.example.bivoice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    EditText loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username= findViewById(R.id.username);
        password= findViewById(R.id.password);
       //loginButton= findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (username.getText().toString().equals("user")) && password.getText().toString().equals("1234");
                {
                    Toast.makeText(MainActivity.this, "Connexion Réussie ", Toast.LENGTH_SHORT).show();
                }else
                {
                    Toast.makeText(MainActivity.this, "Echec de la connexion", Toast.LENGTH_SHORT).show();
                }


            }
        }
        );
    }
}