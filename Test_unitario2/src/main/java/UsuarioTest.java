import static org.junit.jupiter.api.Assertions.*;//Importa todos los métodos estáticos de la clase Assertions de JUnit 5.
import org.junit.jupiter.api.Test;//Importa la anotación @Test de JUnit. La anotación le dice a JUnit que el método es una prueba que debe ejecutarse.

/**
 *Description of connection
 * @author Alan Vinicio Lopez Jacinto <alopezj8@miumg.edu.gt>
 */
public class UsuarioTest {//Declara una clase llamada UsuarioTest
    @Test//Indica que el siguiente método es una prueba que debe ser ejecutada por JUnit.

    void testGetNombre() {//verifica si el método getNombre() de la clase Usuario funciona correctamente, sin retornar ningun valor.
        Usuario usuario = new Usuario("Alan");//Objeto de tipo Usuario llamado usuario, con valor "Alan" al constructor de la clase Usuario.
        assertEquals("Alan", usuario.getNombre());//asserEquals valida si el valor esperado (Alan) es igual al valor real del resultado.
        System.out.println("Prueba testGetNombre pasó correctamente");//Mensaje de exito cuando el test es correcto.
    }
}