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

    // constructor con los atributos de la clase Sort
    public InsertionSortInteger(int opc) {
        super("Insertion Sort Integer ");
        this.lista = this.cargarLista(opc);
    }

    public void sortList() {
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
        this.sortList();
        this.presentar();
    }
}
