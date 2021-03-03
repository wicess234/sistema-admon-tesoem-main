package com.example.controlescolar.Entity.DTO;

import java.io.Serializable;
import java.util.Set;

import com.example.controlescolar.Entity.Rol;
import com.example.controlescolar.Entity.Sesion;

public class UsuariosDTO implements Serializable{

	private int usuarioId;
	private String usuarioSpridenId;
	private String usuarioTokenPass;
	private Set<Rol> rols;
	private Set<Sesion> sesions;
	private Rol rol;
	
}
