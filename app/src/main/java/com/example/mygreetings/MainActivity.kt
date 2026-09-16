package com.example.mygreetings

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    // Declearing the variables
    lateinit var welcome: TextView
    lateinit var editText: EditText
    lateinit var JavaorKotlinEditText: EditText
    lateinit var button9: Button
    lateinit var imageView2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Initializing the widgets
        welcome = findViewById(R.id.welcome)
        editText = findViewById(R.id.editText)
        JavaorKotlinEditText = findViewById(R.id.JavaorKotlinEditText)
        button9 = findViewById(R.id.button9)
        imageView2 = findViewById(R.id.imageView2)

        // Setting the on click listener
        button9.setOnClickListener {
            val name = editText.text.toString()
            val language = JavaorKotlinEditText.text.toString()

            // Sey hello to the user

            Toast.makeText(this, "Hello $name", Toast.LENGTH_LONG).show()

            // Display the language view
            if (language.equals("java")) {
                imageView2.setImageResource(R.drawable.java)
            } else if (language.equals("kotlin")) {
                imageView2.setImageResource(R.drawable.kotlin)
            } else {
                imageView2.setImageResource(R.drawable.monkey)
            }

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }
}