/**
 * @license
 * Copyright (c) 2017 Bruno Esparza, Jorge Hurtado
 *
 * Use of this source code is governed by an MIT-style license that can be found in
 * the LICENSE file at https://github.com/baesparza/ProyectoFinal-Programacion/blob/master/LICENSE
 */
package algoritmos;

import Tiempo.Tiempo;

public class Heapsort extends Sort {

    // timer
    Tiempo timer = new Tiempo();
    
    // constructor con los atributos de la clase Sort
    public Heapsort(int opc) {
        super("Heap Sort",
                "Descripcion..."
        );
        this.lista = this.cargarLista(opc);
    }

    public void sortList() {
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
}

