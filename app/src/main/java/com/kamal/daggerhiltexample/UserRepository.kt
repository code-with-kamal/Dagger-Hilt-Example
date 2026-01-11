package com.kamal.daggerhiltexample

import com.kamal.daggerhiltexample.data.User
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val api: FakeApiService
) {
    suspend fun fetchUsers(): List<User> {
        return api.getUsers()
    }
}
