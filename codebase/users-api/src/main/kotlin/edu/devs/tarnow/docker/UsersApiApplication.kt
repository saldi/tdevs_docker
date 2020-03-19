package edu.devs.tarnow.docker

import edu.devs.tarnow.docker.conf.UsersDataConfigurationData
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(UsersDataConfigurationData::class)
class UsersApiApplication

fun main(args: Array<String>) {
    runApplication<UsersApiApplication>(*args)
}
