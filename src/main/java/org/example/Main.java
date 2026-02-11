package org.example;
import java.util.*;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {





        // Crear algunos productos
        producto p1 = new producto("1010","Teclado Mecánico", 150000);
        producto p2 = new producto("1111","Mouse Gamer", 85000);
        producto p3 = new producto("1212","Monitor 24 pulg", 650000);
        producto p4 = new producto("1313","Cable HDMI", 25000);

        // Crear un Pedido
        List<producto> listvacia = new ArrayList<>();
        System.out.println("--- Creando Pedido 1 ---");

        pedido pedido1 = new pedido(10,"Gabriel",listvacia );

        // Agregar productos al pedido
        pedido1.crearpedido(p1);
        pedido1.crearpedido(p2);
        pedido1.crearpedido(p4);

        // Mostrar detalles
        pedido1.mostrarDetalles();

        // Crear un Pedido
        List<producto> listvacia2 = new ArrayList<>();

        // Crear un segundo pedido independiente
        System.out.println("--- Creando Pedido 2 ---");
        pedido pedido2 = new pedido(11,"marta",listvacia2);
        pedido2.crearpedido(p3);
        pedido2.mostrarDetalles();




    }
}