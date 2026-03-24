package com.example.crm.app.customer.usecase

import com.example.crm.customer.model.Customer
import com.example.crm.customer.service.CustomerService

class ListActiveCustomerUseCase(private val customerService: CustomerService) {
    fun execute(): List<Customer> {
        return customerService.listActiveCustomers()
    }
}