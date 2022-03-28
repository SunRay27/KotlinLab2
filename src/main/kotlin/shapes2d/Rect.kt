package shapes2d

open class Rect(val size : Vector2, override val fillColor: Color, override val borderColor: Color) : BaseShape(borderColor, fillColor) {
    override fun calcArea(): Double {
        return size.x * size.y
    }

    override fun toString(): String {
        return "${this::class} Size: ${size} Area: ${calcArea()} Fill: $fillColor Border: $borderColor"
    }


}