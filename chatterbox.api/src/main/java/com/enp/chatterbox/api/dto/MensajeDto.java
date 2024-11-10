package com.enp.chatterbox.api.dto;

/*
 * @(#)MensajeDto.java 1.0 10/11/2024
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

import java.time.LocalDateTime;

public class MensajeDto {
	
	private Long id;
    private String contenido;
    private LocalDateTime fechaHora;
    private UserDto usuarioDto;
    private Long salaId;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public UserDto getUsuarioDto() {
		return usuarioDto;
	}

	public void setUsuarioDto(UserDto usuarioDto) {
		this.usuarioDto = usuarioDto;
	}

	public Long getSalaId() {
		return salaId;
	}

	public void setSalaId(Long salaId) {
		this.salaId = salaId;
	}

	@Override
	public String toString() {
		return "MensajeDto [id=" + id + ", contenido=" + contenido + ", fechaHora=" + fechaHora + ", usuarioDto="
				+ usuarioDto + ", salaId=" + salaId + "]";
	}

}
