"""
3. Elaborar un programa en Java que lea los datos de un estudiante 
(nombre y tres calificaciones parciales) e imprima el nombre y la calificación final de acuerdo 
con lo siguiente: para aprobar el curso debe tener 60 o más en cada una de las tres calificaciones, 
la calificación final será el promedio. En caso de haber reprobado uno o más exámenes ordinarios, 
la calificación final será NA (No Acreditado).
4. De tarea, hacer el mismo ejercicio 3 en python.
"""


import sys

calificacions = [0, 0, 0]
suma  = 0
name = input("Cual es tu nombre: ")

for i in range(3):
    calificacions[i] = int(input(f"Escribe tu calificacion del parcial {i+1}: "))

for i, calif in enumerate(calificacions):
    if calif < 60:
        print(f"Reprobaste en el parcial {i+1}")
        print("Necesitas mas de 60 en cada parcial")
        print("Calificacion final: NA")
        sys.exit(0)

    suma += calif

promedio = suma / 3
print(f"Tu calificacion final es {promedio:.2f}")