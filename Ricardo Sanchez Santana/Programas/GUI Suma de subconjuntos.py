import random
import time
import threading
from multiprocessing import Process
from tkinter import *

raiz=Tk()

#configuración visual
raiz.title("Suma de subconjuntos")#Se crea la raiz donde estaran los wid
raiz.resizable(False, False)#no se podra ajustar el tamaño
#raiz.geometry("700x450")#Se cambia el tamaño (el tamaño se ajusta automatico)
#raiz.config(bg="#34495e")#Color del fondo

#Empaquetado del Frame
miFrame=Frame()#creacion del frame
miFrame.pack()#Empaquetado del frame en la raiz
miFrame.config(bg = "#34495e")#color de fondo del frame
miFrame.config(width = "1000", height="650")#Tamaño del Frame
miFrame.config(cursor = "pirate")#cambio del tipo de cursor


#labels
#etiqueta 1
etiquetaTitulo = Label(miFrame, text = "</Suma de subconjuntos salpingoclasicos/>")
etiquetaTitulo.config(bg = "#34495e")
etiquetaTitulo.config(fg = "#ffffff")
etiquetaTitulo.config(font = ("Consolas", 14))	
etiquetaTitulo.place(x = 290, y = 50)

#Cuadros de texto
#Cuadro donde se muestran los conjuntos
cuadroSubconjuntos = Text(miFrame)
cuadroSubconjuntos.config(width = "70", height = "30")
cuadroSubconjuntos.place(x = 80, y = 100)
cuadroSubconjuntos.config(bg = "#fdfefe")

#scroll del cuadro de texto
scrollVert = Scrollbar(miFrame, command=cuadroSubconjuntos.yview)
scrollVert.place(x = 644, y = 101)
scrollVert.config(width = "20")

#empieza el algoritmo
def subZero(n, contador, tiempo, conjunto):

    start_time = time.time()

    #print(conjunto)
    sumaSub = 0
    cont = 1
    for subconjunto in conjunto:
        print(subconjunto)
        sumaSub = sum(subconjunto)
        cont += 1
        cuadroSubconjuntos.insert(INSERT, "\nResultado de la suma de ", subconjunto, " =", sumaSub, "\n...................................")
        #print ("\nResultado de la suma de ", subconjunto, " =", sumaSub, "\n...................................")

        if sumaSub == 0:
            count = 1
            cuadroSubconjuntos.insert(INSERT, "=================================================")

    tiempo = tiempo + (time.time() - start_time)
    #print(f'Tiempo {tiempo}')

#tiempo de latencia    
if __name__ == '__main__':
    n = round(10000)
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
	
#Loop para mantener el frame abierto
raiz.mainloop()

 