package com.talespalma.creditapplicationsystem.entity

data class Customer(
    val firstName: String,
    val lastName: String,
    val cpf: String,
    var email: String,
    val password: String,
    val address: Address = Address(),
    var credits: List<Credit> = mutableListOf(),
    val id : Long? = null
)
