package com.github.lucaengel.calorytracker.navigation

import androidx.navigation.NavController
import com.github.lucaengel.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}