/**
 * @license
 * Copyright (c) 2017 Bruno Esparza, Jorge Hurtado
 * 
 * Use of this source code is governed by an MIT-style license that can be found in 
 * the LICENSE file at https://github.com/baesparza/ProyectoFinal-Programacion/blob/master/LICENSE
 */
package algoritmos;

public class Sort {
    // atributos de la clase
    private String nombre_projecto;
    private String descripcion_projecto;
    private int[] lista = new int[300];

    // contructor con parametros
    public Sort() {
        this.nombre_projecto = "Algoritmos de ordenamiento";
        this.descripcion_projecto = "Uso de diferentes algoritmos para ordenar listas y verificar su velocidad.";
    }

    public void cargarLista(opc) {
        /**
         * Dependiendo de la opcion que el usuario elija(opc) cargamos 
         * uno de los 3 tipos de listas para realizar las pruebas.
         */
        switch (opc) {
            case(1):
                // lista semi ordenada
                for (int i = 0; i < 300; i++) {
                    this.lista[i] = (int) (Math.random() * n) + 1;
                }
                break;
            case(2):
                // lista desordenada
                for (int i = 0; i < 300; i++) {
                    this.lista[i] = (int) (Math.random() * n) + 1;
                }
                break;
            case(3):
                // lista ordenada al reves
                for (int i = 0; i < 300; i++) {
                    this.lista[i] = (int) (Math.random() * n) + 1;
                }
                break;
        }
    }

}
