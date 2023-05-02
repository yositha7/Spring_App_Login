package com.example.demo.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cosmetics;
import com.example.demo.service.CosmeticsService;

@RestController
public class CosmeticsController {
	@Autowired
	CosmeticsService cosService;
	
	@GetMapping(value="fetchDetails")
	
	public List<Cosmetics> getAllDetails()
	{
		List<Cosmetics> cosList=cosService.getAllDetails();
		return cosList;
	}
	//http://localhost:8080/saveStudent
 @PostMapping(value="/saveDetails")
 public Cosmetics savedetails(@RequestBody Cosmetics s) 
	{
		return cosService.saveCosmetic(s);
		
	}	
 @PutMapping(value="/updateDetails")
 public Cosmetics updateDetails(@RequestBody Cosmetics s) 
	{
		return cosService.saveCosmetic(s);
		
	}
 //http://localhost:8080/deleteStudent/1003
 
 @DeleteMapping(value="/deleteDetails/{sno}") 
 public void  deleteDetails(@PathVariable("sno") int sno)
 {
 	cosService.deleteDetails(sno);
 }
 @GetMapping(value="/getDetails/{sno}")
 public Cosmetics getDetails(@PathVariable("sno")  int sno)
 {
 	return cosService.getDetails(sno);
 }
 @GetMapping("/sortCosmetics/{field}")
 public List<Cosmetics> sortCosmetics(@PathVariable String field)
 {
	 return cosService.sortCosmetics(field);
 }
 @GetMapping("/pagingCosmetics/{offset}/{pageSize}")
 public List<Cosmetics> pagingCosmetics(@PathVariable int offset,@PathVariable int pageSize)
 {
	 return cosService.pagingCosmetics(offset,pageSize);
 }
 @GetMapping("/pagingAndSortingCosmetics/{offset}/{pageSize}/{field}")
 
 public List<Cosmetics> pagingAndSortingCosmetics(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
 {
	 return cosService.pagingAndSortCosmetics(offset,pageSize,field);
 }
 
}