package com.fourtk.tarefabc1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fourtk.tarefabc1.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
	
	

}
