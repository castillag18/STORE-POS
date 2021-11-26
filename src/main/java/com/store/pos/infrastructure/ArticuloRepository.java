package com.store.pos.infrastructure;

import com.store.pos.model.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloRepository extends JpaRepository<Articulo, Long>{


}
