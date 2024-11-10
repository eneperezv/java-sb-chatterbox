package com.enp.chatterbox.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enp.chatterbox.api.model.SalaChat;

@Repository
public interface SalaChatRepository extends JpaRepository<SalaChat,Long> {

}
