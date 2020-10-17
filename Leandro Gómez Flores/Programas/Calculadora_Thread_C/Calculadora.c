/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Calculadora.c
 * Author: root
 *
 * Created on 28 de septiembre de 2020, 12:51 PM
 */

#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

float vResultado;

void *mSuma(void *parametro);
void *mResta(void *parametro);
void *mMultiplicar(void *parametro);
void *mDividir(void *parametro);
//int *mValidarFloat(float vNum);

float vNum1, vNum2;

int main()
{
    system("clear");
    int vCheck = 1;

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

    printf("\n\nCalculando datos...\n");

    pthread_t vHiloS;
    pthread_t vHiloR;
    pthread_t vHiloM;
    pthread_t vHiloD;

    pthread_create(&vHiloS, NULL, mSuma, NULL);
    sleep(1/100);
    pthread_create(&vHiloR, NULL, mResta, NULL);
    sleep(1/100);
    pthread_create(&vHiloM, NULL, mMultiplicar, NULL);
    sleep(1/100);
    pthread_create(&vHiloD, NULL, mDividir, NULL);
    sleep(1/100);

    printf("\nEsto no es un hilito : Los datos que me diste %.3f , %.3f \n\n", vNum1, vNum2);

    return 0;
}

void *mSuma(void *parametro)
{
    vResultado = vNum1 + vNum2;
    printf("\nSuma:\n%f + %f = %.3f\n", vNum1, vNum2, vResultado);
}

void *mResta(void *parametro)
{
    vResultado = vNum1 - vNum2;
    printf("\nResta:\n%f - %f = %.3f\n", vNum1, vNum2, vResultado);
}

void *mMultiplicar(void *parametro)
{

    printf("\nMultiplicar:\n%f x %f = %.3f\n", vNum1, vNum2, vNum1 * vNum2);
}

void *mDividir(void *parametro)
{
    if (vNum1 != 0 && vNum2 != 0)
    {
        vResultado = vNum1 / vNum2;
        printf("\nDividir:\n%f / %.3f = %f \n", vNum1, vNum2, vResultado);

    } else
    {
        if (vNum1 == 0 && vNum2 == 0)
        {
            printf("No se puede dividir 0 / 0");
        } else
        {
            printf("\nDividir:\n %f / %f = ", vNum1, vNum2);
            if (vNum1 != 0 && vNum2 == 0)
            {
                printf("No se puede dividir entre 0");
            } else
            {
                if (vNum1 == 0 && vNum2 != 0)
                {
                    printf("0");
                }
            }
        }
    }
}
