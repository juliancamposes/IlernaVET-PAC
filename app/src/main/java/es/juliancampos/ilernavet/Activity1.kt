package es.juliancampos.ilernavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.juliancampos.ilernavet.databinding.Activity1Binding

class Activity1 : AppCompatActivity() {
    private lateinit var binding: Activity1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.Activity1)
    }

    override fun onResume() {
        super.onResume()
        binding = Activity1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Boton para ir a la Actividad 2
        binding.activity1GoActivity2.setOnClickListener{
            val intent = Intent(this,Activity2::class.java)
            startActivity(intent)
            finish()
        }

        //Boton para ir a la Actividad 3
        binding.activity1GoActivity3.setOnClickListener{
            val intent = Intent(this,Activity3::class.java)
            startActivity(intent)
            finish()
        }

        //Boton para ir a la actividad 4
        binding.activity1GoActivity4.setOnClickListener{
            val intent = Intent(this,Activity4::class.java)
            startActivity(intent)
            finish()
        }

        //Boton para reproducir músicad
        binding.activity1Play.setOnClickListener{
            //código
        }

        //Boton para parar música
        binding.activity1Stop.setOnClickListener{
            //código
        }
    }
}