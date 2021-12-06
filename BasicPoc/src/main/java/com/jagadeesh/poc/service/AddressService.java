package com.jagadeesh.poc.service;

import java.util.List;

import com.jagadeesh.poc.model.Address;

public interface AddressService {
	
	Address saveAddress(Address address);

	Address updateAddress(Address address);

	void deleteAddress(Address address);

	Address getAddressById(int AddressId);

	List<Address> getallAddress();


}
