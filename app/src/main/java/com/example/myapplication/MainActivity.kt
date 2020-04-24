package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity()
{
//pour gerer les items du menu
    private val mOnNaviagtionItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener@{ item->
        when(item.itemId)
        {
            R.id.home -> {
                Toast.makeText(this@MainActivity,"Home pressed", Toast.LENGTH_LONG).show()
                return@onNavigationItemSelectedListener true
            }

            R.id.message -> {
                //Toast.makeText(this@MainActivity,"Message pressed", Toast.LENGTH_LONG).show()
                setContentView(R.layout.abel_layout)
                return@onNavigationItemSelectedListener true
            }
        }
        return@onNavigationItemSelectedListener false

    }
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNaviagtionItemSelectedListener)

    }


}
