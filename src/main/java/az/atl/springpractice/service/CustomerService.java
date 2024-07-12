package az.atl.springpractice.service;

import az.atl.springpractice.model.dto.CustomerDto;
import az.atl.springpractice.model.request.CustomerRequest;

import java.util.List;

public interface CustomerService {
    CustomerDto createCustomer(CustomerRequest customerRequest);

    CustomerDto findById(Long id);

    List<CustomerDto> findAllCustomers();

    void updateCustomer(Long id, CustomerRequest customerRequest);

    void deleteCustomer(Long id);
}
