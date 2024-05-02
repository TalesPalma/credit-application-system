package com.talespalma.creditapplicationsystem.repositorys

import com.talespalma.creditapplicationsystem.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerReposytori : JpaRepository<Customer, Long> {
}