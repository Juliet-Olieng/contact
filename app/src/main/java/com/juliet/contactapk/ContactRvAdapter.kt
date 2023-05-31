package com.juliet.contactapk

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.juliet.contactapk.databinding.ContactListBinding

//class ContactRvAdapter(var contactList: List<ContactData>):RecyclerView.Adapter<ContactViewHolder>() {
//}
class ContactRvAdapter(var contactList: List<ContactData>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding = ContactListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
    var currentContact=contactList.get(position)
        holder.binding.tvName.text=currentContact.name
        holder.binding.tvEmail.text=currentContact.emailAddress
        holder.binding.tvNumber.text=currentContact.phoneNumber
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

}
class ContactViewHolder(var binding: ContactListBinding):ViewHolder(binding.root){}