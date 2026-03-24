package com.example.crm.customer.repository

import com.example.crm.customer.model.Customer
import com.example.crm.customer.model.CustomerStatus
import java.util.concurrent.ConcurrentHashMap

class InMemoryCustomerRepository : ICustomerRepository {
    private val customers = ConcurrentHashMap<String, Customer>()

    override fun create(customer: Customer): Customer {
        customers[customer.id] = customer
        return customer
    }

    override fun update(customer: Customer): Customer {
        customers[customer.id] = customer
        return customer
    }

    override fun findById(id: String): Customer? {
        return customers[id]
    }

    override fun findAll(): List<Customer> {
        return customers.values.toList()
    }
    override fun listActiveCustomers(): List<Customer> {
        return customers.values.filter { it.status == CustomerStatus.ACTIVE }
    }

}
