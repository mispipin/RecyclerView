package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailSuperHeroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_super_hero)

        val superhero = intent.getParcelableExtra<superhero>(MainActivity.INTENT_PARCELABLE)

        val imgsuperhero = findViewById<ImageView>(R.id.img_item_photo)
        val namesuperhero = findViewById<TextView>(R.id.tv_item_name)
        val descsuperhero = findViewById<TextView>(R.id.tv_item_description)

        imgsuperhero.setImageResource(superhero?.imgSuperhero!!)
        namesuperhero.text = superhero.nameSuperhero
        descsuperhero.text = superhero.descSuperhero
    }
}