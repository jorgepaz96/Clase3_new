package com.example.clase3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText usuario,clave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = (EditText) findViewById(R.id.editUusario);
        clave = (EditText) findViewById(R.id.editClave);
    }

    public void onClick(View view) {

        if (usuario.getText().toString().equals("admin") && clave.getText().toString().equals("admin")){
            Intent i=new Intent(this, Main2Activity.class);
            i.putExtra("usuario",usuario.getText().toString());
            startActivity(i);
        }else {
            Toast.makeText(getApplicationContext(),"Ingresar usuario valido",Toast.LENGTH_SHORT).show();
        }



    }
}
