package com.sahilpc.navigation

sealed class NavigationFlow {
    object HomeFlow : NavigationFlow()
    object ExploreFlow : NavigationFlow()
    object ProfileFlow : NavigationFlow()
    object RecentFlow : NavigationFlow()
}