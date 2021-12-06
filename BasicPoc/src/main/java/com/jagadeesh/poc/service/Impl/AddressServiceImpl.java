package com.jagadeesh.poc.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jagadeesh.poc.model.Address;
import com.jagadeesh.poc.repo.AddressRepository;
import com.jagadeesh.poc.service.AddressService;
@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public Address saveAddress(Address address) {
		// TODO Auto-generated method stub
		return addressRepository.save(address);
	}

	@Override
	public Address updateAddress(Address address) {
		// TODO Auto-generated method stub
		return addressRepository.save(address);
	}

	@Override
	public void deleteAddress(Address address) {
		Optional<Address> address1 =addressRepository.findById(address.getAddressId());
		addressRepository.delete(address);
		address.setSoft_delete(true);
		addressRepository.save(address);
	}

	@Override
	public Address getAddressById(int AddressId) {
		// TODO Auto-generated method stub
		return addressRepository.findById(AddressId).get();
	}

	@Override
	public List<Address> getallAddress() {
		// TODO Auto-generated method stub
		return addressRepository.findAll();
	}

}
