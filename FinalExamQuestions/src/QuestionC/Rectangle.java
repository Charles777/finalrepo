package QuestionC;

public class Rectangle extends Shape {
	
	public Rectangle(int newx, int newy) throws illegalRectangle{
		super(newx, newy);
		if(newx<0)
			throw new illegalRectangle(newx);
		if(newy<0)
			throw new illegalRectangle(newy);
	}

	@Override
	void draw() {
	}

	@Override
	public double ComputeArea() {
		return this.getX() * this.getY();
	}

}
