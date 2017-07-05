/**
 * @license
 * Copyright (c) 2017 Bruno Esparza, Jorge Hurtado
 *
 * Use of this source code is governed by an MIT-style license that can be found in
 * the LICENSE file at https://github.com/baesparza/ProyectoFinal-Programacion/blob/master/LICENSE
 */
package algoritmos;

import Tiempo.Tiempo;

public class InsertionSort extends Sort {

    // timer
    Tiempo timer = new Tiempo();

    // constructor con los atributos de la clase Sort
    public InsertionSort(int[] lista) {
        super(lista);
        this.nombre_algoritmo = "Insertion Sort";
        this.descripcion_algoritmo = "Para ordenar una lista de elementos desordenada, eliminamos sus entradas una a una e insertamos Cada uno de ellos en una parte ya ordenada";
    }

    public void sortList() {
        this.timer.start();
        for (int i = 0; i < this.lista.length; i++) {
            int temp = this.lista[i];
            int j = i - 1;
            while (j >= 0 && temp < this.lista[j]) {
                this.lista[j + 1] = this.lista[j];
                j--;
                this.cont_procesos++;
            }
            this.cont_procesos++;

            this.lista[j + 1] = temp;
        }
        this.timer.stop();
        this.total = this.timer.time();
    }
}
