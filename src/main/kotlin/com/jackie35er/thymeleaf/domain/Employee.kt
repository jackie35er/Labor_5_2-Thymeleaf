package com.jackie35er.thymeleaf.domain

import org.hibernate.Hibernate
import org.springframework.stereotype.Component
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.validation.constraints.Size

@Entity(name = "Staff")
data class Employee(
    @Id
    @get:Size(max = 6)
    val id: String,

    val firstName: String,
    val lastName: String,

    @OneToMany(mappedBy = "employee")
    val tasks: List<Tasks>,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Employee

        return id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id )"
    }
}
