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
  fun getKotelett(@RequestParam id: Long) = kotelettService.getKotelett(id)

  @GetMapping("/search")
  fun getByWeight(@RequestParam minimumWeight: Int?,
                  @RequestParam origin: String?) : List<KotelettDto> {
    val koteletter = minimumWeight?.let { getAllKoteletter().filter { it.weight >= minimumWeight } } ?: getAllKoteletter()
    return origin?.let { koteletter.filter { k -> k.origin == origin } } ?: koteletter
  }

}