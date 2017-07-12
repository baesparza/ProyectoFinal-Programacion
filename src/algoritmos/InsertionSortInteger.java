/**
 * @license
 * Copyright (c) 2017 Bruno Esparza, Jorge Hurtado
 *
 * Use of this source code is governed by an MIT-style license that can be found in
 * the LICENSE file at https://github.com/baesparza/ProyectoFinal-Programacion/blob/master/LICENSE
 */
package algoritmos;

import java.util.Arrays;

public class InsertionSortInteger extends Sort {

    public InsertionSortInteger(int opc) {
        /**
         * Recive la opcion de la lista a cargar,  llama a la funcion que carga la lista, y la guarda el la variable lista
         * envia el nombre del algorirmo a la clase padre(super)
         */

        super("Insertion Sort Integer ");
        this.lista = this.cargarLista(opc);
    }

    public void sortList() {
        /**
         * Inicia timer
         * Algoritmo Insertion Sort Integer
         * se llama add_cont_procesos para aumentar el contador 
         * Para el timer
         * Se guarda el tiempo en una variable para presentarla
         */

        this.timer.start();
        
        int[] sortedArray = new int[this.lista.length];
        sortedArray[0] = this.lista[0];

        for (int i = 1; i < this.lista.length; i++) {

            int lastSortedIndex = i;

            int extractedElement = this.lista[i];

            for (lastSortedIndex = i; lastSortedIndex > 0; lastSortedIndex--) {

                if (sortedArray[lastSortedIndex - 1] > extractedElement) {
                    sortedArray[lastSortedIndex] = sortedArray[lastSortedIndex - 1];
                    sortedArray[lastSortedIndex - 1] = extractedElement;
                    this.add_cont_procesos();
                } else {
                    sortedArray[lastSortedIndex] = extractedElement;
                    this.add_cont_procesos();
                    break;
                }
                this.add_cont_procesos();
            }
            this.add_cont_procesos();
        }
        this.lista = sortedArray;
        this.add_cont_procesos();

        this.timer.stop();
        this.set_time(this.timer.time());
    }

    public void run() {
        /**
         * Ejecuta el algoritmo
         * y la funcion para presentar resultados
         */
        
        this.sortList();
        this.presentar();
    }
}
