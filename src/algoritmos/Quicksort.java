/**
 * @license
 * Copyright (c) 2017 Bruno Esparza, Jorge Hurtado
 *
 * Use of this source code is governed by an MIT-style license that can be found in
 * the LICENSE file at https://github.com/baesparza/ProyectoFinal-Programacion/blob/master/LICENSE
 */
package algoritmos;

public class Quicksort extends Sort {

    public Quicksort(int opc) {
        /**
         * Recive la opcion de la lista a cargar,  llama a la funcion que carga la lista, y la guarda el la variable lista
         * envia el nombre del algorirmo a la clase padre(super)
         */

        super("Quick Sort");
        this.lista = this.cargarLista(opc);
    }

    public void sortlist_start() {
        /**
         * Inicia timer
         * Algoritmo Quick Sort
         * se llama add_cont_procesos para aumentar el contador 
         * Para el timer
         * Se guarda el tiempo en una variable para presentarla
         */

        this.timer.start();
        this.sortList(this.lista, 0, this.lista.length - 1);
        this.timer.stop();
        this.set_time(this.timer.time());
    }

    public void sortList(int[] array, int inicio, int fin) {
        /**
         * Algoritmo Quick Sort
         * se llama add_cont_procesos para aumentar el contador
         */

        int i = inicio, j = fin;
        if (fin - inicio >= 1) {
            int pivot = array[fin];
            while (i < j) {
                while (array[i] < pivot && i < fin) {
                    i++;
                    this.add_cont_procesos();
                }
                while (array[j] >= pivot && j > inicio) {
                    j--;
                    this.add_cont_procesos();
                }
                if (i < j) {
                    this.swap(array, i, j);
                    this.add_cont_procesos();
                }
            }
            this.swap(array, fin, i);
            this.add_cont_procesos();
            this.sortList(array, inicio, i - 1);
            this.sortList(array, i + 1, fin);
            this.add_cont_procesos();
        } else {
            return;
        }
    }

    public void swap(int[] ar, int index1, int index2) {
        /**
         * Algoritmo Intercambia 2 numeros
         * se llama add_cont_procesos para aumentar el contador
         */
        
        int temp = ar[index1];
        ar[index1] = ar[index2];
        ar[index2] = temp;
        this.add_cont_procesos();
    }

    public void run() {
        /**
         * Ejecuta el algoritmo
         * y la funcion para presentar resultados
         */
        
        this.sortlist_start();
        this.presentar();
    }
}
