package com.example.crm.lead.usecase

import com.example.crm.lead.model.Lead
import com.example.crm.lead.service.LeadService

class ListLeadsUseCase(private val leadService: LeadService) {
    fun execute(): List<Lead> {
        return leadService.listLeads()
    }
}
