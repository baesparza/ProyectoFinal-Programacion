/**
 * @license
 * Copyright (c) 2017 Bruno Esparza, Jorge Hurtado
 *
 * Use of this source code is governed by an MIT-style license that can be found in
 * the LICENSE file at https://github.com/baesparza/ProyectoFinal-Programacion/blob/master/LICENSE
 */
package algoritmos;

public class ShellSort extends Sort {

    // constructor con los atributos de la clase Sort
    public ShellSort(int opc) {
        /**
         * Recive la opcion de la lista a cargar,  llama a la funcion que carga la lista, y la guarda el la variable lista
         * envia el nombre del algorirmo a la clase padre(super)
         */

        super("Shell Sort");
        this.lista = this.cargarLista(opc);
    }

    public void sortList() {
        /**
         * Inicia timer
         * Algoritmo Shell Sort
         * se llama add_cont_procesos para aumentar el contador 
         * Para el timer
         * Se guarda el tiempo en una variable para presentarla
         */

        this.timer.start();
        
        boolean seguir;
        int n = this.lista.length;
        int aux;
        do {
            n = n / 2;
            for (int i = 0; i < this.lista.length; i += n) {
                aux = this.lista[i];
                for (int j = i - n; j >= 0; j -= n) {
                    if (aux < this.lista[j]) {
                        this.lista[j + n] = this.lista[j];
                        this.lista[j] = aux;
                        this.add_cont_procesos();
                    } else {
                        break;
                    }
                    this.add_cont_procesos();
                }
                this.add_cont_procesos();
            }
            this.add_cont_procesos();
        } while (n > 1);

        
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
