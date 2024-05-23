package com.sergiecode.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiecode.apirest.apirest.Entities.Producto;
//se jala la clase entity despues de eso el tipo de dato de la identidad en este caso es ID por lo que su dato es long
public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
}
