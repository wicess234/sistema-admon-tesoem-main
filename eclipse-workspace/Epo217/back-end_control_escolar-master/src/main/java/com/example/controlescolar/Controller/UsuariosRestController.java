package com.example.controlescolar.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.controlescolar.Entity.Spriden;
import com.example.controlescolar.Entity.DTO.EmailDTO;
import com.example.controlescolar.Entity.DTO.SpbpersDTO;
import com.example.controlescolar.Entity.DTO.SpraddrDTO;
import com.example.controlescolar.Entity.DTO.SpridemDTO;
import com.example.controlescolar.Entity.DTO.UploadFileDTO;
import com.example.controlescolar.Entity.DTO.UsuariosDTO;
import com.example.controlescolar.Exception.CustomerExceptionHandler;
import com.example.controlescolar.service.UsauriosServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="Microservicio que registra a los usuarios")
@CrossOrigin(origins="*")
@Validated
public class UsuariosRestController  extends CustomerExceptionHandler{
	
	
	@Autowired
	private UsauriosServiceImpl usaurioServiceImpl;
	
	@PostMapping(value="/registro")
	@ApiOperation(value="Guarda los aspirantes cuando realizan su registro")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Spriden> newUsuario(@Valid @RequestBody
			Spriden spridendto)   {
		
		UsuariosDTO usuariosdto=new UsuariosDTO();
			
				usaurioServiceImpl.save(spridendto);
											
		return new ResponseEntity<Spriden>(spridendto,HttpStatus.OK);
	}
	
	@PostMapping("/GuardaEmail")
	@ApiOperation(value="Guarda el correo electronico que el usuario registre")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<EmailDTO> guardaEmail(@Valid @RequestBody EmailDTO  emaildto){
		
				
		
		return new ResponseEntity<EmailDTO>(emaildto, HttpStatus.OK);
		
	}
	
	@PostMapping("/GuardaDatos")
	@ApiOperation(value="Guarda los datos como el Sexo, estado civil del usuario registrado")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<SpbpersDTO> spbpersSave(@Valid @RequestBody SpbpersDTO spbrsdto){
		
		
		return new ResponseEntity<SpbpersDTO>(spbrsdto,HttpStatus.OK);
	}
	

	
	@PostMapping("/GuardaDatosDireccion")
	@ApiOperation(value="Guarda la dirección del usuario registrado")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<SpraddrDTO> spraddrSave(@Valid @RequestBody SpraddrDTO spraddrdto){
		return new ResponseEntity<SpraddrDTO>(spraddrdto,HttpStatus.OK);
	}
	

	@PostMapping("/GuardarArchivos")
	@ApiOperation(value="Guarda la dirección del usuario registrado")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<UploadFileDTO> saveFile( @RequestParam("file")  MultipartFile file ) throws Exception{	
		usaurioServiceImpl.saveFile(file);
		return new ResponseEntity<UploadFileDTO>(HttpStatus.OK);
	}
	
}
