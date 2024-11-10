package com.enp.chatterbox.api.dto;

import java.util.List;

public class SalaChatDto {
	
	private Long id;
    private String nombre;
    private String descripcion;
    private List<MensajeDto> mensajes;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<MensajeDto> getMensajes() {
		return mensajes;
	}

	public void setMensajes(List<MensajeDto> mensajes) {
		this.mensajes = mensajes;
	}

	@Override
	public String toString() {
		return "SalaChatDto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", mensajes="
				+ mensajes + "]";
	}

}
