package com.example.semana9;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.semana9.entities.User;

public class CrearPersonasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);

        EditText nombreEditText = findViewById(R.id.nombreEditText);
        EditText numeroEditText = findViewById(R.id.numeroEditText);
        EditText ImagenesEditText = findViewById(R.id.ImagenesEditText);

        Button btnAgregar = findViewById(R.id.btnAgregar);
        // Llamada al método agregarContacto() en el evento onClick() de un botón
        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes obtener los datos del nuevo contacto, por ejemplo, desde los EditText
                String nombre = nombreEditText.getText().toString();
                String numero = numeroEditText.getText().toString();
                String imagenes = ImagenesEditText.getText().toString();

                String imageUrl = "https://assets.pokemon.com/assets/cms2/img/pokedex/full/" + numero + ".png";

                if(!nombre.isEmpty() && !numero.isEmpty() && !imagenes.isEmpty()){
                    // Crear un objeto Contacto con los datos obtenidos
                    User user = new User(nombre, numero, imagenes);

                    ListaAnimesActivity listaAnimesActivity = new ListaAnimesActivity();

                    // Llamar al método agregarContacto() para agregar el nuevo contacto
                    listaAnimesActivity.agregarContacto(user);

                    // Limpiar los EditText
                    nombreEditText.setText("");
                    numeroEditText.setText("");
                    ImagenesEditText.setText("");
                }else {
                    Toast.makeText(getApplicationContext(), "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}