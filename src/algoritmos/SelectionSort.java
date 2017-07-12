/**
 * @license
 * Copyright (c) 2017 Bruno Esparza, Jorge Hurtado
 *
 * Use of this source code is governed by an MIT-style license that can be found in
 * the LICENSE file at https://github.com/baesparza/ProyectoFinal-Programacion/blob/master/LICENSE
 */
package algoritmos;

public class SelectionSort extends Sort {

    public SelectionSort(int opc) {
        /**
         * Recive la opcion de la lista a cargar,  llama a la funcion que carga la lista, y la guarda el la variable lista
         * envia el nombre del algorirmo a la clase padre(super)
         */

        super("Selection Sort");
        this.lista = this.cargarLista(opc);
    }

    public void sortList() {
        /**
         * Inicia timer
         * Algoritmo Selection Sort
         * se llama add_cont_procesos para aumentar el contador 
         * Para el timer
         * Se guarda el tiempo en una variable para presentarla
         */

        this.timer.start();

        int menor = 0;
        int aux;
        for (int i = 0; i < this.lista.length - 1; i++) {
            menor = i;
            for (int j = i + 1; j < this.lista.length; j++) {
                if (this.lista[menor] > this.lista[j]) {
                    menor = j;
                    this.add_cont_procesos();
                }
                this.add_cont_procesos();
            }
            if (this.lista[i] > this.lista[menor]) {
                aux = this.lista[i];
                this.lista[i] = this.lista[menor];
                this.lista[menor] = aux;
                this.add_cont_procesos();
            }
            this.add_cont_procesos();
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
