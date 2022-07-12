package com.npci.SpringBootApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msf.models.Product;
import com.npci.SpringBootApi.dto.FetchingDto;
import com.npci.SpringBootApi.dto.ProductDto;
import com.npci.SpringBootApi.model.User;
import com.npci.SpringBootApi.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepo;
	
	//add product
	public void createProduct(ProductDto prdtDto) {
		Product prdt = new Product();
		prdt.setProductName(prdtDto.getProductName());
		prdt.setProductVersion(prdtDto.getProductVersion());
		prdt.setBanks(prdtDto.getBanks());
		productRepo.save(prdt);
	}
	
	public Product findByBanks(String banks) {
		Optional<Product> opt = productRepo.findByProductName(banks);
		if(opt.isPresent())
		{
			return opt.get();
		}
		else
			return null;
		
	}
		
}
