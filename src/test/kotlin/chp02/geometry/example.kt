package chp02.geometry

import org.junit.Test

/**
 * Created by AidenChoi on 2016. 11. 25..
 */
class ShapeTest {
    @Test
    fun create() {
        val rectangle = createRandomRectangle()
        println(rectangle.isSquare)
    }
}
