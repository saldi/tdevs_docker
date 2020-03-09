package edu.devs.tarnow.docker.publicapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PublicApiApplication

fun main(args: Array<String>) {
	runApplication<PublicApiApplication>(*args)
}
