package com.sahilpc.navigation

import androidx.navigation.NavController

class Navigator {
    lateinit var navController: NavController

    // navigate on main thread or nav component crashes sometimes
    fun navigateToFlow(navigationFlow: NavigationFlow) = when (navigationFlow) {
        NavigationFlow.HomeFlow -> navController.navigate(R.id.action_global_home_flow)
        is NavigationFlow.ExploreFlow -> navController.navigate(R.id.action_global_explore_flow)
        is NavigationFlow.ProfileFlow -> navController.navigate(R.id.action_global_profile_flow)
        is NavigationFlow.RecentFlow -> navController.navigate(R.id.action_global_recent_flow)
    }
}