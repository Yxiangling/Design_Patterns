package decorator;

public class ShapeDecorator implements Shape {
	protected Shape decorateShape;
	
	public ShapeDecorator(Shape decoratedShape){
		this.decorateShape = decoratedShape;
	}
	@Override
	public void draw() {
		decorateShape.draw();
	}

}
