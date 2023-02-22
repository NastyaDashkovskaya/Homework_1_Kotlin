package ru.dashkovskajanastassia.weatherapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView : TextView = findViewById(R.id.textView)
        val materialbutton : MaterialButton = findViewById(R.id.MaterialButton)
        materialbutton.setOnClickListener(){
            textView.text = String.format("Здравстуйте!\n Меня зовут %s, мне %d лет", Person().name, Person().age)
        }
    }
}
class Person(var name: String = "Анастасия", var age : Int = 20){}