package com.produtos.apirest.com.produtos.apirest.repository;

import com.produtos.apirest.com.produtos.apirest.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Produto findById(long id);

}
