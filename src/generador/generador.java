/**
 * @license
 * Copyright (c) 2017 Bruno Esparza, Jorge Hurtado
 *
 * Use of this source code is governed by an MIT-style license that can be found in
 * the LICENSE file at https://github.com/baesparza/ProyectoFinal-Programacion/blob/master/LICENSE
 */
package generador;

public class generador {

    private int[] lista;

    // constructor con los atributos de la clase Sort
    public generador(int tam) {
        this.lista = new int[tam];
    }

    public int[] semiordenada() {
        for (int i = 0; i < this.lista.length; i++) {
            this.lista[i] = (int) (Math.random() * 2000);
        }
        return this.lista;
    }

    public int[] desordenada() {
        for (int i = 0; i < this.lista.length; i++) {
            this.lista[i] = (int) (i);
        }
        return this.lista;
    }

    public int[] invertida() {
        for (int i = this.lista.length - 1; i >=0; i--) {
            this.lista[i] = (int) (i);
        }
        return this.lista;
    }

}
