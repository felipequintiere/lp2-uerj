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

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RectApp {
	public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();

		Rect r1 = new Rect(1,1, 10,10);
		r1.print();

		System.out.printf(
			"\nwidth: %d\nheight: %d\narea: %d\n" +
			"x: %d\ny: %d\n",
			r1.getWidth(),r1.getHeight(),r1.area(),r1.getX(),r1.getY());

		System.out.printf("\ndx: 10, dy: 10\n");
		r1.drag(10,10);
		r1.print();

	}
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("example title!");
        this.setSize(400, 400);
        this.setVisible(true);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();

		g2d.setPaint(Color.blue);
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
		//System.out.format();
	}

	public void paint (Graphics g) {

	}
}
