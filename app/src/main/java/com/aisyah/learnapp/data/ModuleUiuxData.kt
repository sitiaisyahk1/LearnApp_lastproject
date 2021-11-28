package com.aisyah.learnapp.data

import com.aisyah.learnapp.R
import com.aisyah.learnapp.model.module.ModelModule

object ModuleUiuxData {
    private val title = arrayOf(
        "Became UX Designer",
        "What is UI/UX?",
        "Principle for UX Design",
        "Figma",
        "Adobe XD"
    )
    private val lable = arrayOf(
        "UI/UX - Annisah",
        "UI/UX - Annisah",
        "UI/UX - Annisah",
        "UI/UX - Annisah",
        "UI/UX - Annisah"
    )
    private val category = arrayOf(
        "UI/UX",
        "UI/UX",
        "UI/UX",
        "UI/UX",
        "UI/UX"
    )
    private val date = arrayOf(
        "15 Nov",
        "20 Nov",
        "25 Nov",
        "30 Nov",
        "5 Dec"
    )
    private val desc = arrayOf(
        "A modern user experience designer understands modern design concepts. They also have the research and analysis skills to design effective, compelling digital experiences across different mobile platforms, the web, and the Internet of things. This path will help you build the foundation for a solid career in UX design.",
        "As a graphic designer, you have a knack for creative problem-solving, a keen understanding of color and layout, and the ability to collaborate with clients—skills that could easily translate to user experience (UX) and user interface (UI) design. If you want to enrich your professional skill set with UX and UI design experience, then this course can help by acquainting you with the techniques and technology you'd need to be successful. Join instructor Paul Trani as he covers essential UI and UX design concepts and steps through how to create and share a prototype using Adobe XD CC. Throughout the course, Paul highlights UX design workflows and best practices within this innovative design and prototyping tool.",
        "Principle for Mac is a Macintosh-based UX prototyping tool designed to bring your design ideas to life. In this course, join instructor Tom Green as he shows how to create interactive prototypes for smartphones, tablets, and desktop computers with Principle. The techniques go beyond static wireframes or blueprints; with Principle, your prototypes become more dynamic, with motion and interactivity. Along the way, learn how to import assets, crop and mask layers, and use the Principle timeline and drivers. The final chapter of the course includes examples of real-world prototyping projects, including a preloader animation, a card animation, a video player, and an Apple Watch UI.",
        "Learn how to use Figma, the collaborative interface design tool. This course introduces the features and concepts you will need to know to start your first user experience (UX) design project in Figma. Find out how to create new files, segment your project for multiple screens and devices, and start adding content, including shapes, images, drawing, effects, and text. Instructor Brian Wood then shows how to work smarter—not harder—using Figma features like layers, reusable formatting, and components. In the final chapters, you can add interactions to the mix to build functional prototypes that really tell the whole story of your design to collaborators and clients.",
        "Adobe XD CC is an innovative tool used for UI and UX design and prototyping. In this course, instructor Tom Green provides an overview of the features and functionality in this design and prototyping tool, as well as how it can help you design compelling digital experiences. Tom gives a tour of its capabilities and features and shows the different ways you can share your prototypes. Plus, he covers productivity-boosting features like 3D Transforms and new voice options, explains how to go from concept to interactive prototype, and more."
    )
    private val img = intArrayOf(
        R.drawable.uiux1,
        R.drawable.uiux2,
        R.drawable.uiux3,
        R.drawable.uiux4,
        R.drawable.uiux5
    )

    private val linkModule = arrayOf(
        "https://bit.ly/3DYedoU",
        "https://bit.ly/316GawG",
        "https://bit.ly/3rcbx3p",
        "https://bit.ly/3d0zEK1",
        "https://bit.ly/30YCg9b"
    )

    //Variable list data
    val listDataUiux: ArrayList<ModelModule>
        get() {
            val list = arrayListOf<ModelModule>()
            for (position in ModuleUiuxData.title.indices) {
                val module = ModelModule()
                module.img = ModuleUiuxData.img[position]
                module.title = ModuleUiuxData.title[position]
                module.lable = ModuleUiuxData.lable[position]
                module.category = ModuleUiuxData.category[position]
                module.date = ModuleUiuxData.date[position]
                module.description = ModuleUiuxData.desc[position]
                module.linkModule = ModuleUiuxData.linkModule[position]
                list.add(module)
            }
            return list
        }
}