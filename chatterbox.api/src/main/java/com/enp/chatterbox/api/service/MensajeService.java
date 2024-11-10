package com.enp.chatterbox.api.service;

/*
 * @(#)MensajeService.java 1.0 10/11/2024
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

import com.enp.chatterbox.api.dto.MensajeDto;
import com.enp.chatterbox.api.model.Mensaje;
import com.enp.chatterbox.api.repository.MensajeRepository;

@Service
public class MensajeService {
	
	@Autowired
    private MensajeRepository mensajeRepository;
	
	@Autowired
	private UserService userService;

    public Mensaje enviarMensaje(Mensaje mensaje) {
        return mensajeRepository.save(mensaje);
    }

    public List<Mensaje> obtenerMensajesPorSala(Long salaId) {
        return mensajeRepository.findBySalaId(salaId);
    }
    
    public Mensaje buildEntity(MensajeDto mensajeDto) {
    	Mensaje mensaje = new Mensaje();
    	mensaje.setId(mensajeDto.getId());
    	mensaje.setContenido(mensajeDto.getContenido());
    	mensaje.setFechaHora(mensajeDto.getFechaHora());
    	mensaje.setUsuario(userService.buildEntity(mensajeDto.getUsuarioDto()));
    	mensaje.setSalaId(mensajeDto.getSalaId());
		
		return mensaje;
	}
	
	public MensajeDto buildDto(Optional<Mensaje> optional) {
		MensajeDto mensajeDto = new MensajeDto();
		mensajeDto.setId(optional.get().getId());
		mensajeDto.setContenido(optional.get().getContenido());
    	mensajeDto.setFechaHora(optional.get().getFechaHora());
    	mensajeDto.setUsuarioDto(userService.buildDtoFromUser(optional.get().getUsuario()));
    	mensajeDto.setSalaId(optional.get().getSalaId());
		
		return mensajeDto;
	}
	
	public MensajeDto buildDtoFromMensaje(Mensaje mensaje) {
		MensajeDto mensajeDto = new MensajeDto();
		mensajeDto.setId(mensaje.getId());
		mensajeDto.setContenido(mensaje.getContenido());
    	mensajeDto.setFechaHora(mensaje.getFechaHora());
    	mensajeDto.setUsuarioDto(userService.buildDtoFromUser(mensaje.getUsuario()));
    	mensajeDto.setSalaId(mensaje.getSalaId());
		
		return mensajeDto;
	}

}
