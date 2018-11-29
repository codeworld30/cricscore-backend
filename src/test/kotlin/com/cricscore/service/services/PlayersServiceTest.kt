package com.cricscore.service.services

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class PlayersServiceTest {

    @Test
    fun firstServiceTest() {
        val service = PlayersService()
        assertEquals("All Players", service.getAllPlayers())
    }

}
