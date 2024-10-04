package com.example.a008_pasoparametrosv2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText edtUsuario;
    private Button btnEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edtUsuario = (EditText)findViewById(R.id.edtUsuario);
        btnEnviar = (Button)findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent navegarEntrePantallas = new Intent(getBaseContext(), PantallaActivity.class);
                navegarEntrePantallas.putExtra("USUARIO", edtUsuario.getText().toString());
                startActivity(navegarEntrePantallas);
            }
        });
        }
    }
