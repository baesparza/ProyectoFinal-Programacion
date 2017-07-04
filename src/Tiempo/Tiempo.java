/**
 * @license
 * Copyright (c) 2017 Bruno Esparza, Jorge Hurtado
 *
 * Use of this source code is governed by an MIT-style license that can be found in
 * the LICENSE file at https://github.com/baesparza/ProyectoFinal-Programacion/blob/master/LICENSE
 */
package Tiempo;

public class Tiempo {

    private long total;
    public long inicio_time;
    public long final_time;

    // constructor
    public Tiempo() {

    }

    public void start() {
        this.inicio_time = System.nanoTime();
    }

    public void stop() {
        this.final_time = System.nanoTime();
    }

    public long time() {
        this.total += (this.final_time - this.inicio_time);
        return this.total;
    }
}
