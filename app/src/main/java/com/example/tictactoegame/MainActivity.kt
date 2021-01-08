package com.example.tictactoegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.bu01)
        btn1.setOnClickListener{
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("friends", true)
            startActivity(intent)

        }


        val btn2 = findViewById<Button>(R.id.bu02)
        btn2.setOnClickListener{
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("friends", false)
            startActivity(intent)
        }

        val btn = findViewById<Button>(R.id.bu03)
        btn.setOnClickListener {
            this@MainActivity.finish()
            exitProcess(0)
        }

    }

}
