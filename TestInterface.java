import java.util.*;

public class TestInterface {

	public static void main(String[] args) {
		
		ArrayList<Figura> figuras=new ArrayList<Figura>(); // DECLARACIÓN DEL ARRAY DE FIGURAS 
		figuras.add(new Cuadrado(3));
		figuras.add(new Rectangulo(10,5.5));
		figuras.add(new Circulo(3.6));
		
		// RECORRO ARRAY MOSTRANDO CADA OBJETO CON TOSTRING Y ACUMULO AREA DE CADA UNO EN EL MISMO FOR
		double areatotal=0;
		for (int i=0;i<figuras.size();i++) {
			System.out.println(figuras.get(i).toString());
				areatotal+=figuras.get(i).area();
				if (i+1==figuras.size()) {
					System.out.println("Area total de las "+figuras.size()+" figuras: "+areatotal); // MUESTRO LA SUMA DE TODAS LAS AREAS
				}
		}
		
	}

}

