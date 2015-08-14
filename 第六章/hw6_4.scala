class Point(x:Int, y:Int) {
	override def toString:String = "Point:(" + x + "," + y + ")"
}

object Point extends App{
	def apply(x:Int, y:Int) = {
		new Point(x,y)
	}

	val p = Point(1,5)
	println(p)
}