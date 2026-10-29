import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import models.Estudiante;

public class Comparators {

    private List<Estudiante> estList;
    private Estudiante[] estArray;

    public Comparators() {
        Estudiante estudiante1 = new Estudiante("Juan", 10);
        estArray = new Estudiante[] {estudiante1, new Estudiante("Maria", 7), new Estudiante("Diego", 3.5), new Estudiante("Pedro", 7), new Estudiante("Pedro", 6.8)};
        estList = new ArrayList<>(List.of(estArray));

        ejemplo1();
        ejemplo2();
        ejemplo3();
        ejemplo4();
        ejemplo5();
        ejemplo6();
        ejemplo7();
        ejemplo8();
        ejemplo9();
        ejemplo10();
        ejemplo11();
    }

    

    /*
        Comparator -> por VALOR
        Lambda directa: nota ascendente
    */
    public void ejemplo1(){
        System.out.println("Ejemplo 1: ");
        //Copiar el arreglo
        List<Estudiante> lista = new ArrayList<>(estList);
        //Comparator -> Obj != (Envolvente de primitivo ni String)
        Comparator<Estudiante> comparador = Comparator.comparingDouble(x -> x.getNota()); 
        lista.sort(comparador);
        //Imprimir
        imprimir(lista);
    }

    /*
        Ordenar ascendente
        Comparator -> por VALOR
        Referencia
    */
    public void ejemplo2(){
        System.out.println("Ejemplo 2: ");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparingDouble(Estudiante :: getNota);
        lista.sort(comparator);

        imprimir(lista);
    }

    /*
        Ordenar descendente
    */
    private void ejemplo3() {
        System.out.println("Ejemplo 3: ");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparingDouble(Estudiante :: getNota).reversed();
        lista.sort(comparator);
        
        imprimir(lista);
    }

    private void ejemplo4() {
        
        System.out.println("Ejemplo 4: ");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparing(Estudiante :: getNombre).reversed();
        lista.sort(comparator);
        
        imprimir(lista);

    }
    
    private void ejemplo5() {
        
        System.out.println("Ejemplo 5: ");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = (e1, e2) -> Double.compare(e1.getNota(), e2.getNota());
        lista.sort(comparator);
        
        imprimir(lista);

    }

    /*
        Por nombre ascendente
    */
    private void ejemplo6() {
        
        System.out.println("Ejemplo 6: ");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = (e1, e2) -> e1.getNombre().compareTo(e2.getNombre());
        lista.sort(comparator);
        
        imprimir(lista);

    }

    /*
        por nota DESCENDENTE
    */

    private void ejemplo7() {
        
        System.out.println("Ejemplo 7: ");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = ((e1, e2) -> Double.compare(e2.getNota(), e1.getNota()));
        lista.sort(comparator);
        
        imprimir(lista);

    }

    private void ejemplo8() {
        
        System.out.println("Ejemplo 8: ");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = (e1, e2) -> {
            int comp = Double.compare(e1.getNota(), e2.getNota());
            if(comp != 0)
                return comp;
            return e2.getNombre().compareTo(e1.getNombre());
        };
        lista.sort(comparator);
        
        imprimir(lista);

    }

    private void ejemplo9() {
        
        System.out.println("Ejemplo 9: ");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator
                .comparingDouble(Estudiante::getNota)
                .thenComparing(Estudiante::getNombre);
        lista.sort(comparator);
        
        imprimir(lista);

    }

    private void ejemplo10() {
        
        System.out.println("Ejemplo 10: ");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.<Estudiante>comparingDouble(e -> e.getNota())
            .reversed()
            .thenComparing(Estudiante::getNombre);

        lista.sort(comparator);
        
        imprimir(lista);

    }

    private void ejemplo11() {
        
        System.out.println("Ejemplo 11: ");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.<Estudiante>comparingDouble(e -> e.getNota()).reversed().thenComparing(Estudiante::getNombre);

        lista.sort(comparator);
        
        imprimir(lista);;

    }

    private void imprimir(List<Estudiante> list){
        for (Estudiante e : list) {
            System.out.println(e);
        }
    }
}