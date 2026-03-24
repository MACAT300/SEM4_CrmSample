package com.example.crm.lead.service

import com.example.crm.customer.model.Customer
import com.example.crm.lead.model.Lead

interface LeadService {
    fun createLead(lead: Lead): Lead
    fun assignLead(leadId: String, salespersonId: String): Lead
    fun convertLeadToCustomer(leadId: String): Customer
    fun listLeads(): List<Lead>
}
