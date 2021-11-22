/*Ejercicio 1
        Hacer una función que dado un número indica si es un número primo o no. Un número
        primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
        ya que 25 es divisible por 1, 5 y 25. 17 sí es primo porque solo se puede dividir por 1 y por
        17.
        Usar esta función en un programa, que permita el ingreso de un número y luego llame a la
        función desarrollada para comprobar si es primo o no. Para resolverlo usar la función
        obtenida en el ejercicio desarrollado en la clase asincrónica. boolean esDivisible(int n, int
        divisor)*/


/*package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Integer array []={2, 3, 5, 7, 11};
        Integer contador = 0;

        Scanner miScannerPG = new Scanner(System.in);
        System.out.print("Ingrese el número para saber si es primo: ");
        String numero = miScannerPG.nextLine();
        Integer n=Integer.parseInt(numero);

        for (Integer i = 0; i < array.length; i++) {
            if (esDivisible(n, array[i]) && n!=array[i]) {
                contador += 1;
                System.out.println(" El número " + n + " No es primo.");
                break;
            }
        }
        if (contador==0){
            System.out.println(" El número " + n + " es primo.");
        }
    }

    public static boolean esDivisible (int numero1, Integer numero2) {
        if(numero1%numero2==0){
            return true;
        } else{
            return false;
        }
    }
}*/

/*Ejercicio 2
        Escribir una función que reciba tres números y devuelva el máximo entre los tres números.
        Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer
        unNumeroC)
        Luego hacer un programa que permita el ingreso de 3 valores, utilice la función y muestre
        el resultado.*/

/*
    package com.company;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        Scanner miScannerMax = new Scanner(System.in);
        System.out.println("Para encontrar el máximo entre 3 números, ingrese el primer número: ");
        String n1 = miScannerMax.nextLine();
        Integer numero1 = Integer.parseInt(n1);

        System.out.println("Ingrese el segundo número: ");
        String n2 = miScannerMax.nextLine();
        Integer numero2 = Integer.parseInt(n2);

        System.out.println("Ingrese el tercer número: ");
        String n3 = miScannerMax.nextLine();
        Integer numero3 = Integer.parseInt(n3);

        Integer maximoEntreTres = maximoEntreTresNumeros(numero1, numero2, numero3);
        System.out.println("El máximo entre los 3 números ingresados es el: " + maximoEntreTres);
    }

    public static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC){
        Integer array[]= {unNumeroA,unNumeroB,unNumeroC};
        Arrays.sort(array);
        return array[array.length-1];
    }
}
*/


/*
Ejercicio 3
        Escribir una función:
        boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB)
        que debe tomar dos cadenas de texto y devolver true, en caso de que sean distintos, o
        false, en caso de que coincidan.
*/

/*
    package com.company;
    import java.util.Scanner;
    public class Main {

    public static void main(String[] args) {
        Scanner miScannerPG =new Scanner(System.in);

        System.out.print("Para saber si dos textos son iguales, ingrese el primer texto: ");
        String texto1= miScannerPG.nextLine();
        System.out.print("Ingrese el segundo texto: ");
        String texto2= miScannerPG.nextLine();
        System.out.println("¿Los textos son iguales?: "+ cadenasDeTextoDistintas(texto1, texto2));
    }
    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
        if (unTextoA.compareTo(unTextoB)==0){
            return true;
        }else{
            return false;
        }
    }
}
*/


/*Ejercicio de clase 2

	package com.company;
    import java.util.Scanner;
    public class Main {

    public static void main(String[] args) {

    Scanner miScannerPG =new Scanner(System.in);

    System.out.print("ingrese su nombre: ");
    String unNombre= miScannerPG.nextLine();
    System.out.print("ingrese su apellido: ");
    String unApellido= miScannerPG.nextLine();
    System.out.println("Mi nombre es "+ unNombre+ " "+ unApellido);

    Character inicialNombre= unNombre.charAt(0);//Usar Clases y no el tipo común porque tenemos muchos métodos
    Character inicialApellido= unApellido.charAt(0);
   *//* System.out.println("Mis iniciales son "+ inicialNombre+ inicialApellido);
    System.out.println( inicialNombre.toString()+ inicialApellido.toString());
    System.out.println( inicialNombre+ inicialApellido);//Me tira número (suma de los caracteres//
   *//*
    //String unasIniciales= new StringBuilder().append(inicialNombre).append(inicialApellido); No es aún String
    //String unasIniciales= new StringBuilder().append(inicialNombre).append(inicialApellido).toString();
    String unasIniciales= ""+inicialNombre+inicialApellido;
    System.out.println("Mis iniciales son "+ unasIniciales);


    System.out.print("ingrese su día de nacimiento: ");
    String unDía= miScannerPG.nextLine();
    System.out.print("ingrese su mes de nacimiento: ");
    String unMes= miScannerPG.nextLine();
    System.out.print("ingrese su año de nacimiento: ");
    String unAnio= miScannerPG.nextLine();
    //System.out.println("Mi Fecha de nacimiento es: "+ unDía+ "/"+ unMes+"/"+unAnio);
    System.out.println("Mi Fecha de nacimiento es: "+ fechaCompleta(unDía,unMes,unAnio));

    }
    public static String fechaCompleta(Integer dia, Integer mes, Integer anio){
        return (dia+ "/"+ mes+"/"+anio);
    }
}*/




