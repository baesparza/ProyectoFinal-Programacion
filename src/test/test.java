/**
 * @license
 * Copyright (c) 2017 Bruno Esparza, Jorge Hurtado
 *
 * Use of this source code is governed by an MIT-style license that can be found in
 * the LICENSE file at https://github.com/baesparza/ProyectoFinal-Programacion/blob/master/LICENSE
 */
package test;

import algoritmos.InsertionSort;
import algoritmos.Heapsort;
import algoritmos.Mergesort;
import algoritmos.BubbleSort;
import algoritmos.SelectionSort;
import algoritmos.JavaSort;
import algoritmos.ShellSort;

import java.util.Scanner;

public class test {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // variables y Pedimo La lista a generar
        System.out.print("Ejercicio");
        System.out.println();
        System.out.print("Ingrese el Tipo de lista que desea cargar: ");
        int opc = Integer.parseInt(input.next());

        //creo un nue= vo objeto por cada algoritmo de sort
        InsertionSort insertionSort = new InsertionSort(opc);
        Heapsort heapSort = new Heapsort(opc);
        Mergesort mergeSort = new Mergesort(opc);
        BubbleSort bubbleSort = new BubbleSort(opc);
        SelectionSort selectionSort = new SelectionSort(opc);
        JavaSort javaSort = new JavaSort(opc);
        ShellSort shellSort = new ShellSort(opc);

        System.out.println();

        insertionSort.sortList();
        insertionSort.presentar();

        System.out.println();

        heapSort.sortList();
        heapSort.presentar();

        System.out.println();

        mergeSort.sortList();
        mergeSort.presentar();
        
        System.out.println();
        
        bubbleSort.sortList();
        bubbleSort.presentar();
        
        System.out.println();
        
        selectionSort.sortList();
        selectionSort.presentar();
        
        System.out.println();
        
        javaSort.sortList();
        javaSort.presentar();
        
        System.out.println();
        
        shellSort.sortList();
        shellSort.presentar();
    }
}
