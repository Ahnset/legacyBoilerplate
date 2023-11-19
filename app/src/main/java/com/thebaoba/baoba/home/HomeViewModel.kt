package com.thebaoba.baoba.home

import androidx.lifecycle.ViewModel
import com.thebaoba.baoba.util.ApiService
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val apiService: ApiService
) : ViewModel() {

    fun getProgrammingLanguages() =
        apiService.getProgrammingLanguages()
}