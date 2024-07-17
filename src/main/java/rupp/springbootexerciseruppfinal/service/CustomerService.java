package rupp.springbootexerciseruppfinal.service;

import org.springframework.stereotype.Service;
import rupp.springbootexerciseruppfinal.model.Customer;

import java.util.List;
import java.util.Optional;

@Service
public interface CustomerService{
    Customer addCustomer(Customer customer);

    Optional<Customer> findCustomerById(Long id);

    List<Customer> getAllCustomers();

    Customer updateCustomer(Long id, Customer customerDetails);
}
