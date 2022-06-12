package com.mustafaunlu.kotlinlandmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mustafaunlu.kotlinlandmarkbook.databinding.ActivityMainBinding
import com.mustafaunlu.kotlinlandmarkbook.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding:ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDetailsBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        val intent=intent
        //casting --> as Person olarak kullanıldı
        val selectedPerson=intent.getSerializableExtra("person") as Person
        binding.nameText.text=selectedPerson.name
        binding.countryText.text=selectedPerson.country
        binding.imageView.setImageResource(selectedPerson.image)

    }
}