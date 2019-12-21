package patrones.Adapter;

public class RectanguloAdapter implements RectanguloTipo1{

	private RectanguloTipo2 retangulo;

	public RectanguloAdapter(RectanguloTipo2 rectangulo) {
		this.retangulo = rectangulo;
	}
	@Override
	public int getX() {
		return this.retangulo.getX1();
	}

	@Override
	public int getY() {
		return this.retangulo.getY1();
	}

	@Override
	public int getAncho() {
		return this.retangulo.getX2() - this.retangulo.getX1();
	}

	@Override
	public int getAlto() {
		return this.retangulo.getY2() - this.retangulo.getY1();
	}
}