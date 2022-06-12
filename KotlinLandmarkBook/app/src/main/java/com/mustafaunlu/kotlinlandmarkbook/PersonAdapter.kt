package com.mustafaunlu.kotlinlandmarkbook

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import com.mustafaunlu.kotlinlandmarkbook.databinding.RecyclerRowBinding

class PersonAdapter(val personArrayList: ArrayList<Person>) : RecyclerView.Adapter<PersonAdapter.PersonHolder>() {









    class PersonHolder(val binding: RecyclerRowBinding): RecyclerView.ViewHolder(binding.root){

    }
    //Layout ile bağlama işlemi
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonHolder {
        val binding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PersonHolder(binding)
    }
    //Bağlama işleminden sonra ne olacak
    override fun onBindViewHolder(holder: PersonHolder, position: Int) {
        holder.binding.recyclerViewTextView.text=personArrayList.get(position).name

        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("person",personArrayList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return personArrayList.size
    }

}