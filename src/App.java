import java.util.Arrays;
import java.util.Comparator;

import models.Estudiante;

public class App {

    public static void main(String[] args) throws Exception {        
        //runEjemplosPrimitivos();
        runEjemplosObjetos();
        runComparators();
    }

    private static void runComparators(){
        Integer[] original = {5, 6, 4, 1, 2, 3};
        Arrays.sort(original);
        for (int i = 0; i < original.length; i++) {
            System.out.println(original[i]);
        }
        System.out.println("------------");
        Arrays.sort(original, Comparator.reverseOrder());
        for (int i = 0; i < original.length; i++) {
            System.out.println(original[i]);
        }
    }

    private static void runEjemplosObjetos() {
        Estudiante estudiante1 = new Estudiante("Pepe", 10);
        Estudiante[] estudiantes = {estudiante1, new Estudiante("Maria", 7), new Estudiante("Diego", 3.5), new Estudiante("Pedro", 6.8)};
        Estudiante[] estudiantes2 = estudiantes.clone();

        Bubble bubble = new Bubble();
        System.out.println("Original: ");
        printArregloEstudiantes(estudiantes);
        bubble.sortEstudiantesPorNota(estudiantes);
        System.out.println("Ordenado: ");
        printArregloEstudiantes(estudiantes);
        System.out.println();
        // bubble.sortEstudiantesPorNombre(estudiantes2);
        // printArregloEstudiantes(estudiantes2);
    }

    private static void runEjemplosPrimitivos() {
        int[] original = {5, 6, 4, 1, 2, 3};
        int[] b = original.clone();
        int[] c = original.clone();
        int[] d = original.clone();


        //USAR EL METODO DEL ARCHIVO(clase) BUBBLE
        //INSTANCIAR el archivo BUBBLE
        //INSTANCIA la clase BUBBLE
        Bubble bubble = new Bubble();
        //INSTANCIA la clase SELECTION
        Selection selection = new Selection();
        //INSTANCIA la clase INSERTION
        InsertionSort insertion = new InsertionSort();

        System.out.println("\nBubble sort\n");

        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);

        System.out.println("\nSelection sort\n");

        System.out.println("Original:");
        printArreglo(c);
        selection.sort(c);
        System.out.println("Ordenado asc:");
        printArreglo(c);

        System.out.println("\n--- Selection Insertion ---\n");

        System.out.println("Original:");
        printArreglo(d);
        insertion.sort(d);
        System.out.println("Ordenado Des:");
        printArreglo(d);
    }

    public static void printArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " - ");
        }
        System.out.println();        
    }

    public static void printArregloEstudiantes(Estudiante[] estudiantes) {
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i]);
        }       
    }
}
