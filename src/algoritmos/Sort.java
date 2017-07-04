/**
 * @license
 * Copyright (c) 2017 Bruno Esparza, Jorge Hurtado
 *
 * Use of this source code is governed by an MIT-style license that can be found in
 * the LICENSE file at https://github.com/baesparza/ProyectoFinal-Programacion/blob/master/LICENSE
 */
package algoritmos;

import java.util.Arrays;

public class Sort {
   
    // atributos de la clase
    private String nombre_projecto;
    private String descripcion_projecto;
    public String nombre_algoritmo;
    public String descripcion_algoritmo;
    public long total;
    public int[] lista = new int[30000];
    public int cont_procesos = 0;

    // contructor con parametros
    public Sort() {
        this.nombre_projecto = "Algoritmos de ordenamiento";
        this.descripcion_projecto = "Uso de diferentes algoritmos para ordenar listas, verificar su velocidad y numero de procesos.";
    }

    public void cargarLista(int opc) {
        /**
         * Dependiendo de la opcion que el usuario elija(opc) cargamos uno de
         * los 3 tipos de listas para realizar las pruebas.
         */
        switch (opc) {
            case (1):
                // lista semi ordenada
                for (int i = 0; i < 30000; i++) {
                    this.lista[i] = (int) (Math.random()*2000);
                }
                break;
            case (2):
                // lista desordenada
                for (int i = 0; i < 30000; i++) {
                    this.lista[i] = (int) (Math.random()*2000);
                }
                break;
            case (3):
                // lista ordenada al reves
                for (int i = 0; i < 30000; i++) {
                    this.lista[i] = (int) (Math.random()*2000);
                }
                break;
        }
    }

    public void presentar() {
        System.out.println(this.nombre_algoritmo);
        System.out.println("Numero de procesos realizados: "+this.cont_procesos);
        System.out.println(Arrays.toString(this.lista));
        System.out.println("Promedio: " + this.total/100 + " Milisegundos");
    }
    
}
