package com.talespalma.creditapplicationsystem.services

import com.talespalma.creditapplicationsystem.entity.Credit
import com.talespalma.creditapplicationsystem.entity.Customer

interface ICustomService {
    fun save(custom: Customer): Customer
    fun findAllById(customerId: Long): Customer
    fun delete(id: Long): Customer
}