package com.example.crm.customer.usecase

import com.example.crm.customer.model.Customer
import com.example.crm.customer.service.CustomerService

class FindCustomerByIdUseCase(private val customerService: CustomerService) {
    fun execute(id: String): Customer? {
        return customerService.findCustomerById(id)
    }
}
