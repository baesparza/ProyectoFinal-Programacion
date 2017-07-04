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

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //creo un nuevo objeto de tipo InsertionSort
        InsertionSort insertionSort = new InsertionSort();
        Heapsort heapSort = new Heapsort();
        Mergesort mergeSort = new Mergesort();

        insertionSort.cargarLista(1);
        insertionSort.sortList();
        insertionSort.presentar();
        
        System.out.println();
        
        heapSort.cargarLista(1);
        heapSort.sortList();
        heapSort.presentar();
        
        System.out.println();
        
        mergeSort.cargarLista(1);
        mergeSort.sortList();
        mergeSort.presentar();
    }
}
