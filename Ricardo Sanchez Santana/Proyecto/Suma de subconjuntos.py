import random
import time
import threading
from multiprocessing import Process

def subZero(numRep, tiempoEjec, contRep, numConjs):
    start_time = time.time()
    sumaSub = 0
    cont = 1
    contadorCeros = 0
    for subconjunto in numConjs:
        print("Subconjunto generado: ",subconjunto)
        sumaSub = sum(subconjunto)
        cont += 1
        print ("Resultado de la suma de: (", subconjunto[0],") + (",subconjunto[1], ") + (", subconjunto[2],  ") =", sumaSub, "\n...................................")
        if sumaSub == 0:
            contadorCeros += 1
            count = 1
            print ("<<<<<<<<<<<<<<<<<<<<<<< Nuevos Subconjuntos >>>>>>>>>>>>>>>>>>>>>>>>>")
            tiempoEjec = (tiempoEjec + (time.time() - start_time))*100
    print(f'Tiempo {tiempoEjec}')
    print("numero de subconjuntos que suman 0: ", contadorCeros)


if __name__ == '__main__':
    numRep = round(1000) #Aqui puede ingresar el numero de subconjuntos que necesita
    contRep = 0
    tiempoEjec = 0
    listaSubscojs = []
    for i in range(0, numRep):
        numConjs = [random.randrange(-10, 10),random.randrange(-10, 10),random.randrange(-10, 10)]
        listaSubscojs.append(numConjs)

    t = Process(target=subZero, args=(numRep, contRep, tiempoEjec, listaSubscojs))
    t.start()
    t.join()
