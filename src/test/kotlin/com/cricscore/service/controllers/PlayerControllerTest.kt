package com.cricscore.service.controllers

import com.cricscore.service.services.PlayersService
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.doReturn
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class PlayerControllerTest {

    @InjectMocks
    lateinit var playerController: PlayerController

    @Mock
    lateinit var playersService: PlayersService

    @Test
    fun firstAPITest() {
        doReturn("Hello players").`when`(playersService).getAllPlayers()
        val result = playerController.players()
        assertNotNull(result)
        assertEquals("Hello players", result)
    }
}