package com.example.a007_pasoparametros;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PantallaActivity extends AppCompatActivity {

    private TextView txtUserPantalla2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pantalla);
            txtUserPantalla2 = (TextView)findViewById(R.id.txtUserPantalla2);
            Bundle parametros = getIntent().getExtras();
            String usuario = parametros.getString("USUARIO");
            txtUserPantalla2.setText(usuario);
        }
    }
