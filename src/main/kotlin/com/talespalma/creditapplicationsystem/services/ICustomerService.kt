package com.talespalma.creditapplicationsystem.services

import com.talespalma.creditapplicationsystem.entity.Customer

interface ICustomerService {
    fun save(custom: Customer): Customer
    fun findAllById(customerId: Long): Customer
    fun delete(id: Long): Customer
}