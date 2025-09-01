"""
1. Elaborar un programa en Java que imprima el costo de un pedido de un artículo del cual se 
tiene la descripción, la cantidad pedida y el precio unitario. Si la cantidad pedida es mayor a 
50 unidades, se hace un descuento de 15%.
2. De tarea, hacer el mismo ejercicio 1 en python.
"""

yn = ""
descuent = 0

articulos = [
    ["Raspberry Pi 4 (4GB RAM)", 1800, "Microcomputadora ideal para proyectos de automatización"],
    ["Multímetro digital UNI-T UT61E", 950, "Herramienta precisa para diagnóstico electrónico avanzado"],
    ["SSD NVMe Kingston 1TB", 350, "Almacenamiento ultrarrápido para simulaciones y IA"],
    ["Fuente conmutada 24V 10A", 620, "Alimentación robusta para motores y drivers"],
    ["Tester USB-C multifunción", 280, "Valida carga, voltaje y protocolos en tiempo real"]
]
while(True):
    print("Catalogo de articulos, porfavor escoja un articulo")
    print(f"1. {articulos[0][0]}\n2. {articulos[1][0]}\n3. {articulos[2][0]}\n4. {articulos[3][0]}\n5. {articulos[4][0]}")
    artc = int(input("Articulo: "))

    match artc:
        case 1: 
            print(f"-{articulos[0][0]}-\n{articulos[0][2]}")
            print(f"Precio unitario: {articulos[0][1]}")
        case 2: 
            print(f"-{articulos[1][0]}-\n{articulos[1][2]}")
            print(f"Precio unitario: {articulos[1][1]}")
        case 3: 
            print(f"-{articulos[2][0]}-\n{articulos[2][2]}")
            print(f"Precio unitario: {articulos[2][1]}")
        case 4: 
            print(f"-{articulos[3][0]}-\n{articulos[3][2]}")
            print(f"Precio unitario: {articulos[3][1]}")
        case 5: 
            print(f"-{articulos[4][0]}-\n{articulos[4][2]}")
            print(f"Precio unitario: {articulos[4][1]}")
        case _: 
            print("Articulo no encontrado, por favor escriba el numero de una articulo valido")
    
    if artc in range(1, len(articulos)):
        yn = input("Quieres comprar este articulo (s/n): ")
        while(yn not in ["s", "n"]):
            yn = input("Quieres comprar este articulo (s/n): ")

        if yn == "s":
            print("en la compra de mas de 50 unidades le damos el 15% de descuento")
            cant = int(input("Cuantas unidades deseas: "))

            subtot = cant * articulos[artc][1]

            print(f"Subtotal: {subtot:.2f}")

            if cant > 50:
                descuent = 0.15
                print(f"Descuento: {(subtot * descuent):.2f}")

            print(f"Total: {(subtot - descuent):.2f}")    
            break    

