package edu.devs.tarnow.docker.users

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UsersAPI(val usersRepository: UsersRepository) {

    @GetMapping
    fun list(): List<User>? {
        val response = usersRepository.list().execute()
        return response.body()
    }


}