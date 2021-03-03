package com.example.controlescolar.service;

import java.io.File;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.example.controlescolar.Entity.Spriden;
import com.example.controlescolar.Entity.DTO.InsertDaotsAspirantesUsuarios;
import com.example.controlescolar.Entity.DTO.SpridemDTO;
import com.example.controlescolar.Entity.DTO.UploadFileDTO;


public interface IUsuariosService {
	
	


	//UsuariosDTO save(UsuariosDTO userdto);

	//ResponseEntity<SpridemDTO> save(@Valid SpridemDTO spridendto);

	//ResponseEntity<UploadFileDTO> saveFile(MultipartFile upload) throws Exception;

	ResponseEntity<UploadFileDTO> saveFile(MultipartFile file) throws Exception;

	ResponseEntity<Spriden> save(@Valid Spriden spridendto2);

	//ResponseEntity<Spriden> save(Spriden spridend);

	//ResponseEntity<UploadFileDTO> saveFile(File upldto) throws Exception;
}
