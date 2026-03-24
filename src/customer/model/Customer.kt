package com.example.crm.customer.model

import java.time.LocalDateTime

enum class CustomerStatus {
    ACTIVE,
    INACTIVE
}

data class Customer(
    val id: String,
    val firstName: String,
    val lastName: String,
    val phone: String,
    val email: String,
    val status: CustomerStatus,
    val createdAt: LocalDateTime,
    val isPremium: Boolean
)
