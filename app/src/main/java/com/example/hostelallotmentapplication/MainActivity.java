package com.example.hostelallotmentapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText idText, passwordText;
    Button login;
    int c;
    String id_input, password_input;
    String[] id = {"20190001", "20190002", "20190003", "20190004", "20190005"};
    String[] password = {"f000001", "f000002", "f000003", "f000004", "f000005"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idText = findViewById(R.id.login_IDEditTExt);
        passwordText = findViewById(R.id.login_passwordEditText);
        login = findViewById(R.id.loginbtn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id_input = idText.getText().toString();
                password_input = passwordText.getText().toString();

                if (id_input.isEmpty() || password_input.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter username/password", Toast.LENGTH_SHORT).show();
                } else {
                    if (validate(id_input, password_input)) {
                        Intent login = new Intent(MainActivity.this, StudentPreference.class);
                        login.putExtra("id", id[c]);
                        startActivity(login);
                    }
                }
            }

            private boolean validate(String id_input, String password_input) {
                if(find(id_input)){
                    if(password[c].equals(password_input)){
                        return true;
                    }else{
                        Toast.makeText(MainActivity.this, "Invalid password", Toast.LENGTH_SHORT).show();
                        return false;
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Invalid username", Toast.LENGTH_SHORT).show();
                    return false;
                }
            }

            private boolean find(String id_input) {
                for(c=0;c<5;c++){
                    if(id[c].equals(id_input)){
                        return true;
                    }
                }
                return false;
            }
        });
    }
}


