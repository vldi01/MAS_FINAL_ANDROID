package com.example.mas_final.data.dao

import com.example.mas_final.data.dto.LoginInfoDTO
import com.example.mas_final.data.dto.PersonDTO
import com.example.mas_final.data.dto.TokenDTO
import com.example.mas_final.data.dto.VAResponseDTO
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface PersonDao {
    @GET("api/accounts/checkEmail")
    suspend fun checkEmail(@Query(value = "email") email: String): VAResponseDTO<Boolean>?

    @POST("api/accounts/register")
    suspend fun register(@Body person: PersonDTO): VAResponseDTO<TokenDTO>

    @POST("api/accounts/loginToken")
    suspend fun loginToken(@Body tokenDTO: TokenDTO): VAResponseDTO<PersonDTO>

    @POST("api/accounts/login")
    suspend fun login(@Body loginInfoDTO: LoginInfoDTO): VAResponseDTO<PersonDTO>
}