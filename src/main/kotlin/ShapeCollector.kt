import shapes2d.BaseShape
import shapes2d.Color
import shapes2d.ColoredShape2D
import shapes2d.Shape2D
import kotlin.reflect.KClass

class ShapeCollector
{
    private val shapes : MutableList<BaseShape> = mutableListOf()

    fun add( newShape : BaseShape ) {
        shapes.add(newShape)
    }
    fun getMinAreaShape() : Shape2D? {
        return  shapes.minByOrNull { it.calcArea() }
    }
    fun getMaxAreaShape() : Shape2D? {
        return  shapes.maxByOrNull { it.calcArea() }
    }
    fun getTotalShapesArea() : Double {
       return shapes.sumOf { it.calcArea() }
    }
    fun getAllShapesWithFillColor(fillColor : Color) : List<ColoredShape2D> {
        return  shapes.filter { it.fillColor == fillColor }
    }
    fun getAllShapesWithBorderColor(borderColor : Color) : List<ColoredShape2D> {
        return  shapes.filter { it.borderColor  == borderColor }
    }

    fun getAllShapes() : List<BaseShape> {
        return shapes.toList()
    }
    fun count() : Int{
        return shapes.count()
    }

    fun getAllShapesGroupedByFillColor() : Map<Color, List<ColoredShape2D>> {
        return shapes.groupBy { it.fillColor }
    }
    fun getAllShapesGroupedByBorderColor() : Map<Color, List<ColoredShape2D>> {
        return shapes.groupBy { it.borderColor }
    }
    fun <T:Any> getAllShapesOfType(shapeType: KClass<T>) : List<T> {
        @Suppress("UNCHECKED_CAST")
        return shapes.filter { it::class == shapeType } as List<T>
    }
}