package com.computas.kotlin.repository

import com.computas.kotlin.dto.PersonDto
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository : JpaRepository<PersonDto, Long>