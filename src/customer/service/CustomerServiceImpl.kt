package com.example.crm.customer.service

import com.example.crm.app.Constant.CRMConstants
import com.example.crm.customer.model.Customer
import com.example.crm.customer.model.CustomerStatus
import com.example.crm.customer.repository.ICustomerRepository

class CustomerServiceImpl(private val customerRepository: ICustomerRepository) : CustomerService {
    override fun createCustomer(customer: Customer): Customer {
        validateCustomer(customer)
        return customerRepository.create(customer)
    }

    override fun updateCustomer(customer: Customer): Customer {
        validateCustomer(customer)
        return customerRepository.update(customer)
    }

    override fun findCustomerById(id: String): Customer? {
        val customer = customerRepository.findById(id)

        if (customer == null) {
            throw IllegalArgumentException("No customer with this id")
        }
        return customer
    }

    override fun listCustomers(): List<Customer> {
        return customerRepository.findAll()
    }

    override fun listActiveCustomers(): List<Customer> {
        return customerRepository.listActiveCustomers()
    }

    private fun validateCustomer(customer: Customer) {
//        if (customer.status == CustomerStatus.INACTIVE) {
//            throw IllegalArgumentException("Inactive customer is not allowed")
//        }
        if (customerRepository.findById(customer.id) != null) {
            throw IllegalArgumentException("Customer with this ID already exists")
        }
        require(customer.id.isNotBlank()) { CRMConstants.ERROR_CUSTOMER_ID_REQUIRED }
        require(customer.firstName.isNotBlank()) { CRMConstants.ERROR_CUSTOMER_FIRST_NAME_REQUIRED }
        require(customer.lastName.isNotBlank()) { CRMConstants.ERROR_CUSTOMER_LAST_NAME_REQUIRED }
        require(customer.phone.isNotBlank()) { CRMConstants.ERROR_CUSTOMER_PHONE_REQUIRED }
        require(customer.email.isNotBlank()) { CRMConstants.ERROR_CUSTOMER_EMAIL_REQUIRED }
        require(customer.status != null) { CRMConstants.ERROR_CUSTOMER_STATUS_REQUIRED }
        require(customer.createdAt != null) { CRMConstants.ERROR_CUSTOMER_CREATED_AT_REQUIRED }

    }
}
