package com.jackie35er.thymeleaf.persistence.custom.impl

import com.jackie35er.thymeleaf.domain.Employee
import com.jackie35er.thymeleaf.persistence.custom.CustomEmployeeRepository
import com.jackie35er.thymeleaf.persistence.custom.impl.QueryDslEntities.employee
import com.jackie35er.thymeleaf.persistence.custom.impl.QueryDslEntities.tasks
import com.querydsl.jpa.impl.JPAQueryFactory
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

class CustomEmployeeRepositoryImpl(
    @PersistenceContext
    val entityManager: EntityManager
): CustomEmployeeRepository {

    private val queryFactory = JPAQueryFactory(entityManager)

}