package com.example.practica1kotlin93

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btnSaludar:Button;
    private lateinit var btnLimpiar:Button;
    private lateinit var btnCerrar:Button;

    private lateinit var txtNombre:EditText;
    private lateinit var lblSaludar:TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSaludar = findViewById(R.id.btnSaludo) as Button;
        btnLimpiar = findViewById(R.id.btnLimpiar) as Button;
        btnCerrar = findViewById(R.id.btnCerrar) as Button;

        txtNombre = findViewById(R.id.txtSaludo) as EditText;
        lblSaludar = findViewById(R.id.lblSaludo) as TextView;

        btnSaludar.setOnClickListener {
            var str:String
            if(txtNombre.text.toString().contentEquals("")){
                Toast.makeText(applicationContext,"Falto capturar datos",Toast.LENGTH_LONG).show()
            }
            btnSaludar.setOnClickListener {
                var str: String
                if(txtNombre.text.toString().contentEquals("")){
                    Toast.makeText(applicationContext,"Falto capturar datos",Toast.LENGTH_LONG).show()
                }
                else {
                    str = "Hola " + txtNombre.text.toString() + " ¿Cómo estás?";
                    lblSaludar.text = str;
                }
            }
        }
        btnLimpiar.setOnClickListener {
            txtNombre.setText("") // limpia el contenido del EditText
            lblSaludar.text = "" // limpia el contenido del TextView
        }
        btnCerrar.setOnClickListener {
            finish() // cierra la actividad actual
        }


    }

    }
