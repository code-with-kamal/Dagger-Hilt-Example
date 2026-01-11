package com.kamal.daggerhiltexample

import com.kamal.daggerhiltexample.data.User

data class UserUiState(
    val isLoading: Boolean = false,
    val users: List<User> = emptyList(),
    val error: String? = null
)
