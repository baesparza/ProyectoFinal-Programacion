/**
 * @license
 * Copyright (c) 2017 Bruno Esparza, Jorge Hurtado
 *
 * Use of this source code is governed by an MIT-style license that can be found in
 * the LICENSE file at https://github.com/baesparza/ProyectoFinal-Programacion/blob/master/LICENSE
 */
package algoritmos;

import java.util.Arrays;

public class BubbleSort extends Sort {

    public BubbleSort(int opc) {
        /**
         * Recive la opcion de la lista a cargar,  llama a la funcion que carga la lista, y la guarda el la variable lista
         * envia el nombre del algorirmo a la clase padre(super)
         */

        super("Bubble Sort");
        this.lista = this.cargarLista(opc);
    }

    public void sortList() {
        /**
         * Inicia timer
         * Algoritmo Bubble Sort
         * se llama add_cont_procesos para aumentar el contador 
         * Para el timer
         * Se guarda el tiempo en una variable para presentarla
         */

        this.timer.start();

        boolean seguir;
        int n = lista.length - 1;
        int aux;
        do {
            seguir = false;
            for (int i = 0; i < n; i++) {
                if (lista[i] > lista[i + 1]) {
                    aux = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = aux;
                    seguir = true;
                    this.add_cont_procesos();
                }
                this.add_cont_procesos();
            }
            n--;
            this.add_cont_procesos();
        } while (seguir);

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
