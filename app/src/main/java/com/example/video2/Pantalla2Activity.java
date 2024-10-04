package com.example.video2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.video2.beans.Usuario;
import com.example.video2.datos.SeasData;

public class Pantalla2Activity extends AppCompatActivity {
    private TextView txtUser;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);


        txtUser =(TextView)findViewById(R.id.txtUserPantalla2);

        //Bundle variables = getIntent().getExtras();
        //String user = variables.getString("USUARIO");


        //Usuario usuario= (Usuario)variables.getSerializable("USUARIO");
        txtUser.setText(SeasData.getUsuario().getEmail());
    }
}
