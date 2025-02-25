import static org.junit.jupiter.api.Assertions.assertEquals;//Importa todos los métodos estáticos de la clase Assertions de JUnit 5.
import org.junit.jupiter.api.Test;//Importa la anotación @Test de JUnit. La anotación le dice a JUnit que el método es una prueba que debe ejecutarse.

/**
 *Description of connection
 * @author Alan Vinicio Lopez Jacinto <alopezj8@miumg.edu.gt>
 */

public class CalculadoraTest {//Declara una clase llamada CalculadoraTest, que es la clase que contiene las pruebas unitarias.
    @Test//Indica que el siguiente método es una prueba que debe ser ejecutada por JUnit.

    void testSuma() {//verificará el funcionamiento del método suma de la clase Calculadora, sin retornar nigun valor.
        int resultado = Calculadora.suma(1, 2);//Llama al método estático suma de la clase Calculadora pasando dos valores: 1 y 2.
        assertEquals(3, resultado);//asserEquals valida si el valor esperado (3) es igual al valor real del resultado.
        System.out.println("Prueba testSuma pasó correctamente");//Mensaje de exito cuando el test es correcto.
    }

    @Test//Indica que el siguiente método es una prueba que debe ser ejecutada por JUnit.

    void testResta() {//verificará el funcionamiento del método resta de la clase Calculadora, sin retornar nigun valor.
        int resultado = Calculadora.resta(5, 2);//Llama al método estático resta de la clase Calculadora pasando dos valores: 5 y 1.
        assertEquals(3, resultado);//asserEquals valida si el valor esperado (3) es igual al valor real del resultado.
        System.out.println("Prueba testResta pasó correctamente");//Mensaje de exito cuando el test es correcto.
    }

    @Test
    void testMultiplicacion() {//verificará el funcionamiento del multiplicacion resta de la clase Calculadora, sin retornar nigun valor.
        int resultado = Calculadora.multiplicacion(6, 7);//Llama al método estático multiplicacion de la clase Calculadora pasando dos valores: 6 y 7.
        assertEquals(42, resultado);//asserEquals valida si el valor esperado (42) es igual al valor real del resultado.
        System.out.println("Prueba testMultiplicacion pasó correctamente");//Mensaje de exito cuando el test es correcto.
    }

    @Test
    void testDivision() {//verificará el funcionamiento del método division de la clase Calculadora, sin retornar nigun valor.
        double resultado = Calculadora.division(10, 2);//Llama al método estático division de la clase Calculadora pasando dos valores: 10 y 2.
        assertEquals(5.0, resultado);//asserEquals valida si el valor esperado (5.0) es igual al valor real del resultado.
        System.out.println("Prueba testDivision pasó correctamente");//Mensaje de exito cuando el test es correcto.
    }
}
