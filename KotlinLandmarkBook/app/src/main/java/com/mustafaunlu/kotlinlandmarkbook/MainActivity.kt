package com.mustafaunlu.kotlinlandmarkbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.mustafaunlu.kotlinlandmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var personArrayList: ArrayList<Person>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        personArrayList=ArrayList<Person>()

        //Data

        val malcolm=Person("Malcolm X","ABD",R.drawable.malcolm)
        val selcuk=Person("Selçuk Bayraktar","Turkey",R.drawable.selcuk)
        val fatih=Person("Fatih Sultan Mehmed","Turkey",R.drawable.fatih)
        val aliya=Person("Aliya İzzetbegovic","Bosnia and Herzegovina",R.drawable.aliya)

        //Push data to arraylist

        personArrayList.add(malcolm)
        personArrayList.add(selcuk)
        personArrayList.add(fatih)
        personArrayList.add(aliya)

        //ListView (Kullanışsız yöntem) - Mapping

        /*val adapter=ArrayAdapter(this.applicationContext,R.layout.support_simple_spinner_dropdown_item,personArrayList.map { person -> person.name })

        binding.listView.adapter=adapter

        binding.listView.setOnItemClickListener { parent, view, position, id ->
        val intent= Intent(MainActivity@this,DetailsActivity::class.java)
            intent.putExtra("person",personArrayList.get(position))
            startActivity(intent)

        }*/
        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        val landmarkAdapter=PersonAdapter(personArrayList)
        binding.recyclerView.adapter=landmarkAdapter



    }
}