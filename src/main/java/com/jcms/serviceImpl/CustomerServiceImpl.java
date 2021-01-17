package com.jcms.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcms.model.Customer;
import com.jcms.repo.CustomerRepository;
import com.jcms.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Optional<Customer> findCustomerById(Long id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id);
	}

	@Override
	public Customer saveCustomer(Customer customerNew) {
		// TODO Auto-generated method stub
		if (customerNew != null)
			return customerRepository.save(customerNew);
		else
			return new Customer();
	}

	@Override
	public String deleteCustomer(Long id) {

		if (customerRepository.findById(id).isPresent()) {

			customerRepository.deleteById(id);
			return "Customer eliminado correctamente.";
		}

		return "Error! El customer no existe";

	}

	// Revisar si realiza la acción correctamente sobre la entidad customer
	@Override
	public String updateCustomer(Customer customerNew) {

		if (customerRepository.findById(customerNew.getId()).isPresent()) {
			customerRepository.save(customerNew);

			return "Customer modificado";
		}
		// TODO Auto-generated method stub
		return "Error al modificar el Customer";
	}

}
