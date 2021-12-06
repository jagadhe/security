package com.jagadeesh.poc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jagadeesh.poc.exception.ResourceNotFoundException;
import com.jagadeesh.poc.model.Address;
import com.jagadeesh.poc.repo.AddressRepository;

@RestController
@RequestMapping("/api/v1")
public class AddressController {
	
	@Autowired
	private AddressRepository addressRepository;
	
	@RequestMapping(value = "/address/",method = RequestMethod.GET)
	public List<Address>getAllAddress(){
		return addressRepository.findAll();
		
	}
	@RequestMapping(value = "/address/{addressId}",method = RequestMethod.GET)
	public Address getOrderProducts(@PathVariable("addressId") int addressId) {
		return addressRepository.findById(addressId).orElseThrow(() -> new ResourceNotFoundException("user not found with id:" +addressId));
	}
	
	
	
	
	@RequestMapping(value="/address/",method=RequestMethod.POST)
	public Address createAddress(@RequestBody Address address) {
		return addressRepository.save(address);
	}
	
	@RequestMapping(value="/address/",method=RequestMethod.PUT)
	public Address updateAddress( @RequestBody Address address) {
		return addressRepository.save(address);

}
	@RequestMapping(value="/address/{addressId}",method=RequestMethod.DELETE)
	public void deleteAddress(@PathVariable("addressId") int  AddressId) {
		 addressRepository.deleteById(AddressId);
		 }	

}
