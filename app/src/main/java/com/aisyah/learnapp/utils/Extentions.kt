package com.aisyah.learnapp.utils

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.navigation.ActivityNavigator
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import com.aisyah.learnapp.R

fun onNavDestinationSelected(
    itemId: Int,
    navController: NavController
): Boolean {
    val builder = NavOptions.Builder()
        .setLaunchSingleTop(true)
    if (navController.currentDestination!!.parent!!.findNode(itemId) is ActivityNavigator.Destination) {  //tanda seru maksa jadi kasi tanda tanya
        builder.setEnterAnim(R.anim.nav_default_enter_anim)
            .setExitAnim(R.anim.nav_default_exit_anim)
            .setPopEnterAnim(R.anim.nav_default_pop_enter_anim)
            .setPopExitAnim(R.anim.nav_default_pop_exit_anim)
    } else {
        builder.setEnterAnim(R.animator.nav_default_enter_anim)
            .setExitAnim(R.animator.nav_default_exit_anim)
            .setPopEnterAnim(R.animator.nav_default_pop_enter_anim)
            .setPopExitAnim(R.animator.nav_default_pop_exit_anim)
    }
    //if (itemId == getChildAt(0).id) {
    //builder.setPopUpTo(findStartDestination(navController.graph)!!.id, true)
    // }
    builder.setPopUpTo(itemId, true)
    val options = builder.build()
    return try {
        navController.navigate(itemId, null, options)
        true
    } catch (e: IllegalArgumentException) {
        false
    }
}

fun Context.getColors(): IntArray {
    return intArrayOf(
        ContextCompat.getColor(this, R.color.home),
        ContextCompat.getColor(this, R.color.logger),
        ContextCompat.getColor(this, R.color.documents),
        ContextCompat.getColor(this, R.color.settings),
        ContextCompat.getColor(this, R.color.home)
    )
}