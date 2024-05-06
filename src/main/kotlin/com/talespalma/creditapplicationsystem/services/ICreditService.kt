package com.talespalma.creditapplicationsystem.services

import com.talespalma.creditapplicationsystem.entity.Credit
import java.util.*

interface ICreditService {
    fun save(credit: Credit): Credit
    fun findAllByCustomerId(customerId: Long): List<Credit>
    fun findByCreditCode(creditCode: UUID): Credit
}