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
    public Mergesort(int opc) {
        super("Merge Sort",
                "Descripcion..."
        );
        this.lista = this.cargarLista(opc);
    }

    public void sortList() {
        this.timer.start();
        this.timer.stop();
        this.set_time(this.timer.time());
    }
}
