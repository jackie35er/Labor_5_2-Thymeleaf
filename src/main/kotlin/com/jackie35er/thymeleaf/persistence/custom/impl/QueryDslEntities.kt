package com.jackie35er.thymeleaf.persistence.custom.impl

import com.jackie35er.thymeleaf.domain.QEmployee
import com.jackie35er.thymeleaf.domain.QTasks

object QueryDslEntities {

    val employee: QEmployee = QEmployee.employee
    val tasks: QTasks = QTasks.tasks
}