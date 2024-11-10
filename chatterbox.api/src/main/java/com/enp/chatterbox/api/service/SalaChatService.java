package com.enp.chatterbox.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enp.chatterbox.api.dto.MensajeDto;
import com.enp.chatterbox.api.dto.SalaChatDto;
import com.enp.chatterbox.api.model.Mensaje;
import com.enp.chatterbox.api.model.SalaChat;
import com.enp.chatterbox.api.repository.SalaChatRepository;

@Service
public class SalaChatService {

	@Autowired
    private SalaChatRepository salaChatRepository;
	
	@Autowired
	private MensajeService mensajeService;
    
    public SalaChat buildEntity(SalaChatDto salaChatDto) {
    	SalaChat salaChat = new SalaChat();
    	salaChat.setId(salaChatDto.getId());
    	salaChat.setNombre(salaChatDto.getNombre());
    	salaChat.setDescripcion(salaChatDto.getDescripcion());
    	salaChat.setMensajes(getListaMensajeFromListaMensajeDto(salaChatDto.getMensajesDto()));
		
		return salaChat;
	}
	
	public SalaChatDto buildDto(Optional<SalaChat> optional) {
		SalaChatDto salaChatDto = new SalaChatDto();
		salaChatDto.setId(optional.get().getId());
    	salaChatDto.setNombre(optional.get().getNombre());
    	salaChatDto.setDescripcion(optional.get().getDescripcion());
    	salaChatDto.setMensajesDto(getListaMensajeDtoFromListaMensaje(optional.get().getMensajes()));
		
		return salaChatDto;
	}
	
	public SalaChatDto buildDtoFromSalaChat(SalaChat salaChat) {
		SalaChatDto salaChatDto = new SalaChatDto();
		salaChatDto.setId(salaChat.getId());
    	salaChatDto.setNombre(salaChat.getNombre());
    	salaChatDto.setDescripcion(salaChat.getDescripcion());
    	salaChatDto.setMensajesDto(getListaMensajeDtoFromListaMensaje(salaChat.getMensajes()));
		
		return salaChatDto;
	}
	
	public List<Mensaje> getListaMensajeFromListaMensajeDto(List<MensajeDto> listaMensajeDto){
		List<Mensaje> listaMensaje = new ArrayList<Mensaje>();
		
		for(MensajeDto mensajeDto : listaMensajeDto){
			listaMensaje.add(mensajeService.buildEntity(mensajeDto));
		}
		
		return listaMensaje;
	}
	
	public List<MensajeDto> getListaMensajeDtoFromListaMensaje(List<Mensaje> listaMensaje){
		List<MensajeDto> listaMensajeDto = new ArrayList<MensajeDto>();
		
		for(Mensaje mensaje : listaMensaje){
			listaMensajeDto.add(mensajeService.buildDtoFromMensaje(mensaje));
		}
		
		return listaMensajeDto;
	}
	
}
