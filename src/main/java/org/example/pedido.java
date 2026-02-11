package org.example;

import java.util.ArrayList;
import java.util.List;

public class pedido {

    private int id;
    private String nombreUs;

    List<producto> productos=new ArrayList<>();

    public pedido() {
    }

    public pedido(int id, String nombreUs, List<producto> productos) {
        this.id = id;
        this.nombreUs = nombreUs;
        this.productos = productos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUs() {
        return nombreUs;
    }

    public void setNombreUs(String nombreUs) {
        this.nombreUs = nombreUs;
    }

    public List<producto> getProductos() {
        return productos;
    }

    public void setProductos(List<producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "pedido{" +
                "id=" + id +
                ", nombreUs='" + nombreUs + '\'' +
                ", productos=" + productos +
                '}';
    }

    public void crearpedido(producto producto){
        productos.add(producto);
        System.out.println("producto registrado"+ producto.getNombre());
    }

    private double calcularTotal() {
        double total = 0;
        for (producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }


    public void mostrarDetalles() {
        System.out.println("--------------------------------");
        System.out.println("PEDIDO #" + id);
        System.out.println("--------------------------------");

        if (productos.isEmpty()) {
            System.out.println("El pedido está vacío.");
        } else {
            for (producto p : productos) {
                System.out.println(p); // Llama automáticamente al toString() de Producto
            }
        }

        System.out.println("--------------------------------");
        //System.out.println("TOTAL:$               ", calcularTotal());
        System.out.println("--------------------------------");
    }
}






