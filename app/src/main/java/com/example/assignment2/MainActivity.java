package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText logUser,logPass,createUser,createPass,createEmail;
    Button login,createAccn;
    TextView goCreate,goLogin,head1,head2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logUser = findViewById(R.id.userName);
        logPass = findViewById(R.id.pass);
        login = findViewById(R.id.loginBtn);
        createUser = findViewById(R.id.createName);
        createPass = findViewById(R.id.createPass);
        createEmail = findViewById(R.id.createEmail);
        createAccn = findViewById(R.id.createBtn);
        goCreate = findViewById(R.id.addAccn);
        goLogin = findViewById(R.id.goLogin);
        head1 = findViewById(R.id.head1);
        head2 = findViewById(R.id.head2);

        goCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                head1.setVisibility(View.GONE);
                logUser.setVisibility(View.GONE);
                logPass.setVisibility(View.GONE);
                login.setVisibility(View.GONE);
                goCreate.setVisibility(View.GONE);
                head2.setVisibility(View.VISIBLE);
                createUser.setVisibility(View.VISIBLE);
                createPass.setVisibility(View.VISIBLE);
                createEmail.setVisibility(View.VISIBLE);
                createAccn.setVisibility(View.VISIBLE);
                goLogin.setVisibility(View.VISIBLE);
            }
        });
        goLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                head2.setVisibility(View.GONE);
                createUser.setVisibility(View.GONE);
                createPass.setVisibility(View.GONE);
                createEmail.setVisibility(View.GONE);
                createAccn.setVisibility(View.GONE);
                goLogin.setVisibility(View.GONE);
                head1.setVisibility(View.VISIBLE);
                logUser.setVisibility(View.VISIBLE);
                logPass.setVisibility(View.VISIBLE);
                login.setVisibility(View.VISIBLE);
                goCreate.setVisibility(View.VISIBLE);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isEmpty(logUser) || isEmpty(logPass)){
                    Toast.makeText(MainActivity.this, "You missed Something!!!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Logged In", Toast.LENGTH_SHORT).show();
                }
            }
        });
        createAccn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isEmpty(createUser) || isEmpty(createPass) || isEmpty(createEmail)){
                    Toast.makeText(MainActivity.this, "You missed Something!!!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Account created", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    boolean isEmpty(EditText txt){
        CharSequence str = txt.getText().toString();
        return TextUtils.isEmpty(str);
    }
}