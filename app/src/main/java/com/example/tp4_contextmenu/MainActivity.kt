package com.example.tp4_contextmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var email : ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        email = findViewById(R.id.vue)
        registerForContextMenu(email)

    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {

        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menucontext, menu)
        // menu.setHeaderTitle("ContextMenu");

    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
       // val info = item.menuInfo as AdapterView.AdapterContextMenuInfo
        return when (item.itemId) {
                R.id.search -> {
                    Toast.makeText(this, "Search selected",Toast.LENGTH_LONG).show()
                    true
                }
            R.id.ch -> {
                Toast.makeText(this, "ch1 selected",Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onContextItemSelected(item)
        }

    }
}