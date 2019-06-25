package com.osr.ws.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.osr.ws.dto.Billionaires;

public interface DetailsRepository extends CrudRepository<Billionaires, Integer>
{
	
}
