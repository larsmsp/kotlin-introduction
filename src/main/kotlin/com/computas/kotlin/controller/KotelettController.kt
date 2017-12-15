package com.computas.kotlin.controller

import com.computas.kotlin.dto.KotelettDto
import com.computas.kotlin.service.KotelettService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/koteletter")
class KotelettController @Autowired constructor(
    private val kotelettService: KotelettService
) {

  @PostMapping("", produces = arrayOf(APPLICATION_JSON_VALUE))
  fun createKotelett(@RequestBody kotelettDto: KotelettDto) = kotelettService.saveKotelett(kotelettDto)

  @GetMapping("", produces = arrayOf(APPLICATION_JSON_VALUE))
  fun getAllKoteletter() = kotelettService.getAllKoteletter()

  @GetMapping("/{id}", produces = arrayOf(APPLICATION_JSON_VALUE))
  fun getKotelett(@PathVariable id: Long) = kotelettService.getKotelett(id)

  @GetMapping("/by-weight")
  fun getByWeight(@RequestParam v: Double?) : List<KotelettDto> =
      v?.let { getAllKoteletter().filter { it.weight >= v } } ?: getAllKoteletter()

  @GetMapping("/by-origin")
  fun getByOrigin(@RequestParam v: String?) : List<KotelettDto> =
      v?.let { getAllKoteletter().filter { k -> k.origin.toLowerCase() == v.toLowerCase() } } ?: getAllKoteletter()
}