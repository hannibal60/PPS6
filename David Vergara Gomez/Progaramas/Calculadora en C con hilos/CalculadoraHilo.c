/*
 * 
 *
 * David Vergara Gomez
 *
 *
 */
#include <pthread.h>
#include <stdio.h>

void *funcionThread(void *parametro);
void *sumar(void *parametro);
void *restar(void *parametro);
void *multiplicar(void *parametro);
void *dividir(void *parametro);
float lectura();

float num1, num2;

int main()
{
	system("clear");
    /* Identificador del thread hijo */
    pthread_t idSumar;
    pthread_t idRestar;
    pthread_t idMulti;
    pthread_t idDivi;

    printf("Dame el primer numero: ");
    num1=lectura();
    printf("Dame el segundo numero: ");
    num2=lectura();

	printf("**********CALCULANDO RESULTADOS**************\n");

    pthread_create(&idSumar, NULL, sumar, NULL);
    pthread_create(&idRestar, NULL, restar, NULL);
    pthread_create(&idMulti, NULL, multiplicar, NULL);
    pthread_create(&idDivi, NULL, dividir, NULL);

	printf("******EL PROGRAMA TERMINO CON EXITO******\n");

    return 0;
}

void *sumar(void *parametro)
{
	printf("************************************\n");
    float res = 0;
    res = num1 + num2;
    printf("Resultado de la suma:  %f\n", res);
}

void *restar(void *parametro)
{
	printf("************************************\n");
    float res = 0;
    res = num1 - num2;
    printf("Resultado de la resta:  %f\n", res);
}

void *multiplicar(void *parametro)
{
	printf("************************************\n");
    float res = 0;
    res = num1 * num2;
    printf("Resultado de la multiplicacion:  %f\n", res);
}

void *dividir(void *parametro)
{
	printf("************************************\n");
    float res = 0;

    if (num2 == 0)
    {
        printf("No se puede dividir entre cero");

    } else
    {
        res = num1 / num2;
    }
    printf("Resultado de la divicion:  %f\n", res);
}

float lectura()
{
	int check=1;
	float num;
	do
	{
		__fpurge(stdin);
		if(scanf("%f", &num)==1)
		{
			check=0;
		}else
		{
			printf("Se esperaba un numero");
		}
	}while(check==1);
	return num;
}
