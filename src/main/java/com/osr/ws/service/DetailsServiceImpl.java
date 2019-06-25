package com.osr.ws.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osr.ws.dto.Billionaires;
import com.osr.ws.repositories.DetailsRepository;

@Service
public class DetailsServiceImpl implements DetailsService {

	@Autowired
	DetailsRepository detailsRepository;
	
	@Override
	public List<Billionaires> findAll() {
		List<Billionaires> billinaries = new ArrayList<>();
		detailsRepository.findAll().forEach(billionairesDto -> {
			billinaries.add(billionairesDto);
		});
		
		return billinaries;
	}

}
