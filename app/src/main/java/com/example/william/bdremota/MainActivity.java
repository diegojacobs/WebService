package com.example.william.bdremota;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import org.apache.http.NameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }//fin onCreate

    public void OnClickButton(View v) {
        if ((v.getId() == R.id.BtnLogin)) {
            EditText usuario = (EditText) findViewById(R.id.TUsuarioIngresado);
            EditText password = (EditText) findViewById(R.id.TPassIngresado);
            String usuarioIngresado = usuario.getText().toString();
            String passwordIngresado = password.getText().toString();
            User mUsuario = new User(usuarioIngresado);
            if (mUsuario.validateUser(passwordIngresado)) {
                TextView txtV = (TextView) findViewById(R.id.Name);
                txtV.setText(mUsuario.getName());

                txtV = (TextView) findViewById(R.id.Carnet);
                txtV.setText(mUsuario.getCarnet());

                txtV = (TextView) findViewById(R.id.Facultad);
                txtV.setText(mUsuario.getFacultade());

                txtV = (TextView) findViewById(R.id.Carrera);
                txtV.setText(mUsuario.getCarrera());

                txtV = (TextView) findViewById(R.id.Parqueo);
                txtV.setText(mUsuario.getParqueo());
            } else {
                TextView txtV = (TextView) findViewById(R.id.Name);
                txtV.setText("Email o contraseña erroneo");
            }
        }
    }
}

