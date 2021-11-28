package com.aisyah.learnapp.data

import com.aisyah.learnapp.R
import com.aisyah.learnapp.model.module.ModelModule

object ModuleDiniyahData {
    private val title = arrayOf(
        "Fiqih",
        "Adab",
        "Tafsir An - Naba",
        "Tafsir An - Naziat",
        "Tafsir Abasa"
    )
    private val lable = arrayOf(
        "FIQIH - Dea",
        "ADAB - Iffah",
        "TAFSIR - Tri",
        "TAFSIR - Tri",
        "TAFSIR - Tri"
    )
    private val category = arrayOf(
        "DINIYAH",
        "DINIYAH",
        "DINIYAH",
        "DINIYAH",
        "DINIYAH"
    )
    private val date = arrayOf(
        "15 Nov",
        "20 Nov",
        "25 Nov",
        "30 Nov",
        "5 Dec"
    )
    private val desc = arrayOf(
        "Fikih ( bahasa Arab: فقه, translit. fiqh) adalah salah satu bidang ilmu dalam syariat Islam yang secara khusus membahas persoalan hukum yang mengatur berbagai aspek kehidupan manusia, baik kehidupan pribadi, bermasyarakat maupun kehidupan manusia dengan Allah, Tuhannya.",
        "Adab berasal dari bahasa arab yang artinya pendidikan atau mendidik. Sedangkan menurut bahasa Yunani, adab artinya kebiasaan atau etika. Pada intinya, adab adalah sebuah perilaku yang menunjukkan kehalusan dan kebaikan budi pekerti; kesopanan; akhlak untuk mendidik diri sendiri agar menjadi orang yang paham aturan dan bertanggungjawab.",
        "(An-Naba: 7) Dia menjadikan pada bumi pasak-pasak untuk menstabilkan dan mengokohkannya serta memantapkannya sehingga bumi menjadi tenang dan tidak mengguncangkan orang-orang dan makhluk yang ada di atasnya. Kemudian Allah Swt. berfirman: dan Kami jadikan kalian berpasang-pasangan. (An-Naba: 8)",
        "Tafseer Surah An-Naziat By those (angels) who pull out (the souls of the disbelievers and wicked) with great violence having dived in An-Naziat comes from the word naza‘a which means to yank out with great force. Here, Allah (swt) swears by the ones who yank out.",
        "('Abasa: 7) Artinya, kamu tidak akan bertanggungjawab mengenainya bila dia tidak mau membersihkan dirinya (beriman). Dan adapun orang yang datang kepadamu dengan bersegera (untuk mendapatkan pengajaran), sedangkan ia takut (kepada Allah). (‘Abasa: 8-9) Yakni dengan sengaja datang kepadamu untuk mendapat petunjuk dari pengarahanmu kepadanya."
    )
    private val linkModule = arrayOf(
        "https://bit.ly/3xrEl9g",
        "https://redirect.is/jygi0yw",
        "https://redirect.is/653tbnc",
        "https://redirect.is/mx0cczv",
        "https://redirect.is/dce255s"
    )
    private val img = intArrayOf(
        R.drawable.bk1,
        R.drawable.bk2,
        R.drawable.bk3,
        R.drawable.bk4,
        R.drawable.bk5
    )
    //Variable list data
    val listDataDiniyah: ArrayList<ModelModule>
        get() {
            val list = arrayListOf<ModelModule>()
            for (position in ModuleDiniyahData.title.indices) {
                val module = ModelModule()
                module.img = ModuleDiniyahData.img[position]
                module.title = ModuleDiniyahData.title[position]
                module.lable = ModuleDiniyahData.lable[position]
                module.category = ModuleDiniyahData.category[position]
                module.date = ModuleDiniyahData.date[position]
                module.description = ModuleDiniyahData.desc[position]
                module.linkModule = ModuleDiniyahData.linkModule[position]
                list.add(module)
            }
            return list
        }
}