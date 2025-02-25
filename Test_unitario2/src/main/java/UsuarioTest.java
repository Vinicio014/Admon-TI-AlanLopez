import static org.junit.jupiter.api.Assertions.*;//Importa todos los métodos estáticos de la clase Assertions de JUnit 5.
import org.junit.jupiter.api.Test;//Importa la anotación @Test de JUnit. La anotación le dice a JUnit que el método es una prueba que debe ejecutarse.

/**
 *Description of connection
 * @author Alan Vinicio Lopez Jacinto <alopezj8@miumg.edu.gt>
 */
public class UsuarioTest {//Declara una clase llamada UsuarioTest
    @Test//Indica que el siguiente método es una prueba que debe ser ejecutada por JUnit.

    void testGetNombre() {//verifica si el método getNombre() de la clase Usuario funciona correctamente, sin retornar ningun valor.
        Usuario usuario = new Usuario("Alan",21);//Objeto de tipo Usuario llamado usuario, con valor "Alan" al constructor de la clase Usuario.
        assertEquals("Alan", usuario.getNombre());//asserEquals valida si el valor esperado (Alan) es igual al valor real del resultado.
        System.out.println("Prueba testGetNombre pasó correctamente");//Mensaje de exito cuando el test es correcto.
    }

    @Test//Indica que el siguiente método es una prueba que debe ser ejecutada por JUnit.
    void testSetNombre() {//verifica si el método setNombre() de la clase Usuario funciona correctamente, sin retornar ningun valor.
        Usuario usuario = new Usuario("Alan", 21);// Crea un usuario con nombre "Alan" con edad 25
        usuario.setNombre("Carlos");// Cambiamos el nombre a "Carlos"
        assertEquals("Carlos", usuario.getNombre());// Verificamos que el nombre cambió correctamente
        System.out.println("Prueba testSetNombre pasó correctamente");//Mensaje de exito cuando el test es correcto.
    }

    @Test//Indica que el siguiente método es una prueba que debe ser ejecutada por JUnit.
    void testGetEdad() {//verifica si el método getEdad() de la clase Usuario funciona correctamente, sin retornar ningun valor.
        Usuario usuario = new Usuario("Alan", 25); // Crea un usuario con edad 25
        assertEquals(25, usuario.getEdad()); // Comprueba que la edad sea 25
        System.out.println("Prueba testGetEdad pasó correctamente");//Mensaje de exito cuando el test es correcto.
    }

    @Test//Indica que el siguiente método es una prueba que debe ser ejecutada por JUnit.
    void testSetEdad() {//verifica si el método setNombre() de la clase Usuario funciona correctamente, sin retornar ningun valor.
        Usuario usuario = new Usuario("Alan", 21);// Crea un usuario con edad 21
        usuario.setEdad(30);// Cambia la edad a 30
        assertEquals(30, usuario.getEdad());// Verifica que la edad cambió correctamente
        System.out.println("Prueba testSetEdad pasó correctamente");//Mensaje de exito cuando el test es correcto.
    }

    @Test//Indica que el siguiente método es una prueba que debe ser ejecutada por JUnit.
    void testEsMayorDeEdad() {//verifica si el método EsMayorDeEdad() de la clase Usuario funciona correctamente, sin retornar ningun valor.
        Usuario usuario1 = new Usuario("Juan", 25);// Usuario mayor de edad (25 años)
        Usuario usuario2 = new Usuario("Luis", 15);// Usuario menor de edad (15 años)
        assertTrue(usuario1.esMayorDeEdad(), "Juan debería ser mayor de edad");// Debe ser true
        assertFalse(usuario2.esMayorDeEdad(), "Luis no debería ser mayor de edad");// Debe ser false, ya que este no es mayor de edad.
        System.out.println("Prueba testEsMayorDeEdad pasó correctamente");//Mensaje de exito cuando el test es correcto.
    }

}