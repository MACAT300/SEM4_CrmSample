package com.example.crm.lead.usecase

import com.example.crm.lead.model.Lead
import com.example.crm.lead.service.LeadService

class CreateLeadUseCase(private val leadService: LeadService) {
    fun execute(lead: Lead): Lead {
        return leadService.createLead(lead)
    }
}
