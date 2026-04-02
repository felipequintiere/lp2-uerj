/*
2.2.1 - Desenhe o retângulo com cor de contorno e de fundo

1. Adicione à classe "Rect" as propriedades de cor de contorno e cor de fundo.
2. Altere o método "paint" para desenhar as cores de contorno e de fundo do retângulo.
- Use os métodos "drawRect" e "fillRect" do Java2D.
- Use o método "setColor" para alterar a cor vigente do Java2D.
Por exemplo, a chamada "g.setColor(new Color(0,255,0))" altera a cor de redesenho para verde.
3. Crie pelo menos 3 retângulos com propriedades diferentes e os exiba na tela.
4. Adicione um "print screen" da execução (imagem .png)
*/

public class RectApp {
	public static void main (String[] args) {
		Rect r1 = new Rect(1,1, 10,10);
	}
}

class Rect {
	private int x, y;
	private int w, h;

	public Rect (int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	public void print () {
	}
}
