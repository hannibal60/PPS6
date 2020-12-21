import random
import time
from multiprocessing import Process
import this

def subZero(n, contador, tiempo, conjunto):

    start_time = time.time()

    #print(conjunto)
    sumaSub = 0
    cont = 1
    for subconjunto in conjunto:
        print(subconjunto)
        sumaSub = sum(subconjunto)
        cont += 1
        print(cont)
        '''if cont == 2500:
            break'''
        print ("resultado", sumaSub)

        if sumaSub == 0:
            print ("=================================================")

    tiempo = tiempo + (time.time() - start_time)
    print(f'Tiempo {tiempo}')



if __name__ == '__main__':
    n = round(1000)
    contador = 0
    tiempo = 0

    listaC = []

    for i in range(0, n):
        conjunto = [random.randrange(-10, 10),random.randrange(-10, 10),random.randrange(-10, 10)]
        listaC.append(conjunto)
    #print(listaC)

    t = Process(target=subZero, args=(n, contador, tiempo, listaC))

    t.start()
    t.join()