package com.aisyah.learnapp.data

import com.aisyah.learnapp.R
import com.aisyah.learnapp.model.module.ModelModule

object ModuleBkData {
    private val title = arrayOf(
        "Tes MBTI",
        "4 Jenis Kepribadian Manusia secara Psikologis",
        "Orientasi Seksual",
        "Mengatasi Jenuh Belajar Saat Daring",
        "Kesenjangan sosial"
    )
    private val lable = arrayOf(
        "BK - Riska",
        "BK - Riska",
        "BK - Riska",
        "BK - Riska",
        "BK - Riska"
    )
    private val category = arrayOf(
        "BK",
        "BK",
        "BK",
        "BK",
        "BK"
    )
    private val date = arrayOf(
        "15 Nov",
        "20 Nov",
        "25 Nov",
        "30 Nov",
        "5 Dec"
    )
    private val desc = arrayOf(
        "(Myers-BirggsType Indicator) merupakan tes kepribadian yang dirancang dengan tujuan untuk mengkategorikan individu-individu berdasarkan cara mereka berpikir dan bertingkah laku. Tes ini membagi kepribadian seseorang berdasarkan 4 dimensi dari sifat dasar manusia yang dikategorikan lagi menjadi 8 jenis. Dimensi pemusatan perhatian Introvert (I) vs Extravert (E), dimensi menerima informasi dari luarIntuition (N) vs Sensing (S), dimensi menarik keputusan dan kesimpulan Thinking (T) vs Feeling (F), dandimensi pola hidup Judging (J) vs Perceiving (P).",
        "Pada umumnya manusia memiliki beragam karakter dan sifat yang berbeda-beda. Biasanya orang lebih mengenal sebutan introvert, ekstrovert dan ambivert sebagai kategori kepribadian. Namun sebenarnya, ilmu psikologi memiliki teori yang luas dan bermacam-macam. Kemudian pendapat tersebut dikembangkan oleh Galenus yang mengemukakan adanya dominasi antara salah satu unsur dengan unsur lainnya sehingga muncul kepribadian khas pada diri seseorang. Teori ini akhirnya dikenal sebagai teori Hippocrates-Galenus.",
        "Orientasi seksual adalah ketertarikan emosional, seksual, dan romantisme yang dirasakan seorang individu terhadap individu lain. Menurut ahli, orientasi seksual bukanlah sesuatu yang dipilih seorang individu. Dengan begitu, pakar sepakat bahwa orientasi seksual seseorang tidak dapat diubah.",
        "Mengatasi rasa jenuh siswa dalam belajar sudah menjadi satu tantangan. Tantangan lainnya yang harus segera diselesaikan adalah mengatasi kejenuhan mengajar bagi guru. Nah, jika Guru Pintar mulai merasa Bosan atau jenuh saat mengajar, tidak ada salahnya mencoba jurus berikut ini untuk Kembali mengobarkan semangat mengajar dan mengusir rasa bosan.",
        "Pengertian Kesenjangan Sosial – Kesenjangan sosial merupakan suatu kondisi dimana ada hal yang tidak seimbang di dalam kehidupan masyarakat. Entah itu secara personal maupun kelompok. Dimana ada ketimpangan sosial yang terbentuk dari sebuah ketidakadilan distribusi banyak hal yang dianggap penting oleh masyarakat."
    )
    private val linkModule = arrayOf(
        "https://bit.ly/3CXFir7",
        "https://bit.ly/3HWN880",
        "https://bit.ly/3p2jLss",
        "https://bit.ly/3cSmNcO",
        "https://bit.ly/3nZrxnD"
    )
    private val img = intArrayOf(
        R.drawable.img_weblist,
        R.drawable.imgw2,
        R.drawable.imgw3,
        R.drawable.imgw4,
        R.drawable.imgw5
    )

    //Variable list data
    val listDataBk: ArrayList<ModelModule>
        get() {
            val list = arrayListOf<ModelModule>()
            for (position in ModuleBkData.title.indices) {
                val module = ModelModule()
                module.img = ModuleBkData.img[position]
                module.title = ModuleBkData.title[position]
                module.lable = ModuleBkData.lable[position]
                module.category = ModuleBkData.category[position]
                module.date = ModuleBkData.date[position]
                module.description = ModuleBkData.desc[position]
                module.linkModule = ModuleBkData.linkModule[position]
                list.add(module)
            }
            return list
        }

}