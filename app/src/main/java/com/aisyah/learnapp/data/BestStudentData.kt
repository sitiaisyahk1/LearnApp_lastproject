package com.aisyah.learnapp.data

import com.aisyah.learnapp.R
import com.aisyah.learnapp.model.liststudent.ModelStudent

object BestStudentData {
    private val name = arrayOf(
        "Dean Umainah",
        "Dhiaul Aulia",
        "Fatimah Adelia",
        "Nathania Safa",
    )
    private val rank = arrayOf(
        "Best on Web",
        "Best on UI/UX",
        "Best on Android",
        "Best on Web",
    )
    private val point = arrayOf(
        "5000",
        "4050",
        "3999",
        "3800",
    )
    private val like = arrayOf(
        "200",
        "148",
        "284",
        "194",
    )
    private val desc = arrayOf(
        "I've always wondered about the science I learned. I'm hungry for knowledge and I'm a good person. Greetings to :)",
        "Hey, I'm Junior UI/UX Designer and also Junior Android Developer. I love ui/ux so much. Please Support me to keeps Growing. Thank You,..",
        "Experimental, creative and simple!",
        "I'm junior web Developer, and i also love drawing. I have a lot experience in drawing",
    )
    private val img = intArrayOf(
        R.drawable.profile1,
        R.drawable.profile2,
        R.drawable.profile3,
        R.drawable.profile4
    )
    fun getListStudent() : ArrayList<ModelStudent> {
        val list = arrayListOf<ModelStudent>()
        for (position in BestStudentData.img.indices) {
            val student = ModelStudent()
            student.img = BestStudentData.img[position]
            student.name = BestStudentData.name[position]
            student.rank = BestStudentData.rank[position]
            student.point = BestStudentData.point[position]
            student.like = BestStudentData.like[position]
            student.desc = BestStudentData.desc[position]
            list.add(student)
        }
        return list
    }
}