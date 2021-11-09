package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val superherolist = listOf<superhero>(
            superhero(
                R.drawable.enmen,
                nameSuperhero = "antman",
                descSuperhero = "ini superhero semut."
            ),
            superhero(
                R.drawable.betmen,
                nameSuperhero = "batman",
                descSuperhero = "ini superhero kelelawar."
            ),
            superhero(
                R.drawable.spiderman,
                nameSuperhero = "spiderman",
                descSuperhero = "ini superhero laba laba."
            ),
            superhero(
                R.drawable.supemen,
                nameSuperhero = "superman",
                descSuperhero = "ini superhero yang super."
            )
        )

        val recyclerview = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.setHasFixedSize(true)
        recyclerview.adapter = SuperheroAdapter(this,superherolist){
            val intent = Intent(this,DetailSuperHeroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}