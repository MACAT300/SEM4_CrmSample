package com.example.crm.customer.service

import com.example.crm.customer.model.Customer
import com.example.crm.customer.repository.ICustomerRepository

open class PremiumCustomerServicelmpl(private val customerRepository: ICustomerRepository) : CustomerServiceImpl(customerRepository) {
    override fun createCustomer(customer: Customer): Customer {
        return super.createCustomer(customer)
    }

    override fun updateCustomer(customer: Customer): Customer {
        if (!customer.isPremium) {
            throw IllegalArgumentException("No customer with this id")
        }
        return super.updateCustomer(customer)
    }

    override fun findCustomerById(id: String): Customer? {
        val customer = customerRepository.findById(id)
        if (customer == null) {
            throw IllegalArgumentException("No customer with this id")
        }

        if (!customer.isPremium) {
            throw IllegalArgumentException("No customer with this id")
        }
        return super.findCustomerById(id)
    }

    override fun listCustomers(): List<Customer> {
        return super.listCustomers()
    }

    override fun listActiveCustomers(): List<Customer> {
        return super.listActiveCustomers()
    }
}
