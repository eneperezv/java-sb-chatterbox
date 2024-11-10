package com.enp.chatterbox.api.dto;

import java.time.LocalDateTime;

public class MensajeDto {
	
	private Long id;
    private String contenido;
    private LocalDateTime fechaHora;
    private UserDto usuario;
    private SalaChatDto sala;
    
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

	public UserDto getUsuario() {
		return usuario;
	}

	public void setUsuario(UserDto usuario) {
		this.usuario = usuario;
	}

	public SalaChatDto getSala() {
		return sala;
	}

	public void setSala(SalaChatDto sala) {
		this.sala = sala;
	}

	@Override
	public String toString() {
		return "MensajeDto [id=" + id + ", contenido=" + contenido + ", fechaHora=" + fechaHora + ", usuario=" + usuario
				+ ", sala=" + sala + "]";
	}

}
