/**
 * @license
 * Copyright (c) 2017 Bruno Esparza, Jorge Hurtado
 *
 * Use of this source code is governed by an MIT-style license that can be found in
 * the LICENSE file at https://github.com/baesparza/ProyectoFinal-Programacion/blob/master/LICENSE
 */
package test;

import algoritmos.InsertionSort;
import algoritmos.Quicksort;
import algoritmos.InsertionSortInteger;
import algoritmos.BubbleSort;
import algoritmos.SelectionSort;
import algoritmos.JavaSort;
import algoritmos.ShellSort;

import java.util.Scanner;

public class test {
    /**
     * Clase para las pruebas 
     */

    public static void main(String[] args) {
        /**
         * Scanner
         * Presentamos y pedimos que ingrese el tipo de lista que cargaremos para las pruebas
         * 1) Desordenada
         * 2) Ordenada invertida
         * 
         * Creamos los algoritmos de ordenar con la ocion para que carguen la misma lista
         * 
         * Cada algoritmo se ejecuta y cada algoritmo presenta sus datos
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Ejercicio");
        System.out.println();
        System.out.print("Ingrese el Tipo de lista que desea cargar: ");
        int opc = Integer.parseInt(input.next());

        InsertionSort insertionSort = new InsertionSort(opc);
        Quicksort heapSort = new Quicksort(opc);
        InsertionSortInteger insertionSortInteger = new InsertionSortInteger(opc);
        BubbleSort bubbleSort = new BubbleSort(opc);
        SelectionSort selectionSort = new SelectionSort(opc);
        JavaSort javaSort = new JavaSort(opc);
        ShellSort shellSort = new ShellSort(opc);

        System.out.println();
        insertionSort.run();

        System.out.println();
        heapSort.run();

        System.out.println();
        insertionSortInteger.run();
        
        System.out.println();
        bubbleSort.run();
        
        System.out.println();
        selectionSort.run();
        
        System.out.println();
        javaSort.run();
        
        System.out.println();
        shellSort.run();
    }
}
