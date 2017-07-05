
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

public class Mergesort extends Sort {

    // timer
    Tiempo timer = new Tiempo();

    // constructor con los atributos de la clase Sort
    public Mergesort(int[] lista) {
        super(lista);
        this.nombre_algoritmo = "Merge Sort";
        this.descripcion_algoritmo = "Descripcion...";
    }

    public void sortList() {
        this.timer.start();
        Arrays.sort(this.lista);
        this.timer.stop();
        this.total = this.timer.time();
    }
}

