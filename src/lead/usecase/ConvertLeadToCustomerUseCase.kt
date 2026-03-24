package com.example.crm.lead.usecase

import com.example.crm.customer.model.Customer
import com.example.crm.lead.service.LeadService

class ConvertLeadToCustomerUseCase(private val leadService: LeadService) {
    fun execute(leadId: String): Customer {
        return leadService.convertLeadToCustomer(leadId)
    }
}
