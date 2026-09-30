package ie.atu.cicd1catalogservice.repository;


import ie.atu.cicd1catalogservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository
        extends JpaRepository<Product, Long> {
}
