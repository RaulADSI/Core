package edu.tienda.core.persistance.repositories;

//import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.tienda.core.persistance.entities.ProductoEntity;

@Repository
public interface ProductosRepository extends JpaRepository<ProductoEntity, Integer> {

    /*List<ProductoEntity> findByPrecioLessThan(Double precio);

    List<ProductoEntity> findByNombreLike(String nombre);

    List<ProductoEntity> findByPrecioGreaterThanAndStockLessThan(Double precio,Integer stock);*/

}
