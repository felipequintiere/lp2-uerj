/*
- Implemente os seguintes métodos:
1. int area ()
- deve retornar a área do retângulo
2. void drag (int dx, int dy)
- deve “arrastar” o objeto, ou seja somar o dx e dy a sua posição atual
- Altere o método `print` para também exibir a área.
- Inclua testes que garantam que os métodos estão corretos.
- Respeite as assinaturas de método acima.
- Não use `print` dentro dos métodos.
*/

public class RectApp {
	public static void main (String[] args) {
		Rect r1 = new Rect(1,1, 10,10);
		r1.print();

		System.out.printf("\nW:10, H:10, A: %d\n", r1.area());
		System.out.printf("\ndx = 10, dy = 10\n");
		r1.drag(10,10);
		r1.print();

	}
}
class Rect {
	int x, y;
	int w, h;
	Rect (int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	int area()
	{
		return(this.w * this.h);

	}

	void drag (int dx, int dy)
	{
		this.x += dx;
		this.y += dy;
	}

	void print () {
		System.out.format("Retangulo de tamanho (%d,%d) e área (%d) na posicao (%d,%d).\n",
			this.w, this.h, this.area(), this.x, this.y);
	}
}
