package com.aisyah.learnapp.data

import com.aisyah.learnapp.R
import com.aisyah.learnapp.model.liststudent.ModelStudent

object TopStudentData {
    private val name = arrayOf(
        "Siti Aisyah",
        "Zakia Hasna",
        "Putya Sekar Ayu",
        "Nisa Jamalia",
    )
    private val rank = arrayOf(
        "TOP 1  |  Class 12",
        "TOP 2  |  Class 12",
        "TOP 3  |  Class 12",
        "TOP 4  |  Class 12",
    )
    private val point = arrayOf(
        "7030",
        "6750",
        "6550",
        "6450",
    )
    private val like = arrayOf(
        "400",
        "387",
        "390",
        "330",
    )
    private val desc = arrayOf(
        "I've always wondered about the science I learned. I'm hungry for knowledge and I'm a good person. Greetings to :)",
        "Hey, I'm Junior UI/UX Designer and also Junior Android Developer. I love ui/ux so much. Please Support me to keeps Growing. Thank You,..",
        "Experimental, creative and simple!",
        "I'm junior web Developer, and i also love drawing. I have a lot experience in drawing",
    )
    private val img = intArrayOf(
        R.drawable.top1,
        R.drawable.top2,
        R.drawable.top3,
        R.drawable.top4
    )

    fun getListStudent() : ArrayList<ModelStudent> {
        val list = arrayListOf<ModelStudent>()
        for (position in TopStudentData.img.indices) {
            val student = ModelStudent()
            student.img = TopStudentData.img[position]
            student.name = TopStudentData.name[position]
            student.rank = TopStudentData.rank[position]
            student.point = TopStudentData.point[position]
            student.like = TopStudentData.like[position]
            student.desc = TopStudentData.desc[position]
            list.add(student)
        }
        return list
    }
}