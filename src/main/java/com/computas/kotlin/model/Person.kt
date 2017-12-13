package com.computas.kotlin.model

import com.computas.kotlin.dto.PersonDto
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "person")
class Person(
        @Id val id: Long? = null,
        val firstname: String,
        val lastname: String,
        val age: Int) {

    private constructor() : this(firstname = "", lastname = "", age = 0)

    companion object {
        fun fromDto(dto: PersonDto) = Person(
                dto.id,
                dto.firstname,
                dto.lastname,
                dto.age)
    }
}