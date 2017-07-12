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

public class JavaSort extends Sort {

    // timer
    Tiempo timer = new Tiempo();

    // constructor con los atributos de la clase Sort
    public JavaSort(int opc) {
        super("Java Sort");
        this.lista = this.cargarLista(opc);
    }

    public void sortList() {
        this.timer.start();
        Arrays.sort(this.lista);
        this.add_cont_procesos();
        this.timer.stop();
        this.set_time(this.timer.time());
    }
    
    public void run() {
        this.sortList();
        this.presentar();
    }
}
