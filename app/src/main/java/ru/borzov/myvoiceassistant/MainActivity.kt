package ru.borzov.myvoiceassistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name: String = "Ivan"
        val surname: String = "Ivanov"
        val age: Int = 37
        val height: Double = 172.2

        var output = findViewById<TextView>(R.id.output)
        output.text = "name: ${name} surname: ${surname} age: ${age} height: ${height}"

    }
}