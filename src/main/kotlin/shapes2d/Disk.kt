package shapes2d

class Disk(val raduis : Double,override val fillColor: Color, override val borderColor: Color) : BaseShape(borderColor, fillColor) {
    override fun calcArea(): Double {
        return Math.PI*raduis*raduis
    }
    override fun toString(): String {
        return "${this::class} Radius: ${raduis} Area: ${calcArea()} Fill: $fillColor Border: $borderColor"
    }
}