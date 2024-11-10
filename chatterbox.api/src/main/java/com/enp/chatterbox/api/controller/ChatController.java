package com.enp.chatterbox.api.controller;

/*
 * @(#)ChatController.java 1.0 10/11/2024
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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enp.chatterbox.api.model.Mensaje;
import com.enp.chatterbox.api.model.SalaChat;
import com.enp.chatterbox.api.service.MensajeService;
import com.enp.chatterbox.api.service.SalaChatService;

@RestController
@RequestMapping("/api/v1/chatterbox/chat")
public class ChatController {
	
	@Autowired
    private SimpMessagingTemplate messagingTemplate;
	
	@Autowired
	private MensajeService mensajeService;
	
	@Autowired
	private SalaChatService salaChatService;

    @MessageMapping("/enviar")
    @SendTo("/sala/public")
    public Mensaje enviarMensaje(@Payload Mensaje mensaje) {
        return mensajeService.enviarMensaje(mensaje);
    }

    @PostMapping("/salas")
    public ResponseEntity<SalaChat> crearSala(@RequestBody SalaChat salaChat) {
        return ResponseEntity.ok(salaChatService.crearSala(salaChat));
    }
    
    @GetMapping("/salas")
    public ResponseEntity<List<SalaChat>> verTodasSalas(){
    	return ResponseEntity.ok(salaChatService.listarSalas());
    }

}
