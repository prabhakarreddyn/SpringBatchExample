package com.javatechie.spring.batch.config;

import com.javatechie.spring.batch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {
	/**
	 * here we can add the conditions.. exmp here we can store the data in DB only country name=United States and gender=Male
	 */
    @Override
    public Customer process(Customer customer) throws Exception {
        if(customer.getCountry().equals("United States") && customer.getGender().equalsIgnoreCase("Male")) {
            return customer;
        }else{
            return null;
        }
    }
}
