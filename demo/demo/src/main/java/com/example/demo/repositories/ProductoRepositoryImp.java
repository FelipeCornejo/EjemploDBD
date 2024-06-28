package com.example.demo.repositories;

import com.example.demo.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.time.LocalDate;

@Repository
public class ProductoRepositoryImp implements ProductoRepository {

    @Autowired
    private Sql2o sql2o;

    @Override
    public Producto crear(Producto producto){
        try (Connection conn = sql2o.open()){
            String sql = "INSERT INTO demodb.productos (id,nombre,categoria,precio,fecha_vencimiento)"+
                    "VALUES (:id,:nombre,:categoria,:precio,:fecha_vencimiento)";
            conn.createQuery(sql,true)
                    .addParameter("id",producto.getId())
                    .addParameter("nombre",producto.getNombre())
                    .addParameter("categoria",producto.getCategoria())
                    .addParameter("precio", producto.getPrecio())
                    .addParameter("fecha_vencimiento", LocalDate.parse(producto.getFecha_vencimiento()))
                    .executeUpdate();
            return producto;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }

    }
}
