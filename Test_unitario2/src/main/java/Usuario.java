public class Usuario {//Declara una clase llamada Usuario.
    private String nombre;//Declara un atributo privado llamado nombre de tipo String y este almacenará el nombre del usuario.
    private int edad;//Declara un atributo privado llamado edad de tipo entero y este almacenará la edad del usuario.

    public Usuario(String nombre, int edad) {//Constructor de la clase Usuario y recibe un parametro que es el nombre
        this.nombre = nombre;//this.nombre se refiere al atributo de la clase y nombre es el parámetro pasado al constructor.
        this.edad = edad;
    }

    public String getNombre() {//Permite obtener el valor del atributo nombre.
        return nombre;//Retorna el valor almacenado en el atributo nombre.
    }
    public void setNombre(String nombre) {//Permite mandar el valor del atributo nombre.
        this.nombre = nombre;//Retorna el valor almacenado en el atributo nombre.
    }

    public int getEdad() {//Permite obtener el valor del atributo edad.
        return edad;//Retorna el valor almacenado en el atributo edad.
    }

    public void setEdad(int edad) {//Permite mandar el valor del atributo edad.
        this.edad = edad;//Retorna el valor almacenado en el atributo edad.
    }

    public boolean esMayorDeEdad() {//Permite mandar el valor del atributo esMayorDeEdad.
        return edad >= 18;//Retorna el valor almacenado en el atributo .
    }



}
