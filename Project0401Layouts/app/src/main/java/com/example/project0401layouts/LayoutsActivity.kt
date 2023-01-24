package com.example.project0401layouts

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LayoutsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // findViewById Will Search View In View Hierarchy i.e. View Tree
        val linearButton = findViewById<View>(R.id.linearButton) as Button
        val relativeButton = findViewById<View>(R.id.relativeButton) as Button
        val gridButton = findViewById<View>(R.id.gridbutton) as Button

        linearButton.setOnClickListener {
            startActivity(
                Intent(
                    this@LayoutsActivity,
                    LinearLayoutActivity::class.java
                )
            )
        }
        relativeButton.setOnClickListener {
            startActivity(
                Intent(
                    this@LayoutsActivity,
                    RelativeLayoutActivity::class.java
                )
            )
        }
        gridButton.setOnClickListener {
            startActivity(
                Intent(
                    this@LayoutsActivity,
                    GridLayoutActivity::class.java
                )
            )
        }
    }
}