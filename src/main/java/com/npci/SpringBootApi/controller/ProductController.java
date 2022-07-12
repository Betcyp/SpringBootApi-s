package com.npci.SpringBootApi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.msf.models.Product;
import com.npci.SpringBootApi.commonClass.APIResponse;
import com.npci.SpringBootApi.dto.FetchingDto;
import com.npci.SpringBootApi.dto.ProductDto;
import com.npci.SpringBootApi.model.User;
import com.npci.SpringBootApi.repository.UserRepository;
import com.npci.SpringBootApi.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	//@Autowired
	//UserRepository userRepo;
	
	
	@RequestMapping(value="api/product", method=RequestMethod.POST)
	 public ResponseEntity<APIResponse> createProduct(@RequestBody ProductDto prdtDto) {
        
        productService.createProduct(prdtDto);
         return new ResponseEntity<APIResponse>(new APIResponse(true, "product has been added"), HttpStatus.CREATED);
   }
	
	@GetMapping(value="/banks",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> findBanksByProductName(@RequestParam Product product)/* @PathVariable("productName") String productName */
	{
		Product prdtBanks = productService.findByBanks(product.getProductName());

		if(prdtBanks!=null)
			
		
			return ResponseEntity.of(Optional.of(prdtBanks.getBanks()));
			//return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			//return new ResponseEntity<APIResponse>(new APIResponse(true, ""), HttpStatus.OK);
			//return new ResponseEntity<>(prdtBanks.getBanks(), HttpStatus.OK);
			//return ResponseEntity.of(Optional.of(prdtBanks.getBanks()));
		else
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			
			//return new ResponseEntity<>("failure", HttpStatus.BAD_REQUEST);
			//return new ResponseEntity<APIResponse>(new APIResponse(false, "no details"), HttpStatus.BAD_REQUEST);
			//return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new APIResponse("failure","No banks found"));
			//return ResponseEntity<APIResponse>(new APIResponse("failure","banks not found"));
			
	}
	
}





















//Optional<User> optionalUser = userRepo.findById(prdtDto.getUserId());
//if (!optionalUser.isPresent()) {
    //return new ResponseEntity<APIResponse>(new APIResponse(false, "user does not exists"), HttpStatus.BAD_REQUEST);
//}


	/*@RequestMapping(value="/product", method=RequestMethod.POST)
	public Product createProduct(@RequestBody Product prdt) {
		return productService.createProduct(prdt);
		
	}*/
/*@RequestMapping(value="/product", method=RequestMethod.POST)
	public ResponseEntity<Object> createProduct(@RequestBody Product product) 
	{
	productRepository.put(product.getId(), product);
	return new ResponseEntity<>("Product is created successfully", 
	HttpStatus.CREATED);
	}*/

////////////////////
/*
@RequestMapping(value="banks/{id}", method=RequestMethod.GET)
public ResponseEntity<Object> findBanksbyId(@PathVariable("id") long id)
{
	Product prdt = productService.findById(id);
	
	if(prdt!=null)
		//return new ResponseEntity<APIResponse>(new APIResponse(failure, "banks not found"), HttpStatus.BAD_REQUEST);
		return new ResponseEntity<>(prdt, HttpStatus.OK);
	else
		//return new ResponseEntity<APIResponse>(new APIResponse(false, "no details"), HttpStatus.BAD_REQUEST);
		return new ResponseEntity<>("failure", HttpStatus.BAD_REQUEST);
		//return ResponseEntity.status(HttpStatus.NOT_FOUND).b
		//return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new APIResponse("failure","No banks found"));
		//return ResponseEntity<APIResponse>(new APIResponse("failure","banks not found"));
		//return  ResponseEntity<>(prdt, HttpStatus.OK);
		
}*/