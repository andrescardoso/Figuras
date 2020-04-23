
public class Rectangulo implements Figura {

	private double b;
	private double h;
	
	public Rectangulo(double base, double altura) {
		
		this.setB(base);
		this.setH(altura);
		
	}
	
	// SETTERS & GETTERS
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	
	// MÉTODO DE INTERFACE
	public double area() {
		return this.getB()*this.getH(); // BASE POR ALTURA
	}

	// TOSTRING
		public String toString() {
		return "Rectangulo [Base=" + b + " | Altura=" + h + " | Area= "+this.area()+"]"; 
	}
		
	// EQUALS
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Rectangulo other = (Rectangulo) obj;
			if (Double.doubleToLongBits(b) != Double.doubleToLongBits(other.b))
				return false;
			if (Double.doubleToLongBits(h) != Double.doubleToLongBits(other.h))
				return false;
			return true;
		}
		
	// CLONE
	protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
	
}
