package com.enp.chatterbox.api.dto;

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
