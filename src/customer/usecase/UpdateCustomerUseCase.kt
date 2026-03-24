package com.example.crm.customer.usecase

import com.example.crm.customer.model.Customer
import com.example.crm.customer.service.CustomerService

class UpdateCustomerUseCase(private val customerService: CustomerService) {
    fun execute(customer: Customer): Customer {
        return customerService.updateCustomer(customer)
    }
}
