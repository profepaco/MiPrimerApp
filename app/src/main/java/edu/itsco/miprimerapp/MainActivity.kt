package edu.itsco.miprimerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var txtNombre: EditText
    lateinit var lbMensaje: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick:Button = findViewById(R.id.btn_click)

        txtNombre = findViewById(R.id.txt_nombre)
        lbMensaje = findViewById(R.id.lb_mensaje)

        val btnSaludo = findViewById<Button>(R.id.btn_saludo)
        btnSaludo.setOnClickListener(this)

        btnClick.setOnClickListener { view ->
            Toast.makeText(this.applicationContext,
                "Diste click en el boton", Toast.LENGTH_SHORT).show()
        }
    }

    fun enviarSaludo(){
        val nombre = txtNombre.text.toString() //obtenemos el valor del View
        lbMensaje.text = "Que tal $nombre" //Asignamos valor a la vista

    }

    override fun onClick(v: View?) {
        enviarSaludo()
    }
}