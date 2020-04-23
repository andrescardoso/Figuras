
public class Cuadrado implements Figura {
	
	private double lado;
	
	public Cuadrado(double lado) {
		
		this.setLado(lado);
		
	}
	
	// SETTERS & GETTERS
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	// MÉTODO DE INTERFACE
	public double area() {
		return Math.pow(this.getLado(), 2); // LADO AL CUADRADO
	}

	// TOSTRING
	public String toString() {
		return "Cuadrado [Lado=" + lado + " | Area= "+this.area()+"]";
	}

	// EQUALS
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuadrado other = (Cuadrado) obj;
		if (Double.doubleToLongBits(lado) != Double.doubleToLongBits(other.lado))
			return false;
		return true;
	}

	// CLONE
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
