#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


void *sumar();
void *restar();
void *multiplicar();
void *dividir();
void lee_nums();

float numero1;
float numero2;


void main()
{
	lee_nums();	

	pthread_t hilo;
	
	pthread_create (&hilo, NULL, sumar(), NULL);
	pthread_create (&hilo, NULL, restar(), NULL);
	pthread_create (&hilo, NULL, multiplicar(), NULL);
	pthread_create (&hilo, NULL, dividir(), NULL);
}

void lee_nums()
{
    int vCheck = 1;
    float vNum1, vNum2;

    do
    {
        printf("Dame el primer numero: ");
        __fpurge(stdin);
        if (scanf(" %f", &vNum1) == 1)
        {
            vCheck = 0;
        } else
        {
            printf("\nError, se esperaba un numero\n");
            vCheck = 1;
        }
    } while (vCheck == 1);

    vCheck = 1;
    do
    {
        printf("\nDame el segundo numero: ");
        __fpurge(stdin);
        if (scanf(" %f", &vNum2) == 1)
        {
            vCheck = 0;
        } else
        {
            printf("\nError, se esperaba un numero\n");
            vCheck = 1;
        }
    } while (vCheck == 1);

    numero1 = vNum1;
    numero2 = vNum2;
}

void *sumar ()
{
   printf ("\nLa suma es: %f + %f = %f \n", numero1, numero2, numero1+numero2);	
}

void *restar ()
{
   printf ("La resta es: %f - %f = %f \n", numero1, numero2, numero1-numero2);	
}

void *multiplicar ()
{
   printf ("La multiplicacion es: %f * %f = %f \n", numero1, numero2, numero1*numero2);	
}

void *dividir ()
{
   float div = 0;	   
   if (!(numero1 == 0 || numero2 == 0))
   {
	div = numero1/numero2;
   }   
   printf ("La division es: %f / %f = %f \n\n", numero1, numero2, div);	
}
