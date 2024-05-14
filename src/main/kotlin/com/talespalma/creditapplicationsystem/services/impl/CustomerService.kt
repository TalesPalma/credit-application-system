package com.talespalma.creditapplicationsystem.services.impl

import com.talespalma.creditapplicationsystem.entity.Customer
import com.talespalma.creditapplicationsystem.repositorys.CustomerReposytori
import com.talespalma.creditapplicationsystem.services.ICustomerService
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val customerRepository: CustomerReposytori
) : ICustomerService {
    override fun save(custom: Customer): Customer {
        return this.customerRepository.save(custom)
    }

    override fun findAllById(customerId: Long): Customer {
        return this.customerRepository.findById(customerId).orElseThrow()
    }

    override fun delete(id: Long): Customer {
        this.customerRepository.deleteById(id)
        return this.customerRepository.findById(id).orElseThrow()
    }


}