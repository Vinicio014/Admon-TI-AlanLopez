public class Usuario {//Declara una clase llamada Usuario.
    private String nombre;//Declara un atributo privado llamado nombre de tipo String y este almacenará el nombre del usuario.

    public Usuario(String nombre) {//Constructor de la clase Usuario y recibe un parametro que es el nombre
        this.nombre = nombre;//this.nombre se refiere al atributo de la clase y nombre es el parámetro pasado al constructor.
    }

    public String getNombre() {//Permite obtener el valor del atributo nombre.
        return nombre;//Retorna el valor almacenado en el atributo nombre.
    }
}
