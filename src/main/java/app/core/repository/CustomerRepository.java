package app.core.repository;


import app.core.dto.Customer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerRepository {

    List<Customer> customers;

    @PostConstruct
    public void init(){
        customers=new ArrayList<Customer>() {{
            add(new Customer(1, "Fred","Flinstone"));
            add(new Customer(2, "Barney","Rubble"));
            add(new Customer(3, "Wilma","Flinstone"));
            add(new Customer(4, "Bettey","Rubble"));
            add(new Customer(5, "Bamm","Bamm"));
        }};
    }
    public List<Customer> getAllCustomers() {
        return customers;
    }
}
