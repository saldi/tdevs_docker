package edu.devs.tarnow.docker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PrivateApiApplication

fun main(args: Array<String>) {
	runApplication<PrivateApiApplication>(*args)
}
