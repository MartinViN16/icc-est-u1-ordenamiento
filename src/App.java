
public class App {

    public static void main(String[] args) throws Exception {

        int[] original = {5, 6, 4, 1, 2, 3};
        int[] b = original.clone();
        int[] c = original.clone();

        //USAR EL METODO DEL ARCHIVO(clase) BUBBLE
        //INSTANCIAR el archivo BUBBLE
        //INSTANCIA la clase BUBBLE
        Bubble bubble = new Bubble();
        //INSTANCIA la clase SELECTION
        Selection selection = new Selection();

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
    }

    public static void printArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " - ");
        }
        System.out.println();
    }
}
