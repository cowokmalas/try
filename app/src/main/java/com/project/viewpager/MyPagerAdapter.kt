package com.project.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.RecyclerView
import com.project.viewpager.Fragment.FirstFragment
import com.project.viewpager.Fragment.SeccondFragment
import com.project.viewpager.Fragment.ThridFragment

class MyPagerAdapter (fm:FragmentManager):FragmentPagerAdapter(fm) {
    private lateinit var rvList:RecyclerView
    private var list:ArrayList<NewList> = arrayListOf()

    //sebuah list menampung fragment
    private val page = listOf(
        FirstFragment(),
        SeccondFragment(),
        ThridFragment()
    )

    //Menentukan fragment yang akan di buka pada posisi tertentu
    override fun getItem(position: Int): Fragment {
        return page[position]
    }

    override fun getCount(): Int {
        return page.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "First Tab"
            1 -> "Second Tab"
            else -> "Thrid Tab"
        }


    }
}
