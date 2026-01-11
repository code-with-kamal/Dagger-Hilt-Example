package com.kamal.daggerhiltexample

import com.kamal.daggerhiltexample.data.User
import kotlinx.coroutines.delay
import javax.inject.Inject

class FakeApiService @Inject constructor() {

    suspend fun getUsers(): List<User> {
        delay(1500) // simulate network delay
        return listOf(
            User(1, "Kamal Kant", "kamal@gmail.com"),
            User(2, "Rahul", "rahul@gmail.com"),
            User(3, "Amit", "amit@gmail.com")
        )
    }
}
