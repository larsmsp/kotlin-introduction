package com.computas.kotlin.repository

import com.computas.kotlin.dto.KotelettDto
import org.springframework.data.jpa.repository.JpaRepository

interface KotelettRepository : JpaRepository<KotelettDto, Long>