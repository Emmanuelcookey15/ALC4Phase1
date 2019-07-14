package com.example.alc4phase1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
    }

    fun loadAndelaALCPage(v: View){

        val loadALC = Intent(this, AboutALCActivity::class.java)
        loadALC.putExtra("ALC", "andela.com/alc/")
        startActivity(loadALC)
    }

    fun goToProfilePage(v: View){
        var loadProfile = Intent(this, ProfileActivity::class.java)
        startActivity(loadProfile)
    }

}
