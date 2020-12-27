# Functional Programming Summary

### Programación funcional
es un paradigma, es un estilo de programación
    haskell, erlang
	a partir de Java 8 da la posibilidad de programar funcionalmente
	Beneficios:
	
		- Legibilidad (mas explicitas, mas claro lo que hace que en como lo hacen)
		- Facilita los testing: al tener el codigo separado en funciones resolviendo pequeños problemas
		- comportamientos mas definidos: funciones simples que vamos a poder leerlas mas rapidamente
		- Menor manejo de estados: ya no vamos a preocuparnos por que objeto tiene el dato que necesitamos en el momento que esta corriendo nuestra aplicacion
		- Facilita el trabajo en paralelo

### Funciones
En la programación funcional una función es un tipo de dato que puede operar sobre un dato X y genera un dato Y.	
Idealmente, una función por cada X siempre va a generar la misma Y

+ Las funciones pueden generar o no un resultado.

+ Las funciones se definen, almacenan o declaran bajo demanda como cualquier otro tipo de dato.

+ Pueden definirse funciones con respecto a otras funciones

        esPar(x) = !esNon(x).

+ Pueden definirse funciones con respecto a sí mismas (Recursividad).

+ Pueden existir funciones que toman a otras funciones como parámetros:
    
        f(x, g(x)) = x2 * (gx)

### Funciones de primera clase
ahora se puede trabajar las funciones como variables. declararlas, usarlas como parametros, retornarlas. incluso defininirla bajo demanda. asi como:
    
    funWithString("hola")

    funWithFun(x -> x * 2);

### Funciones puras (pure functions)
es una funcion que siempre genera el mismo resultado para el mismo parametros. No tiene dependencias externas. Son deterministas: nosotros podemos predecir el resultado
    una funcion pura puede llamar a otra funcion pura y seguira siendo una funcion pura
### Funciones inpuras
las que no son puras

### Efectos secundarios (side effects)
todo cambio observable desde fuera del sistema (leer, crear, modf, borrar archivos, base de datos, alterar un objeto usado por otras funciones) 
    (son necesarios e inevitables, pero debemos evitarlos, porque nos ayuda a tener mejor estructura y mejor separadas las responsabilidades) 
### Funciones de orden mayor (high order functions)
debe cumplir al menos una de las siguientes reglas
    toma otra funcion o funciones como parametro
    retorna una funcion

### Lambda: 

Parten del concepto "lambda Calculus" propuesto por Alonzo Church Matematico en los años 30:
    El proponia que se podian obtener resultados de una operacion a partir de funciones anonimas (la teoria es mas compleja)
entonces basicamente una funcion anonima es una lambda eso es todo
Por que usarlas:
    un comportamiento unico o muy especifico. Idealmente que sea simple
