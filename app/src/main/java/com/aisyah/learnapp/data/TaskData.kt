package com.aisyah.learnapp.data

import android.util.Log
import com.aisyah.learnapp.R
import com.aisyah.learnapp.model.listtask.ModelTask

object TaskData {
    private val title = arrayOf(
        "Build Database Library",
        "Design Wireframe Login",
        "Retrofit with Kotlin",
        "Design Poster Al Fatihah",
        "Presentation Fiqih"
    )
    private val category = arrayOf(
        "WEB",
        "UI/UX",
        "MOBILE",
        "DINIYAH",
        "DINIYAH"
    )
    private val time = arrayOf(
        "16 hours",
        "24 hours",
        "2 days",
        "3 days",
        "4 days"
    )
    private val desc = arrayOf(
        "1. Terdapat teks bahasa Arab \n" +
                "2. Mencantumkan surah Al - Fatihah \n" +
                "3. Terdapat arti pada setiap Ayatnya \n" +
                "4. Format pengumpulan tugas ( Nama_Poster Al Fatihah ) \n" +
                "5. Desain harus rapih dan dapat dibaca",
        "1. Terdapat teks bahasa Arab \n" +
                "2. Mencantumkan surah Al - Fatihah \n" +
                "3. Terdapat arti pada setiap Ayatnya \n" +
                "4. Format pengumpulan tugas ( Nama_Poster Al Fatihah ) \n" +
                "5. Desain harus rapih dan dapat dibaca",
        "1. Terdapat teks bahasa Arab \n" +
                "2. Mencantumkan surah Al - Fatihah \n" +
                "3. Terdapat arti pada setiap Ayatnya \n" +
                "4. Format pengumpulan tugas ( Nama_Poster Al Fatihah ) \n" +
                "5. Desain harus rapih dan dapat dibaca",
        "1. Terdapat teks bahasa Arab \n" +
                "2. Mencantumkan surah Al - Fatihah \n" +
                "3. Terdapat arti pada setiap Ayatnya \n" +
                "4. Format pengumpulan tugas ( Nama_Poster Al Fatihah ) \n" +
                "5. Desain harus rapih dan dapat dibaca",
        "1. Terdapat teks bahasa Arab \n" +
                "2. Mencantumkan surah Al - Fatihah \n" +
                "3. Terdapat arti pada setiap Ayatnya \n" +
                "4. Format pengumpulan tugas ( Nama_Poster Al Fatihah ) \n" +
                "5. Desain harus rapih dan dapat dibaca"
    )
    private val img = intArrayOf(
        R.drawable.web4,
        R.drawable.uiux2,
        R.drawable.mobile4,
        R.drawable.diniyah4,
        R.drawable.diniyah2
    )

    fun getListTask() : ArrayList<ModelTask> {
        val list = arrayListOf<ModelTask>()
        for (position in img.indices) {
            val task = ModelTask()
            task.img = img[position]
            task.category = category[position]
            task.title = title[position]
            task.time = time[position]
            list.add(task)
        }
        Log.d("cobabeda", "$list")
        return list
    }

}