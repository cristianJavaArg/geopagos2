package figuras;

public class Circulo extends Figura implements FiguraGeometrica{
int radio = 0;


@Override
public float obtenerSuperficie() {
	// TODO Auto-generated method stub
	return PI*radio*radio;
}

@Override
public float obtenerBase() {
	// TODO Auto-generated method stub
	System.out.println("Un circulo no posee base");
	return 0;
}

@Override
public float obtenerAltura() {
	// TODO Auto-generated method stub
	System.out.println("Un circulo no posee altura");
	return 0;
}

@Override
public float obtenerDiametro() {
	// TODO Auto-generated method stub
	return 2*radio;
}

public int getRadio() {
	return radio;
}

public void setRadio(int radio) {
	this.radio = radio;
}
}
