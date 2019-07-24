package com.example.recyclerviewdemo2

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.contact_list.view.*

class CustomContactAdapter(contactList : ArrayList<Contacts>) : RecyclerView.Adapter<CustomContactAdapter.MyViewHolder>(){

    private var contactList : ArrayList<Contacts> = ArrayList<Contacts>()

    init {//initialize class property contact list
        this.contactList = contactList
    }

    //creates and inflates ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        Log.v("Adapter class" , "[ onCreateViewHolder ]")
        //inflating a
        var itemView : View = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        Log.v("Adapter class" , "[ getItemCount ]")
        return contactList.size
    }


    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
    // 3 variables for 3 views in view holder
        var name : TextView
        var number : TextView
        var addedOn : TextView
        init {
            Log.v("Adapter class", "inside ViewHolder")
            this.name= itemView.textView
            this.number= itemView.textView2
            this.addedOn=itemView.textView3
        }

    }
    //bind data to views associated with the ViewHolder
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Log.v("Adapter class" , "[ onBindViewHolder ]")
        var contact : Contacts = contactList[position]
        holder.name.setText(contact.mName)
        holder.addedOn.setText(contact.mAddedOn)
        holder.number.setText(contact.mNumber)

    }



}