/**
 * @license
 * Copyright (c) 2017 Bruno Esparza, Jorge Hurtado
 *
 * Use of this source code is governed by an MIT-style license that can be found in
 * the LICENSE file at https://github.com/baesparza/ProyectoFinal-Programacion/blob/master/LICENSE
 */
package algoritmos;

import Tiempo.Tiempo;

public class ShellSort extends Sort {

    // timer
    Tiempo timer = new Tiempo();

    // constructor con los atributos de la clase Sort
    public ShellSort(int opc) {
        super("Shell Sort");
        this.lista = this.cargarLista(opc);
    }

    public void sortList() {
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
        this.sortList();
        this.presentar();
    }
}
