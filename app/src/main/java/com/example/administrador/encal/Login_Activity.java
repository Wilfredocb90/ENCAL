package com.example.administrador.encal;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {
    private TextInputEditText txtUsuario;
    private TextInputEditText txtPassword;
    private Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        btnIngresar = (Button) findViewById(R.id.login_boton_ingresar);
        txtUsuario = (TextInputEditText) findViewById(R.id.login_input_usuario);
        txtPassword = (TextInputEditText) findViewById(R.id.login_input_password);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtUsuario.getText().toString().equals("adm")&& txtPassword.getText().toString().equals("123")){
                    Intent intent = new Intent(Login_Activity.this,MarcoActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(Login_Activity.this,"Usuario o pasword incorrectsos",Toast.LENGTH_SHORT);
                    txtUsuario.setText("");
                    txtPassword.setText("");
                }
            }
        });


    }
}
