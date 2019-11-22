/* 
 * Copyright 2019 Andrés Cosín Zamareño - Cousin183@gmail.com ..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author Andrés Cosín Zamareño - Cousin183@gmail.com .
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String nombre = "Marta";
        final String articulo = "Pulsera hippy";
        final double precioArticulo = 0.70;
        final double dineroInicial = 1.00;

        // Variables
        double restante;

        // Operaciones
        restante = dineroInicial - precioArticulo;
        // Cabecera
        System.out.println("Secuencia de Pulsera");
        System.out.println("====================");

        // Salida consola
        System.out.printf("Nombre de la niña...: %s%n", nombre);
        System.out.printf("Dinero inicial......: %1.2f € %n", dineroInicial);
        System.out.println("---");
        System.out.printf("Articulo a comprar..: %s%n", articulo);
        System.out.printf("Precio articulo.....: %1.2f € %n", precioArticulo);
        System.out.println("---");
        System.out.printf("Dinero restante.....: %1.2f € %n", restante);
    }

}
