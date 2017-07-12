/**
 * @license
 * Copyright (c) 2017 Bruno Esparza, Jorge Hurtado
 *
 * Use of this source code is governed by an MIT-style license that can be found in
 * the LICENSE file at https://github.com/baesparza/ProyectoFinal-Programacion/blob/master/LICENSE
 */
package Tiempo;

public class Tiempo {
    /**
     * Clase Tiempo
     * objeto se encarga de llevar control del tiempo que demora cada algorimo
    */

    private long total;
    private long inicio_time;
    private long final_time;

    // constructor
    public Tiempo() {
        /**
         * constructor
        */
    }

    public void start() {
        /**
         * la hora de inicio se guarda en una variable
         */

        this.inicio_time = System.nanoTime();
    }

    public void stop() {
        /**
         * Se guarda el tiempo que termina en una variable
         */

        this.final_time = System.nanoTime();
    }

    public long time() {
        /**
         * devuelve el tiempo que transcurrio.(fin - inicio)
         */
        
        this.total += (this.final_time - this.inicio_time);
        return this.total;
    }
    
}
