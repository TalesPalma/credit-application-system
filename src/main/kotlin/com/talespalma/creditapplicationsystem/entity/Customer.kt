package com.talespalma.creditapplicationsystem.entity

import jakarta.persistence.*

@Entity
@Table(name = "customer")
data class Customer(
    @Column(nullable = false) val firstName: String,
    @Column(nullable = false) val lastName: String,
    @Column(nullable = false, unique = true) val cpf: String,
    @Column(nullable = false , unique = true) var email: String,
    @Column(nullable = false) val password: String,
    @Column(nullable = false) @Embedded val address: Address = Address(),
     @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.REMOVE] , mappedBy = "customer")
    var credits: List<Credit> = mutableListOf(),
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null
)
