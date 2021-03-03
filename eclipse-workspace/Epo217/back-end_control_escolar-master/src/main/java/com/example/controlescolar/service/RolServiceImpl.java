package com.example.controlescolar.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.controlescolar.Entity.Rol;
import com.example.controlescolar.Repository.RolRepositorys;

@Service
public class RolServiceImpl implements IRolService{
	
	@Autowired
	private RolRepositorys rolRepository;

	@Override
	@Transactional
	public List<Rol> findAll() {
		return (List<Rol>) rolRepository.findAll();
	}

}
