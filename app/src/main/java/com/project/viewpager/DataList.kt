package com.project.viewpager

object DataList {
    private val nameList = arrayOf("satu", "Dua", "Tiga", "Empat", "Lima" , "Mostafa" , "Sou")

    private val deskripsiList = arrayOf(
        "ini deskripsi satu",
        "ini deskripsi dua",
        "ini deskripsi tiga",
        "ini deskripsi empat",
        "ini deskripsi lima" ,
        "ini deskripsi Mostafa" ,
        "ini deskripsi Sou"
        )

    val listData: ArrayList<NewList>
        get() {
            val listt = arrayListOf<NewList>()
            for (position in nameList.indices) {
                val list2 = NewList()
                list2.name = nameList[position]
                list2.desk = deskripsiList[position]
                listt.add(list2)
            }
            return listt
        }
}