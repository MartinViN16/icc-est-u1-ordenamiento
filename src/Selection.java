
public class Selection {
    public void sort(int[] arreglo) {
        int cambios = 0;
        int comparaciones = 0;
        for (int i = 0; i < arreglo.length; i++) {
            int minimo = i;
            int pasada = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                comparaciones += 1;
                if (arreglo[j] < arreglo[minimo]) {
                    minimo = j;
                }
            }
            if (minimo != i) {
                cambios += 1;
                int temp = arreglo[minimo];
                arreglo[minimo] = arreglo[i];
                arreglo[i] = temp;
                System.out.println("Pasada= " + pasada + " | cambio " + arreglo[minimo] + "<->" + arreglo[i]);
            }

        }
        System.out.println("Cambios: " + cambios);
        System.out.println("Comparaciones: " + comparaciones);
    }
}
