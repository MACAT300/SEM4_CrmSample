package com.example.crm.lead.service

import com.example.crm.lead.model.Lead
import com.example.crm.lead.repository.LeadRepository
import com.example.crm.customer.model.Customer
import com.example.crm.customer.model.CustomerStatus
import com.example.crm.customer.repository.ICustomerRepository
import com.example.crm.customer.service.CustomerService
import com.example.crm.lead.model.LeadStatus
import java.time.LocalDateTime

class LeadServiceImpl(
    private val leadRepository: LeadRepository,
    private val customerRepository: ICustomerRepository,
    private val customerService: CustomerService
) : LeadService {
    override fun createLead(lead: Lead): Lead {
        validateLead(lead)
        return leadRepository.create(lead)
    }

    override fun assignLead(leadId: String, salespersonId: String): Lead {
        val lead = leadRepository.findById(leadId) ?: throw IllegalArgumentException("Lead not found")
        val updatedLead = lead.copy(status = LeadStatus.ASSIGNED, assignedSalesperson = salespersonId)
        return leadRepository.update(updatedLead)
    }

    override fun convertLeadToCustomer(leadId: String): Customer {
        val lead = leadRepository.findById(leadId) ?: throw IllegalArgumentException("Lead not found")
        val customer = Customer(
            id = lead.id,
            firstName = lead.Firstname,
            lastName = lead.Lastname,
            phone = lead.contactInfo,
            email = lead.contactInfo,
            status = CustomerStatus.ACTIVE,
            createdAt = LocalDateTime.now(),
            isPremium = true
        )
        return customerService.createCustomer(customer)
    }

    override fun listLeads(): List<Lead> {
        return leadRepository.findAll()
    }

    private fun validateLead(lead: Lead) {
        require(lead.id.isNotBlank()) { "Lead ID cannot be blank" }
        require(lead.Firstname.isNotBlank()) { "Lead name cannot be blank" }
        require(lead.Lastname.isNotBlank()) { "Lead name cannot be blank" }
        require(lead.contactInfo.isNotBlank()) { "Lead contact info cannot be blank" }
        require(lead.source.isNotBlank()) { "Lead source cannot be blank" }
        require(lead.status != null) { "Lead status cannot be null" }
        require(lead.createdAt != null) { "Lead creation date cannot be null" }
    }
}
