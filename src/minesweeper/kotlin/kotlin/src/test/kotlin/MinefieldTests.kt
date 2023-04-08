package minesweeper.tests

import minesweeper.Minefield
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinefieldTests{
    @Test
    fun `it should return empty string`() {
        val minefield = Minefield(arrayOf("."))

        val actual = minefield.calculateHints()
        val expected = arrayOf("0")

        assertArrayEquals(expected, actual)
    }
}