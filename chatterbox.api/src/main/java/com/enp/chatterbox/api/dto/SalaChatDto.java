package com.enp.chatterbox.api.dto;

import java.util.List;

public class SalaChatDto {
	
	private Long id;
    private String nombre;
    private String descripcion;
    //private List<MensajeDto> mensajesDto;
    
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

	/*public List<MensajeDto> getMensajesDto() {
		return mensajesDto;
	}

	public void setMensajesDto(List<MensajeDto> mensajesDto) {
		this.mensajesDto = mensajesDto;
	}*/

	@Override
	public String toString() {
		return "SalaChatDto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}

}
