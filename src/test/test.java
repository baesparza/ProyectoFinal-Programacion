/**
 * @license
 * Copyright (c) 2017 Bruno Esparza, Jorge Hurtado
 *
 * Use of this source code is governed by an MIT-style license that can be found in
 * the LICENSE file at https://github.com/baesparza/ProyectoFinal-Programacion/blob/master/LICENSE
 */
package test;

import generador.generador;

import algoritmos.InsertionSort;
import algoritmos.Heapsort;
import algoritmos.Mergesort;

import java.util.Scanner;

public class test {

    static Scanner input = new Scanner(System.in);

    // inicializamos el generador
    static generador gen = new generador(300);

    private static int[] lista;

    public static void main(String[] args) {
        
        // Pedimo La lista a generar
        cargarLista();

        //creo un nuevo objeto por cada algoritmo de sort
        InsertionSort insertionSort = new InsertionSort(lista);
        Heapsort heapSort = new Heapsort(lista);
        Mergesort mergeSort = new Mergesort(lista);

        insertionSort.sortList();
        insertionSort.presentar();

        System.out.println();

        heapSort.sortList();
        heapSort.presentar();

        System.out.println();

        mergeSort.sortList();
        mergeSort.presentar();
    }

    public static void cargarLista() {
        /**
         * Dependiendo de la opcion que el usuario elija(opc) cargamos uno de
         * los 3 tipos de listas para realizar las pruebas.
         */
        System.out.print("Ingrese el Tipo de lista que desea cargar: ");
        int opc = Integer.parseInt(input.next());
        switch (opc) {
            case (1):
                // lista semi ordenada
                lista = gen.semiordenada();
                break;
            case (2):
                // lista desordenada
                lista = gen.desordenada();
                break;
            case (3):
                // lista ordenada al reves
                lista = gen.invertida();
                break;
            default:
                cargarLista();
                break;
        }
    }
}
