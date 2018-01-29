package figuras;

public class Cuadrado extends Figura implements FiguraGeometrica {
String tipo;
int base;



public void setBase(int base) {
	this.base = base;
}

@Override
public float obtenerSuperficie() {
	// TODO Auto-generated method stub
	return base*base;
}

@Override
public float obtenerBase() {
	// TODO Auto-generated method stub
	return base;
}

@Override
public float obtenerAltura() {
	// TODO Auto-generated method stub
	return base;
}

@Override
public float obtenerDiametro() {
	// TODO Auto-generated method stub
	return (float) Math.sqrt(base*4);
}
}
