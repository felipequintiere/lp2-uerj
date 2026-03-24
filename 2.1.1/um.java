/*
 * Considere as 2 figuras mais complexas da sua resposta à pergunta 3.1 do módulo 1.
 *
 * 1. implemente uma struct em C para cada uma delas e uma classe em java para a outra
*/

class Estrela {
	int x,y;
	int vertices;
	int distancia_radial;

	Estrela(int x, int y, int distancia_radial)
	{
		this.x = x;
		this.y = y;
		this.distancia_radial = distancia_radial;
	}

	public void print()
	{
		System.out.printf("%d\t%d\t%d\n",this.x,this.y,
				this.distancia_radial);
	}
	
}


public class teste {
	static void main(String[] args)
	{
		Estrela r1 = new Estrela(1,1,10);
		r1.print();
		//print(r1);
	}
}
