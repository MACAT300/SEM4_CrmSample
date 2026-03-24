package com.example.crm.lead.model

import java.time.LocalDateTime

enum class LeadStatus {
    NEW,
    ASSIGNED,
    CONVERTED
}

data class Lead(
    val id: String,
    val Firstname: String,
    val Lastname: String,
    val contactInfo: String,
    val source: String,
    val status: LeadStatus,
    val assignedSalesperson: String?,
    val createdAt: LocalDateTime
)
