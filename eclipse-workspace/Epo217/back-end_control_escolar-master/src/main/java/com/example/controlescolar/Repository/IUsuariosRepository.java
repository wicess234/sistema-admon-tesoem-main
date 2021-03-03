package com.example.controlescolar.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.controlescolar.Entity.Usuario;

@Repository
public interface IUsuariosRepository extends CrudRepository<Usuario, Long> {
	Usuario saveAndFlush(Usuario objectSpridem);
}
