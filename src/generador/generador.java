/**
 * @license
 * Copyright (c) 2017 Bruno Esparza, Jorge Hurtado
 *
 * Use of this source code is governed by an MIT-style license that can be found in
 * the LICENSE file at https://github.com/baesparza/ProyectoFinal-Programacion/blob/master/LICENSE
 */
package generador;

public class generador {
    /**
     * Clase generador
     * clase se encarga de crear, cargar y devolver las listas que se usaran den el programa
    */

    private int[] lista;

    public generador(int tam) {
        /**
         * Constructor
         * Recibe el tamaño que va a tener la lista y crea una lista de ese tamaño
        */

        this.lista = new int[tam];
    }

    public int[] desordenada() {
        /**
         * Devuelve una lista desordenada que se carga desde una lista externa
        */

        // Aqui se carca el archivo deshordenado.
        for (int i = 0; i < this.lista.length; i++) {
            this.lista[i] = (int) (Math.random() * 10) + 1;
        }
        return this.lista;
    }

    public int[] invertida() {
        /**
         * Devuelve una lista ordenada de manera invertida (mayor a menor)
        */
        
        for (int i = this.lista.length - 1; i >=0; i--) {
            this.lista[this.lista.length - i - 1] = (int) (i);
        }
        return this.lista;
    }

}
