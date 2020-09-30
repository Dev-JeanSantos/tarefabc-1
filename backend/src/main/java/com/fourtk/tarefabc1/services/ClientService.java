package com.fourtk.tarefabc1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fourtk.tarefabc1.entities.Client;
import com.fourtk.tarefabc1.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public List<Client> findAll(){
		
		return repository.findAll();
		
		
		
	}

}
