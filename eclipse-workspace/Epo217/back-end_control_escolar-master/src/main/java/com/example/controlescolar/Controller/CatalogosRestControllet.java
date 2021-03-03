package com.example.controlescolar.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST para generar catalogos")
@CrossOrigin(origins="*")
public class CatalogosRestControllet {


}
