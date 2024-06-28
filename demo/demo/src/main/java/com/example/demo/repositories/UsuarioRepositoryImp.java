package com.example.demo.repositories;

import com.example.demo.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class UsuarioRepositoryImp implements UsuarioRepository {

    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Usuario> getAll(){
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * from demodb.usuario")
                    .executeAndFetch(Usuario.class);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
