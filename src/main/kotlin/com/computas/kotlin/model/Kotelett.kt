package com.computas.kotlin.model

import com.computas.kotlin.dto.KotelettDto
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "person")
class Kotelett(
        @Id val id: Long? = null,
        val origin: String,
        val weight: Double) {

    private constructor() : this(origin = "", weight = 0.0)

    fun toDto() : KotelettDto = KotelettDto(id!!, origin, weight)

    companion object {
        fun fromDto(dto: KotelettDto) = Kotelett(
                dto.id,
                dto.origin,
                dto.weight)
    }
}