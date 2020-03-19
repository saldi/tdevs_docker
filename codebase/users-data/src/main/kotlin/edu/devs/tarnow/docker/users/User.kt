package edu.devs.tarnow.docker.users

import javax.persistence.*

@Entity
@Table(name = "users")
data class User(
        @Id
        val id: String,
        @Column(name = "first_name")
        val firstName: String,
        @Column(name = "last_name")
        val lastName: String,
        @Column(name = "age")
        val age: Int
)