package com.project.viewpager.Fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.project.viewpager.DataList
import com.project.viewpager.DataList.listData
import com.project.viewpager.NewList

import com.project.viewpager.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {
    private lateinit var rvList: RecyclerView
    private var list: ArrayList<NewList> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        rvList = view.findViewById(R.id.rv_list)
        rvList.layoutManager = LinearLayoutManager(activity)
        rvList.setHasFixedSize(false)
        list.clear()
        list.addAll(listData)
        rvList.adapter = com.project.viewpager.Adapter.ListAdapter(list)


        return view
    }

}


