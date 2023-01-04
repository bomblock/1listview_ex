package com.example.listview_ex

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class ListViewAdapter (val List : MutableList<String>) : BaseAdapter() {
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(position: Int): Any {
        return List[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var convertView == convertView

        if (convertView == null){
            converView = Laoutin
        }

    }
}