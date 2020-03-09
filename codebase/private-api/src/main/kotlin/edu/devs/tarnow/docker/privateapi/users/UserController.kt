package edu.devs.tarnow.docker.privateapi.users

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(private val userRepository: UserRepository) {

    @GetMapping
    fun list():List<User>{
        return userRepository.findAll()
    }

}