package com.example.crm.customer.service

import com.example.crm.customer.model.Customer

interface CustomerService {
    fun createCustomer(customer: Customer): Customer
    fun updateCustomer(customer: Customer): Customer
    fun findCustomerById(id: String): Customer?
    fun listCustomers(): List<Customer>
    fun listActiveCustomers(): List<Customer>
}
