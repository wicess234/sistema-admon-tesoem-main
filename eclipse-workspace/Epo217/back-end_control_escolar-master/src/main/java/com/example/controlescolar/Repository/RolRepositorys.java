package com.example.controlescolar.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.controlescolar.Entity.Rol;

@Repository
public interface RolRepositorys extends JpaRepository<Rol, Long> {

}
