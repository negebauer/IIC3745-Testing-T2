# IIC3745 Testing - Tarea 2

## [Repo negebauer](https://github.com/negebauer/IIC3745-Testing-T2)

### Implementado

- Generadores: 1.5 puntos
  - Fraction ✅
	- Vector ✅
- Implementación de la Librería: 1.5 puntos
  - Fraction
	- Vector
- Testing de propiedades: 1.5 puntos
  - Fraction
	- Vector
- Análisis de Property Testing: 2 puntos ✅


### Análisis Property Testing

- 1.A ¿Cuáles son sus ventajas?
  - 1.B ¿Qué garantías entrega Property Testing sobre un componente de software?
- 2.A ¿Cuáles son sus limitaciones?
  - 2.B ¿Son necesarios los Unit Test si se tiene acceso a Property Tests?
- 3.A Justifique la idea de "representar las propiedades testeadas a través de lógica de primer orden"
  - 3.B ¿Qué forma de lógica corresponde a Unit Testing bajo este criterio?

### 1.A ¿Cuáles son sus ventajas?

Las ventajas de Property Testing son que, a diferencia de Unit Testing que prueba una funcionalidad particular (o un comportamiento de ella), prueban propiedades del software. Esto es por ende más general y nos permite probar de manera más fácil con una gran cantidad de inputs. Es decir, en vez de ir probando ejemplo a ejemplo, si definimos bien las propiedades se puede evaluar fácilmente el comportamiento en un rango definido. Permite encontrar problemas con casos particulares, como casos borde o valores que no se habían considerado a la hora de hacer la programación. Ejemplo: Una función que procesa strings y que asume que un string no tenga el carácter `/`, sin especificarlo, puede caerse con una prueba PT (que use strings random por ejemplo), lo que permite identificar dicho problema y ya sea cambiar la especificación de dicha función o manejar cuando el string tenga `/`

### 2.A ¿Cuáles son sus limitaciones?

Dado que lo que prueban son propiedades pueden no servir para ciertos casos. Por ejemplo, supongamos que se tiene un formulario donde se deben repartir valores entre distintos campos, siguiendo ciertas reglas (asumamos que el formulario se ajusta para que se cumplan, por ejemplo, si uno aumenta un campo otro disminuye solo). Dichas reglas pueden tomarse como una propiedad y luego ser probadas con PT. Con PT podemos probar usando un gran rango de valores que todas las reglas se cumplan. Pero ahora pensemos en el envio de dicho formulario, lo cual debe hacer un cambio específico en una base de datos. Dicho cambio podría no ser modelable como propiedad, por lo que debería ser probado con un Unit Test, ya que PT no podría hacerlo.
