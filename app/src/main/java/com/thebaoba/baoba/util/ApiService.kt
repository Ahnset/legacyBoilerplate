package com.thebaoba.baoba.util

import javax.inject.Inject

class ApiService @Inject constructor() {

    fun getProgrammingLanguages() = listOf("Kotlin", "Java", "Swift", "JavaScript", "C++")
}