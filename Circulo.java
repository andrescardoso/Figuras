
public class Circulo implements Figura {

	private double radio;
	
	public Circulo(double radio) {
	
		this.setRadio(radio);
		
	}
	
	// SETTERS & GETTERS
		public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	// MÉTODO DE INTERFACE
	public double area() {
		return Math.PI*Math.pow(this.getRadio(),2); // PI POR RADIO AL CUADRADO
	}

	// TOSTRING
		public String toString() {
		return "Circulo [Radio=" + radio + " | Area= "+this.area()+"]";
	}

	// EQUALS
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Circulo other = (Circulo) obj;
			if (Double.doubleToLongBits(radio) != Double.doubleToLongBits(other.radio))
				return false;
			return true;
		}
		
	// CLONE
	protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
}
