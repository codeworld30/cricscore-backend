package com.cricscore.service.controllers

import com.cricscore.service.services.PlayersService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PlayerController {

    @Autowired
    lateinit var playersService: PlayersService

    @GetMapping("/players")
    fun players() = playersService.getAllPlayers()


}