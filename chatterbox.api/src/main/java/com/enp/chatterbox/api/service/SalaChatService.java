package com.enp.chatterbox.api.service;

/*
 * @(#)SalaChatService.java 1.0 10/11/2024
 * 
 * El código implementado en este formulario esta protegido
 * bajo las leyes internacionales del Derecho de Autor, sin embargo
 * se entrega bajo las condiciones de la General Public License (GNU GPLv3)
 * descrita en https://www.gnu.org/licenses/gpl-3.0.html
 */

/**
 * @author eliezer.navarro
 * @version 1.0
 * @since 1.0
 */

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enp.chatterbox.api.dto.SalaChatDto;
import com.enp.chatterbox.api.model.SalaChat;
import com.enp.chatterbox.api.repository.SalaChatRepository;

@Service
public class SalaChatService {

	@Autowired
    private SalaChatRepository salaChatRepository;
	
	public SalaChat crearSala(SalaChat sala) {
        return salaChatRepository.save(sala);
    }

    public List<SalaChat> listarSalas() {
        return salaChatRepository.findAll();
    }
    
    public SalaChat buildEntity(SalaChatDto salaChatDto) {
    	SalaChat salaChat = new SalaChat();
    	salaChat.setId(salaChatDto.getId());
    	salaChat.setNombre(salaChatDto.getNombre());
    	salaChat.setDescripcion(salaChatDto.getDescripcion());
		
		return salaChat;
	}
	
	public SalaChatDto buildDto(Optional<SalaChat> optional) {
		SalaChatDto salaChatDto = new SalaChatDto();
		salaChatDto.setId(optional.get().getId());
    	salaChatDto.setNombre(optional.get().getNombre());
    	salaChatDto.setDescripcion(optional.get().getDescripcion());
		
		return salaChatDto;
	}
	
	public SalaChatDto buildDtoFromSalaChat(SalaChat salaChat) {
		SalaChatDto salaChatDto = new SalaChatDto();
		salaChatDto.setId(salaChat.getId());
    	salaChatDto.setNombre(salaChat.getNombre());
    	salaChatDto.setDescripcion(salaChat.getDescripcion());
		
		return salaChatDto;
	}
	
}
