package com.example.tdmpa_1p_ej02

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnCambiar = findViewById<Button>(R.id.btnCambiar)
        btnCambiar.setOnClickListener{
            fnCambiar();
        }
    }
    fun fnCambiar(){
        val urlFondo = "https://avatars.mds.yandex.net/i?id=f203754880cd7d98b91c7c2a145e2267-4080597-images-thumbs&n=13";
        var urlFondoParse:Uri = Uri.parse(urlFondo)
        var imgFondo = findViewById<ImageView>(R.id.imgFondo)
        Glide.with(applicationContext).load(urlFondoParse).into(imgFondo)

        Toast.makeText(this@MainActivity ,
            "Estimados alumnos reciban un cordial saludo",
            Toast.LENGTH_SHORT).show()

    }
}