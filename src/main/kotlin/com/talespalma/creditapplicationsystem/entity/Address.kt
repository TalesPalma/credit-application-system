package com.talespalma.creditapplicationsystem.entity

import jakarta.persistence.*

@Embeddable
data class Address(
    @Column( nullable = false) val zipCode: String = "",
    @Column( nullable = false) val street: String = "",
)
