package com.computas.kotlin.service

import com.computas.kotlin.dto.KotelettDto
import com.computas.kotlin.model.Kotelett
import com.computas.kotlin.repository.KotelettRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service("kotelettService")
class KotelettService @Autowired constructor(
    private val kotelettRepository: KotelettRepository
) {

  fun getAllKoteletter() = kotelettRepository.findAll().map { it.toDto() }

  fun getKotelett(kotelettId: Long) = kotelettRepository.getOne(kotelettId).toDto()

  fun saveKotelett(kotelett: KotelettDto) = kotelettRepository.save(Kotelett.fromDto(kotelett))
}