package com.talespalma.creditapplicationsystem.services.impl

import com.talespalma.creditapplicationsystem.entity.Credit
import com.talespalma.creditapplicationsystem.services.ICreditService
import org.springframework.stereotype.Service
import java.util.*


@Service
class CreditService: ICreditService {
    override fun save(credit: Credit): Credit {
        TODO("Not yet implemented")
    }

    override fun findAllByCustomerId(customerId: Long): List<Credit> {
        TODO("Not yet implemented")
    }

    override fun findByCreditCode(creditCode: UUID): Credit {
        TODO("Not yet implemented")
    }
}