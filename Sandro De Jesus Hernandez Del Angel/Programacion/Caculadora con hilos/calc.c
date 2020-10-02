#include<stdio.h>
#include<pthread.h>

float n1;
float n2;

void *suma ()
{
	//char *txt = (char* par);
	printf("Suma: %.2f + %.2f = %.2f \n", n1, n2, n1 + n2);
}

void *resta ()
{
	//char *txt = (char* par);
	printf("Resta: %.2f - %.2f = %.2f \n", n1, n2, n1 - n2);
}

void *multip ()
{
	//char *txt = (char* par);
	printf("Multiplicacion: %.2f * %.2f = %.2f \n", n1, n2, n1 * n2);
}

void *division ()
{
	//char *txt = (char* par);
	if(n2 != 0)
	{
		printf("Division: %.2f / %.2f = %.2f \n", n1, n2, n1 / n2);
	}else
	{
		printf("Error Matematico, no se puede dividir entre 0.\n");
	}
}

int main ()
{
	printf("Calculadora basica\n");
	
	printf("Ingrese el primer numero para hacar una operacion: ");
	while (scanf("%f", &n1) != 1)
	{
		printf("Ingrese un numero valido porfavor: ");
	}
	
	printf("\nIngrese el segundo numero de la operacion: ");
	while (scanf("%f", &n2) != 1)
	{
		printf("Ingrese un numero valido porfavor: ");
	}
	
	printf("Los numeros para las operaciones son: \"%.2f\" y \"%.2f\" ", n1, n2);
	
	printf("\nResultados: \n");
	//////////////////////////////////////////////////////////////
	
	pthread_t p1;
	pthread_t p2;
	pthread_t p3;
	pthread_t p4;
	
	pthread_create(&p1, NULL, suma, NULL);
	pthread_create(&p2, NULL, resta, NULL);
	pthread_create(&p3, NULL, multip, NULL);
	pthread_create(&p4, NULL, division, NULL);
	
	pthread_join(p1,NULL);
	pthread_join(p2,NULL);
	pthread_join(p3,NULL);
	pthread_join(p4,NULL);
	
	return 0;
}
















