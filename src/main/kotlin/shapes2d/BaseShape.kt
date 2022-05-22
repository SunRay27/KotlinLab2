package shapes2d

abstract class BaseShape(override val fillColor: Color, override val borderColor: Color) : Shape2D, ColoredShape2D {

    override fun toString(): String {
        return "${this::class} Area: ${calcArea()} Fill: $fillColor Border: $borderColor"
    }
}