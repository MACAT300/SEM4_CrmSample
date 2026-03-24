package com.example.crm.lead.repository

import com.example.crm.lead.model.Lead

interface LeadRepository {
    fun create(lead: Lead): Lead
    fun update(lead: Lead): Lead
    fun findById(id: String): Lead?
    fun findAll(): List<Lead>
}
