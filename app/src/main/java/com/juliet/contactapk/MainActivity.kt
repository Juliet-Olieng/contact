package com.juliet.contactapk

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.juliet.contactapk.databinding.ActivityMainBinding
import com.juliet.contactapk.databinding.ContactListBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContact()
    }


    fun displayContact() {
        var contact1 = ContactData("daddy", "nicholas@gmail.com", "+254723469938","")
        var contact2 = ContactData("phelix", "phaliza@gmail.com", "+254703728432","")
        var contact3 = ContactData("dester", "dester@gmail.com", "+254703924627","")
        var contact4 = ContactData("juliet", "juliet@gmail.com", "+254718492299","")
        var contact5 = ContactData("teves", "teves@gmail.com", "+254718493474","")
        var contact6 = ContactData("tamara", "tamara@gmail.com", "+254718494523","")
        var contact7 = ContactData("wein", "wein@gmail.com", "+254718497733","")
        var contactlists = listOf<ContactData>(contact1, contact2, contact3, contact4,contact5,contact6,contact7)
        binding.rvContact.layoutManager = LinearLayoutManager(this)
        var contactAdapter = ContactRvAdapter(contactlists)
        binding.rvContact.adapter = contactAdapter

    }
}