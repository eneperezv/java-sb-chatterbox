package com.enp.chatterbox.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enp.chatterbox.api.model.Mensaje;
import com.enp.chatterbox.api.model.SalaChat;

public interface MensajeRepository extends JpaRepository<Mensaje,Long> {
	
	List<Mensaje> findBySala(SalaChat sala);

}
