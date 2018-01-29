package figuras;

public class FactoryFiguras {
	
	public static Figura getFigura(String tipo) {
		
		 
		 if (tipo.toUpperCase().equals("circulo")) {
			 Circulo obj = new Circulo();
			 obj.setTipo(tipo);
			 return obj;
		 }	
		 if(tipo.toUpperCase().equals("Cuadrado")) {
			 Cuadrado obj = new Cuadrado();
			 obj.setTipo(tipo);
			 return obj;
		 }
		 if(tipo.toUpperCase().equals("Triangulo")) {
			 Triangulo obj = new Triangulo();
			 obj.setTipo(tipo);
			 return obj;
		 }
		 else {			 
			 return null;			
		 }		 
			
	}	 
	 

}
