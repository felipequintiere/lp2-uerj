/*
 * Considere as 2 figuras mais complexas da sua resposta à pergunta 3.1 do módulo 1.
 *
 * 1. implemente uma struct em C para cada uma delas e uma classe em java para a outra
 * 2. implemente uma função em C e um método em Java "print" para elas
 *
 * As informações contidas na struct e class precisam ser suficientes para representar a figura de forma completa. Não é necessário realmente desenhar as figuras na tela, mas somente com essas informações teria que ser possível desenhá-las de forma não ambígua
*/
#include <stdio.h>
#include <stdlib.h>

////////////////////////////////////////

typedef struct {
	int vertices;
	int distancia_radial;
} Estrela;

typedef struct {
	int eixoh;
	int eixov;
} Elipse;

typedef union {
	Estrela estrela;
	Elipse elipse;
} Forma;

typedef struct {
	int tipo;
	int x;
	int y;
	Forma forma;
} Figura;


////////////////////////////////////////

void preenche(Figura *, int, int, int);  // figura, tipo, x, y
void print(Figura *, int);               // figura, tipo

////////////////////////////////////////

int main(void)
{
	Figura * estrela1 = (Figura*) malloc(sizeof(Figura));

	preenche(estrela1,0,10,10);

	return (EXIT_SUCCESS);
}

void preenche(Figura * figura, int tipo, int x, int y)
{
	figura->tipo = tipo;
	figura->x = x;
	figura->y = y;

	if (tipo == 0)
	{
		(figura->forma).estrela.vertices = 1;
		(figura->forma).estrela.distancia_radial = 1;
		printf("%d",((figura->forma).estrela.vertices));
	}
	else if (tipo == 1)
	{
		(figura->forma).elipse.eixoh = 1;
		(figura->forma).elipse.eixov = 2;

	}
	else
		exit(EXIT_FAILURE);
}
/*
void print(Estrela * estrela)
{
	printf("PRINT ESTRELA\n");
	printf("posição x: %d\n",estrela->x);
	printf("posição y: %d\n",estrela->y);
	printf("número de vértices: %d\n",estrela->vertices);
	printf("distância radial: %d\n\n",estrela->distancia_radial);
}

*/
void print(Figura *, int);
