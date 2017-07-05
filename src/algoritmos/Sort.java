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
    public int[] lista;
    public int cont_procesos = 0;

    // contructor con parametros
    public Sort(int[] lista) {
        this.nombre_projecto = "Algoritmos de ordenamiento";
        this.descripcion_projecto = "Uso de diferentes algoritmos para ordenar listas, verificar su velocidad y numero de procesos.";
        this.lista = lista;
    }

    public void presentar() {
        System.out.println(this.nombre_algoritmo);
        System.out.println("Numero de procesos realizados: "+this.cont_procesos);
        System.out.println(Arrays.toString(this.lista));
        System.out.println("Promedio: " + this.total/100 + " Milisegundos");
    }
    
}
