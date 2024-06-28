package com.example.demo.models;

public class Producto {
    private int id;
    private String nombre;
    private int precio;
    private String fecha_vencimiento;
    private int categoria; //FK_Categoria

    public Producto(int id, String nombre, int precio, String fecha_vencimiento, int categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fecha_vencimiento = fecha_vencimiento;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}
