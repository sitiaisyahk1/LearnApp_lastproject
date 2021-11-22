package com.aisyah.learnapp.data

import com.aisyah.learnapp.R
import com.aisyah.learnapp.model.webmodule.ModelModule

object ModuleWebData {
    private val titleModule = arrayOf(
        "The Basics of Laravel 8",
        "Advance Laravel",
        "Building RESTful APIs in Laravel",
        "Building Laravel and Vue.js Web Apps",
        "Validation"
    )
    private val lableModule = arrayOf(
        "WEB - FIRYAL",
        "WEB - FIRYAL",
        "WEB - FIRYAL",
        "WEB - FIRYAL",
        "WEB - FIRYAL"
    )
    private val categoryModule = arrayOf(
        "WEB",
        "WEB",
        "WEB",
        "WEB",
        "WEB"
    )
    private val dateModule = arrayOf(
        "26 Aug",
        "6 Sep",
        "16 Sep",
        "26 Sep",
        "4 Oct"
    )
    private val descModule = arrayOf(
        "APIs serve as a bridge between different applications or systems, allowing us to efficiently share our data with the world. REST, an architectural style that defines how to build APIs, is popular, modern, and lightweight. \n" +
                "In this course, discover how to create a RESTful API of your own. Join instructor Zuzana Kunckova as she demonstrates how to build a RESTful API using Laravel, the popular PHP framework. \n" +
                "Learn how to set up your application, including how to create the database structure and set up RESTful API routes. Discover how to build your RESTful API and save, display, update, and delete resources Plus, explore how to use Postman to test your API and ensure that it works as expected.",
        "Laravel is one of today most popular PHP frameworks for building elegant applications. In this course, learn how to get the most out of Laravel when working with controllers, routes, views, and the Eloquent ORM. \n" +
                "Instructor Justin Yost steps through how to build a new Laravel application, exploring a variety of features along the way that you can leverage to work smarter with the framework. \n" +
                "Get advanced tips for iterating a collection, working with the Blade templating engine, building middleware, and more.",
        "APIs serve as a bridge between different applications or systems, allowing us to efficiently share our data with the world. REST, an architectural style that defines how to build APIs, is popular, modern, and lightweight. \n" +
                "In this course, discover how to create a RESTful API of your own. Join instructor Zuzana Kunckova as she demonstrates how to build a RESTful API using Laravel, the popular PHP framework. Learn how to set up your application, including how to create the database structure and set up RESTful API routes.\n" +
                "iscover how to build your RESTful API and save, display, update, and delete resources Plus, explore how to use Postman to test your API and ensure that it works as expected.",
        "Vue.js ships with Laravel, the hugely popular PHP web framework. But using this front-end framework along with Laravel to build full-stack web applications comes with its own set of challenges. \n" +
                "In this project-based course, instructor Michael Sullivan steps through how to work with Vue.js and Laravel to create elegant, real-world apps. \n" +
                "As he shows how to build a content management tool for a restaurant menu, Michael demonstrates how to scaffold an authentication system, build an embedded SPA with Vue Router, manage state complexity using Vuex, and more.",
        "Laravel is the most popular MVC framework for PHP. It builds on PHP standards and conventions, making it easy to create completely customizable, full-featured apps. /n\n" +
                "In this course—the second installment in the Laravel 6 Essential Training series, instructor Justin Yost continues to cover the essentials of working with Laravel 6 as he demonstrates how to build a basic Laravel application to manage a hotel reservation system. \n" +
                "Justin explains how to run console commands, add the ability to save images, work with the Laravel service container, write tests in Laravel, write and send emails using your app, and manage user authentication. These videos provide the information you need to make a move to Laravel and build high-quality, scalable, and sound PHP applications."
    )
    private val linkModule = arrayOf(
        "link1",
        "link2",
        "link3",
        "link4",
        "link5"
    )
    private val imgModule = intArrayOf(
        R.drawable.img_weblist,
        R.drawable.imgw2,
        R.drawable.imgw3,
        R.drawable.imgw4,
        R.drawable.imgw5
    )

    //Variable list data
    val listDataWeb: ArrayList<ModelModule>
    get() {
        val list = arrayListOf<ModelModule>()
        for (position in titleModule.indices) {
            val module = ModelModule()
            module.img = imgModule[position]
            module.title = titleModule[position]
            module.lable = lableModule[position]
            module.category = categoryModule[position]
            module.date = dateModule[position]
            module.description = descModule[position]
            module.linkModule = linkModule[position]
            list.add(module)
        }
        return list
    }
}