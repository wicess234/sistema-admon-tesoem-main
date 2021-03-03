package com.example.controlescolar.service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;


import com.example.controlescolar.Entity.Spriden;
import com.example.controlescolar.Entity.DTO.SpridemDTO;
import com.example.controlescolar.Entity.DTO.UploadFileDTO;
import com.example.controlescolar.Repository.ISpridemRepository;
import com.example.controlescolar.Repository.IUsuariosRepository;

@Service
public class UsauriosServiceImpl implements IUsuariosService {
	
	
	
	
	@Autowired
		private IUsuariosRepository iUsaurioRepository;
	@Autowired
	private ISpridemRepository iSrpidenRepository;
	
	@Override
	@Transactional
	public ResponseEntity<Spriden> save(@Valid Spriden spridendto2){

				Spriden idValor=  iSrpidenRepository.saveAndFlush(spridendto2);
	spridendto2.setSpridenId(idValor.getSpridenId());
		  
		return new ResponseEntity<Spriden>(spridendto2,HttpStatus.OK);
	}
	public static final String uploadingDir = System.getProperty("user.dir") + "/alumnosDocumentos";
	 
	@Override
	@Transactional
	public ResponseEntity<UploadFileDTO> saveFile(MultipartFile file) throws Exception {
			
		System.out.println(StringUtils.cleanPath(file.getOriginalFilename()));
        try {
            Path copyLocation = Paths
                .get(uploadingDir + File.separator + StringUtils.cleanPath(file.getOriginalFilename()));
            System.out.println(copyLocation);
            Files.copy(file.getInputStream(), copyLocation, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            e.printStackTrace();
          //  throw new FileStorageException("Could not store file " + file.getOriginalFilename()
          //      + ". Please try again!");
        }
			

		return null;
	}

	

}
