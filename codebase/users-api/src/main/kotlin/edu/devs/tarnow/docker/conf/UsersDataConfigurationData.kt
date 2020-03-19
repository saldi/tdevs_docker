package edu.devs.tarnow.docker.conf

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding


@ConstructorBinding
@ConfigurationProperties(prefix = "users.data.api")
data class UsersDataConfigurationData(val url: String)