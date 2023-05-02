package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cosmetics;
import com.example.demo.repository.CosmeticsRepository;

@Service
public class CosmeticsService {
	@Autowired
	CosmeticsRepository cosRepository;
	public List<Cosmetics> getAllDetails(){
		List<Cosmetics>cosList=cosRepository.findAll();
		return cosList;
		
	}
	public Cosmetics saveCosmetic(Cosmetics s)
	{
		Cosmetics obj=cosRepository.save(s);
		return obj;
	}
	public Cosmetics updateDetails(Cosmetics s)
	{
		Cosmetics obj=cosRepository.save(s);
		return obj;
		//return studRespository.save(s);
		
	}
	public void deleteDetails(int s_no)
	{
		cosRepository.deleteById(s_no);
	}
	public Cosmetics getDetails(int s_no) {
		Cosmetics s=cosRepository.findById(s_no).get();
		return s;
	}
	public List<Cosmetics> sortCosmetics(String field) {
		
		return cosRepository.findAll(Sort.by(field));
		//return cosRepository.fingAll(sort.by(Direction.DESC,field));
	}
	public List<Cosmetics> pagingCosmetics(int offset,int pageSize) {
		Pageable paging=PageRequest.of(offset,pageSize);
		Page<Cosmetics> cosData=cosRepository.findAll(paging);
		List<Cosmetics> cosList=cosData.getContent();
		return cosList;
	}
	
	public List<Cosmetics> pagingAndSortCosmetics(int offset,int  pageSize,String field) {
		Pageable paging=PageRequest.of(offset,pageSize).withSort(Sort.by(field));
		Page<Cosmetics> cos=cosRepository.findAll(paging);
		return cos.getContent();
	}

}