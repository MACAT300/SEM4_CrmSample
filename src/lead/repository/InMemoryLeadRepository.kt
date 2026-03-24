package com.example.crm.lead.repository

import com.example.crm.lead.model.Lead
import java.util.concurrent.ConcurrentHashMap

class InMemoryLeadRepository : LeadRepository {
    private val leads = ConcurrentHashMap<String, Lead>()

    override fun create(lead: Lead): Lead {
        leads[lead.id] = lead
        return lead
    }

    override fun update(lead: Lead): Lead {
        leads[lead.id] = lead
        return lead
    }

    override fun findById(id: String): Lead? {
        return leads[id]
    }

    override fun findAll(): List<Lead> {
        return leads.values.toList()
    }
}
