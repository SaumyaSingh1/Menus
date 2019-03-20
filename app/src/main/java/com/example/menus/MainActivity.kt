package com.example.menus

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.home -> {
                Toast.makeText(baseContext, "Clicked on home", Toast.LENGTH_SHORT).show()
            }

            R.id.about->
            {
                Toast.makeText(baseContext,"Clicked on about",Toast.LENGTH_SHORT).show()
            }
        }
        return true

    }
}