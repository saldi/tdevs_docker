package edu.devs.tarnow.docker.users

import edu.devs.tarnow.docker.conf.UsersDataConfigurationData
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Configuration
class UserApiConfiguration {

    @Bean
    fun retrofit(config: UsersDataConfigurationData): Retrofit {
        return Retrofit.Builder()
                .addConverterFactory(MoshiConverterFactory.create())
                .baseUrl(config.url).build()
    }

    @Bean
    fun usersRepository(retrofit: Retrofit): UsersRepository {
        return retrofit.create(UsersRepository::class.java)
    }


}