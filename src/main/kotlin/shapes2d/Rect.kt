package shapes2d

open class Rect(val size: Vector2, override val fillColor: Color, override val borderColor: Color) :
    BaseShape(borderColor, fillColor) {

    init{
        if(size.x <= 0 || size.y <= 0)
            throw IllegalArgumentException("Rect size can't be negative or 0")
    }

    override fun calcArea(): Double {
        return size.x * size.y
    }

    override fun toString(): String {
        return "${this::class} Size: ${size} Area: ${calcArea()} Fill: $fillColor Border: $borderColor"
    }


}