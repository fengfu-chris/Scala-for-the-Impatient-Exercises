object Card extends Enumeration with App{   
	val M = Value("♣")   
	val T = Value("♠")   
	val H = Value("♥")   
	val F = Value("♦")   
	
	def checkColor(color:Card.Value) = {
		if(color == Card.H || color == Card.F)  "Red"
		else "Black"
	}

	println(checkColor(Card.M))
	println(checkColor(Card.H))
}