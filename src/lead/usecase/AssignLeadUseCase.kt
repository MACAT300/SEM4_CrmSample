package com.example.crm.lead.usecase

import com.example.crm.lead.model.Lead
import com.example.crm.lead.service.LeadService

class AssignLeadUseCase(private val leadService: LeadService) {
    fun execute(leadId: String, salespersonId: String): Lead {
        return leadService.assignLead(leadId, salespersonId)
    }
}
