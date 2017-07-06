/**
 * @license
 * Copyright (c) 2017 Bruno Esparza, Jorge Hurtado
 *
 * Use of this source code is governed by an MIT-style license that can be found in
 * the LICENSE file at https://github.com/baesparza/ProyectoFinal-Programacion/blob/master/LICENSE
 */
package algoritmos;

import Tiempo.Tiempo;
import java.util.Arrays;

public class BubbleSort extends Sort {

    // timer
    Tiempo timer = new Tiempo();

    // constructor con los atributos de la clase Sort
    public BubbleSort(int opc) {
        super("Bubble Sort",
                "Descripcion..."
        );
        this.lista = this.cargarLista(opc);
    }

    public void sortList() {
        // Borrar
        this.timer.start();

        // Proceso-BubbleSort
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
}
