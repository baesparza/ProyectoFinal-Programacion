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
    
    // constructor con los atributos de la clase Sort
    public InsertionSort(int opc) {
        /**
         * Recive la opcion de la lista a cargar,  llama a la funcion que carga la lista, y la guarda el la variable lista
         * envia el nombre del algorirmo a la clase padre(super)
         */

        super("Insertion Sort");
        this.lista = this.cargarLista(opc);
    }

    public void sortList() {
        /**
         * Inicia timer
         * Algoritmo Insertion Sort
         * se llama add_cont_procesos para aumentar el contador 
         * Para el timer
         * Se guarda el tiempo en una variable para presentarla
         */
        
        this.timer.start();
        for (int i = 0; i < this.lista.length; i++) {
            int temp = this.lista[i];
            int j = i - 1;
            while (j >= 0 && temp < this.lista[j]) {
                this.lista[j + 1] = this.lista[j];
                j--;
                this.add_cont_procesos();
            }
            this.add_cont_procesos();

            this.lista[j + 1] = temp;
        }
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
