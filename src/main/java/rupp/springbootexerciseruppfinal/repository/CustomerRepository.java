package rupp.springbootexerciseruppfinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rupp.springbootexerciseruppfinal.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
