package figuras;

public class Triangulo extends Figura implements FiguraGeometrica {
String tipo;	
int base;
int altura;

@Override
public float obtenerSuperficie() {
	// TODO Auto-generated method stub
	return (base*altura)/2;
}
@Override
public float obtenerBase() {
	// TODO Auto-generated method stub
	return base;
}
@Override
public float obtenerAltura() {
	// TODO Auto-generated method stub
	return altura;
}
@Override
public float obtenerDiametro() {
	// TODO Auto-generated method stub
	System.out.println("Un triangulo no posee diametro");
	return 0;
}

}
