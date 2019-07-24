package com.example.recyclerviewdemo2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    private val contactList : ArrayList<Contacts> = ArrayList()
    private var mAdapter : CustomContactAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("Main Activity" , "[ OnCreate ]")
        CreateData()//store data in contact list
        this.mAdapter = CustomContactAdapter(contactList)//create adapter object and pass contact list into it
        RecyclerView_main.layoutManager =LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false )
        RecyclerView_main.adapter = this.mAdapter
    }
     fun CreateData (){
         this.contactList.add(Contacts("Nalin Sharma " ,"912313241098" ,"24/10/1998"))
         this.contactList.add(Contacts("Varun Kumar " ,"92313567098" ,"24/10/1998"))
         this.contactList.add(Contacts("Om Prakash " ,"9413444098" ,"24/10/1998"))
         this.contactList.add(Contacts("Rohit Gupta " ,"9232361098" ,"24/10/1998"))
         this.contactList.add(Contacts("Nishit " ,"9232345344341098" ,"24/10/1998"))
         this.contactList.add(Contacts("Chulbul Pandey " ,"9353551098" ,"24/10/1998"))
         this.contactList.add(Contacts("Unknown " ,"944253343098" ,"24/10/1998"))

     }

}