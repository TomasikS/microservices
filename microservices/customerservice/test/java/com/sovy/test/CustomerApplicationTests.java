package com.sovy.test;

import com.sovy.customer.Customer;
import com.sovy.customer.CustomerRepository;
import com.sovy.customer.CustomerService;
import org.junit.Test;
import org.junit.Before;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import static org.mockito.internal.verification.VerificationModeFactory.times;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

@ExtendWith(MockitoExtension.class)
public class CustomerApplicationTests {

    private Customer customer=new Customer();

    @Autowired
    @Mock
    CustomerRepository repository;

    @InjectMocks
    CustomerService service = new CustomerService();

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        customer = new Customer();
        customer.setSex("M");
    }

    @Test
    public void CreateCustomer() {
        when(repository.save(any(Customer.class))).thenReturn(new Customer());
        service.createCustomer(customer);
        verify(repository, times(1)).save(eq(customer));
    }

    @Test
    public void UpdateCustomer() {
        customer.setId(1L);
        when(repository.findOne(any(Long.class))).thenReturn((customer));
        service.updateCustomer(customer);
        verify(repository, times(1)).save(eq(customer));
    }

    /* @Test
    public void DeleteCustomer() {
        service.deleteCustomer(1L);
        verify(repository, times(1)).deleteById(eq(1L));
    }*/
    @Test
    public void GetCustomer() {
        when(repository.findOne(any(Long.class))).thenReturn((customer));
        service.getCustomer(1L);
        verify(repository, times(1)).findOne(eq(1L));
    }
}
