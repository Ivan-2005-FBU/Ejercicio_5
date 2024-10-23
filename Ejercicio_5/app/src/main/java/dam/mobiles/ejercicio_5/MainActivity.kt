package dam.mobiles.ejercicio_5

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dam.mobiles.ejercicio_5.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding //este  objeto contiene todos los controlods del archivo activity_main.xml


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Esta linea crea el objeto "binding" con los objetos que hay en el archivo activity_main.xml
        binding = ActivityMainBinding.inflate(layoutInflater)
        //la interfaz de MainActivity es el FrameLayout que es el padre de activity_Main.xml
        setContentView(binding.root)
            this.inicializarBotones()
        }

    fun inicializarBotones(){

        binding.btnSend.setOnClickListener(){
            val toText = binding.etTo.text.toString()
            val messageText = binding.etMessage.text.toString()

            // Log the values
            Log.d("Ejercicio5", "To: $toText")
            Log.d("Ejercicio5", "Message: $messageText")

            // Show a Toast with the values
            Toast.makeText(this, "To: $toText\nMessage: $messageText", Toast.LENGTH_SHORT).show()
        }
    }
}