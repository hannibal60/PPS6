#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <stdio_ext.h>
#include <stdbool.h>
#include <unistd.h>

float global[2];

void *hilo_suma(void *args)
{
	float n1,n2,sum;
	n1 = global[0];
	n2 = global[1];
	sum = n1+n2;
	sleep(2);
	printf("\t%.2f + %.2f = %.2f\n",n1,n2,sum);

	return NULL;

}

void *hilo_resta(void *args)
{
	float n1,n2,resta;
	n1 = global[0];
	n2 = global[1];
	resta = n1-n2;
	sleep(2);
	printf("\t%.2f - %.2f = %.2f\n",n1,n2,resta);

	return NULL;
}
void *hilo_multi(void *args)
{
	float n1,n2,multi;
	n1 = global[0];
	n2 = global[1];
	multi = n1*n2;
	sleep(2);
	printf("\t%.2f * %.2f = %.2f\n",n1,n2,multi);

	return NULL;
}

void *hilo_divi(void *args)
{
	float n1,n2,divi;
	n1 = global[0];
	n2 = global[1];
	if(n1!=0 && n2!=0)
	{
		divi = n1/n2;
		sleep(2);
		printf("\t%.2f / %.2f = %.2f\n",n1,n2,divi);
	}else
	{
		if(n1==0 && n2==0)
		{
			printf("Imposible dividir entre 0");
			if(n1!=0 && n2==0)
			{
				printf("Imposible dividir entre 0");
			}else
			{
				if(n1==0 && n2!=0)
				{
					printf("Imposible dividir entre 0");
				}
			}
		}
	}
	return NULL;
}

int main()
{
	bool seguir=true;
	bool divc=false;
	char c;
	bool n1c=false;
	bool n2c=false;

	do
	{

		seguir=true;
		divc=false;
		n1c=false;
		n2c=false;
		system("clear"); //system("clear"); linux
		printf("\t\t\t----------------------------------\n");
		printf("\t\t\t|Calculadora aritmetica paralela |\n");
		printf("\t\t\t----------------------------------\n");

		do
		{
			printf("Primer numero a operar:\n");
			//fflush(stdin);
			__fpurge(stdin);
			if(scanf("%f",&global[0])==1)
			{
				n1c=true;
			}else
			{
				printf("¡Error!, Numero invalido, verifique");
			}
		}while(n1c!=true);

		do
		{
			printf("Segundo numero a operar:\n");
			//fflush(stdin);
			__fpurge(stdin);
			if(scanf("%f",&global[1])==1)
			{
				n2c=true;
			}else
			{
				printf("¡Error!, Numero invalido, verifique");
			}
		}while(n2c!=true);

		printf("\n-----------SUMA-----------\n");
		pthread_t suma;
		pthread_create(&suma,NULL,hilo_suma,global);
		pthread_join(suma,NULL);

		printf("\n----------RESTA------------\n");
		pthread_t resta;
		pthread_create(&resta,NULL,hilo_resta,global);
		pthread_join(resta,NULL);

		printf("\n-------MULTIPLICACION-------\n");
		pthread_t multi;
		pthread_create(&multi,NULL,hilo_multi,global);
		pthread_join(multi,NULL);

		do
		{
			if(global[1]!=0 && global[0]!=0)
			{
				printf("\n----------DIVISION-----------\n");
				pthread_t divi;
				pthread_create(&divi,NULL,hilo_divi,global);
				pthread_join(divi,NULL);
				printf("\n------------------------------\n");
				divc=true;
			}else
			{
				//fflush(stdin); // cambiar por el comando de linux "__fpurge()stdin;"
				__fpurge(stdin);
				printf("Error, no se puede dividir entre 0, se reiniciara el hilo Division\n\n");
				printf("Ingrese numero 1 a dividir");
				scanf("%f",&global[0]);
				printf("Ingrese numero 2 a dividir");
				scanf("%f",&global[1]);
			}
		}while(divc!=true);

		//fflush(stdin); // cambiar por el comando de linux "__fpurge()stdin;"
		__fpurge(stdin);
		printf("Desea realizar de nuevo las operaciones.. S/N\n");
		scanf("%c",&c);
		if(c=='N' || c=='n')
		{
			seguir=false;
		}
	}while(seguir!=false);

	int f = getchar();

	return 0;
}
