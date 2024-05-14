package com.talespalma.creditapplicationsystem.services.impl

import com.talespalma.creditapplicationsystem.entity.Credit
import com.talespalma.creditapplicationsystem.repositorys.CreditRepository
import com.talespalma.creditapplicationsystem.services.ICreditService
import org.springframework.stereotype.Service
import java.util.*


@Service
class CreditService(
    private val creditRepository: CreditRepository,
)
    : ICreditService {
    override fun save(credit: Credit): Credit {
        return this.creditRepository.save(credit)
    }

    override fun findAllByCustomerId(customerId: Long): List<Credit> {
        return this.creditRepository.findAll()
    }

    override fun findByCreditCode(creditCode: UUID): Credit {
        return this.creditRepository.findByCreditCode(creditCode)
    }

}