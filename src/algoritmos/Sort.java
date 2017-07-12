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

import generador.generador;
import java.util.Scanner;

public class Sort {
    

    // atributos de la clase
    private String nombre_projecto;
    private String descripcion_projecto;
    private String nombre_algoritmo;
    private long time;
    public int[] lista;
    private int cont_procesos = 0;
    private int lista_tamano = 20;
    public Tiempo timer = new Tiempo();;

    // contructor con parametros
    public Sort(String nombre_algoritmo) {
        this.nombre_projecto = "Algoritmos de ordenamiento";
        this.descripcion_projecto = "Uso de diferentes algoritmos para ordenar listas, verificar su velocidad y numero de procesos.";
        this.nombre_algoritmo = nombre_algoritmo;
    }

    public int[] cargarLista(int opc) {
        /**
         * Dependiendo de la opcion que el usuario elija(opc) cargamos uno de
         * los 3 tipos de listas para realizar las pruebas.
         */

        Scanner input = new Scanner(System.in);

        // inicializamos el generador
        generador gen = new generador(this.lista_tamano);

        switch (opc) {
            case (1):
                // lista desordenada
                return gen.desordenada();
            case (2):
                // lista ordenada al reves
                return gen.invertida();
            default:
                return gen.desordenada();
        }
    }

    public void presentar() {
        System.out.println(this.nombre_algoritmo);
        System.out.println("Numero de procesos realizados: " + this.cont_procesos + " aproximadamente");
        System.out.println(Arrays.toString(this.lista));
        System.out.println("Tiempo: " + this.time / 100);
    }

    public void add_cont_procesos() {
        this.cont_procesos++;
    }

    public void set_time(long total) {
        this.time = total;
    }
}
