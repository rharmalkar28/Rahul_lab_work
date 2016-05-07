package factoryMethod;

public class ShapeFactory {

	public Shape getShape(String shapeType) {
		if(shapeType == null)
		{
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("Square")){
			return new Square();
		}
		
		if(shapeType.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}
		
		if(shapeType.equalsIgnoreCase("Circle")){
			return new Circle();
		}
		
		return null;
	}
}
