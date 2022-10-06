package com.jackie35er.thymeleaf.domain

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.validation.constraints.PastOrPresent
import javax.validation.constraints.Positive
import javax.validation.constraints.Size

@Entity
data class Tasks(
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @get:Size(max = 255)
    val description: String,

    @get:PastOrPresent
    val finishedDate: LocalDate,

    @get:Positive
    val hoursWorked: Int,

    @ManyToOne
    val employee: Employee,
)