package puntos;

public class Punto {
	private float x, y;

	public Punto(float x, float y) {
		this.x = x;
		this.y = y;
	}

	float getX() {
		return x;
	}

	float getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
}
