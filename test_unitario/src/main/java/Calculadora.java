public class Calculadora {
    public static int suma(int a, int b) {//clase publica llamada suma, recibe dos parametros los cuales permiten el ingreso de 2 numeros
        return a + b;//realiza la suma los dos numeros ingresados
    }

    public static int resta(int a, int b) {//clase publica llamada resta, recibe dos parametros los cuales permiten el ingreso de 2 numeros
        return a - b;//realiza la resta los dos numeros ingresados
    }

    public static int multiplicacion(int a, int b) {//clase publica llamada multiplicacion, recibe dos parametros los cuales permiten el ingreso de 2 numeros
        return a * b;//realiza la multiplicacion los dos numeros ingresados
    }

    public static double division(int a, int b) {//clase publica llamada division, recibe dos parametros los cuales permiten el ingreso de 2 numeros
        if (b == 0) {// Verifica si 'b' es 0 para evitar una división por cero, lo que podria provocar un error.
            throw new ArithmeticException("No se puede dividir por cero");//Si 'b' es 0, lanza una excepción de tipo ArithmeticException con un mensaje.
        }
        return (double) a / b;// Realiza la división convirtiendo el resultado a tipo double para obtener un valor decimal, esto
                             //debido a que pueden ingresarse cualquier tipo de datos, es decir, enteror o decimales.
    }
}
