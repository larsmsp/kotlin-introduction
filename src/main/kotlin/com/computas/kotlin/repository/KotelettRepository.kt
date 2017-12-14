package com.computas.kotlin.repository

import com.computas.kotlin.model.Kotelett
import org.springframework.data.jpa.repository.JpaRepository

interface KotelettRepository : JpaRepository<Kotelett, Long>