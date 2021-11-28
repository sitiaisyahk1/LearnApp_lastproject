package com.aisyah.learnapp.data

import com.aisyah.learnapp.R
import com.aisyah.learnapp.model.module.ModelModule

object ModuleMobileData {
    private val title = arrayOf(
        "Kotlin Essential",
        "Introduction Flutter",
        "Intermediate Kotlin",
        "Building Apps Flutter",
        "Retrofit With Kotlin"
    )
    private val lable = arrayOf(
        "ANDROID - Firyal",
        "ANDROID - Tiyas",
        "ANDROID - Firyal",
        "ANDROID - Tiyas",
        "ANDROID - Firyal"
    )
    private val category = arrayOf(
        "KOTLIN",
        "FLUTTER",
        "KOTLIN",
        "FLUTTER",
        "KOTLIN"
    )
    private val date = arrayOf(
        "15 Nov",
        "20 Nov",
        "25 Nov",
        "30 Nov",
        "5 Dec"
    )
    private val desc = arrayOf(
        "Kotlin, the powerful programming language from JetBrains, offers null safety, concise syntax, and 100% Java compatibility. Plus, its fully supported by Google for Android development. If you're looking to get up and running with this popular language, then this course is for you. Join instructor Troy Miles as he provides a comprehensive overview of what developers need to create command-line programs using the Kotlin programming language. Troy starts by covering the basics: data types and variables, how statements differ from expressions, and what the different types of expressions are. He then dives into all of the languages essential features, from functions and classes to coroutines, as well as how to effectively debug your Kotlin code.",
        "With all the different screen sizes and resolutions available, its difficult to build an app that works well on all devices. With Flutter, you can design beautiful, compatible apps with minimal effort. This course introduces developers to the benefits and basic anatomy of Flutter, so you can leverage this cross-platform mobile development framework to create your own elegant, natively compiled apps. Discover how to install the Flutter SDK and the tools you will need to develop and test Android and iOS apps—on Mac and Windows. Instructor Angela Yu also explains how to configure Android Studio to work seamlessly with Flutter.",
        "Kotlin is now officially supported by Google as an Android development language. If you are an intermediate developer interested in learning more about Kotlin, this course can help you get acquainted with this concise, fun language by learning about its efficiencies and power in Android development. The course begins with a general overview of what Kotlin has to offer, and then dives into a discussion of extension functions and properties, including how to leverage the Kotlin Android Extensions plugin. It also explains how to work with Anko, and provides an overview of some of the librarys main artifacts: commons, layouts, and coroutines. To wrap up, the course covers how to work with collections.",
        "With Flutter, the cross-platform mobile development framework, you can design beautiful apps with minimal effort. This explains how to create a basic app from scratch in Flutter. Learn how to set up your project, scaffold the app with widgets, and incorporate assets such as images and text. Instructor Angela Yu also explains how to deploy your app to Android and iOS devices for testing. Take the challenge at the end of the course to fully customize your app and practice your new Flutter skills.",
        "Many apps use your mobile phones internet connection to get data. On Android, the primary way that apps get and post data over the internet is with a library called Retrofit. This course shows you how to use Retrofit with idiomatic Kotlin code that you can apply directly to your Android app. Instructor Rahul Pandey covers everything you need to know to build rich, networked Android apps. Rahul starts with helping you understand APIs and their uses. He explains concurrency, coroutines in Kotlin, and how both can benefit your app. Rahul steps you through getting started with an Android Retrofit project, as well as retrieving and sending data and handling authentication in your Android app. Finally, Rahul covers several advanced configuration options related to Retrofit."
    )
    private val linkModule = arrayOf(
        "https://bit.ly/3cSfpOL",
        "https://bit.ly/3nZDk5q",
        "https://bit.ly/3I2IHJ4",
        "https://bit.ly/3cVtr24",
        "https://bit.ly/2ZuOTb7"
    )
    private val img = intArrayOf(
        R.drawable.mobile1,
        R.drawable.mobile2,
        R.drawable.mobile3,
        R.drawable.mobile4,
        R.drawable.mobile5
    )

    //Variable list data
    val listDataMobile: ArrayList<ModelModule>
        get() {
            val list = arrayListOf<ModelModule>()
            for (position in title.indices) {
                val module = ModelModule()
                module.img = img[position]
                module.title = title[position]
                module.lable = lable[position]
                module.category = category[position]
                module.date = date[position]
                module.description = desc[position]
                module.linkModule = linkModule[position]
                list.add(module)
            }
            return list
        }
}