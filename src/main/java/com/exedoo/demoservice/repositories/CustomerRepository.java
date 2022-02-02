package com.exedoo.demoservice.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.PagingAndSortingRepository;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomerRepository  extends PagingAndSortingRepository<CustomerEntity, Long>  {
	
	public List<CustomerEntity> findByNameIgnoreCaseContaining(@Param("name") String name);
}
