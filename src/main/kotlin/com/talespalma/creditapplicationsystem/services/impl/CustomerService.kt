package com.talespalma.creditapplicationsystem.services.impl

import com.talespalma.creditapplicationsystem.entity.Credit
import com.talespalma.creditapplicationsystem.entity.Customer
import com.talespalma.creditapplicationsystem.repositorys.CustomerReposytori
import com.talespalma.creditapplicationsystem.services.ICustomService
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val customerRepository:CustomerReposytori
) : ICustomService {
    override fun save(customer: Customer): Customer {
        customerRepository.save(customer)
        return customer
    }

    override fun findAllById(customerId: Long): Customer {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long): Customer {
        TODO("Not yet implemented")
    }

}