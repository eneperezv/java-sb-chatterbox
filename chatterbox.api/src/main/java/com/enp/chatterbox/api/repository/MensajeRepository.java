package com.enp.chatterbox.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enp.chatterbox.api.model.Mensaje;

@Repository
public interface MensajeRepository extends JpaRepository<Mensaje,Long> {
	
	List<Mensaje> findBySalaId(Long salaId);

}
