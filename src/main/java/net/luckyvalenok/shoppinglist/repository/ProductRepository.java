package net.luckyvalenok.shoppinglist.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.luckyvalenok.shoppinglist.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}