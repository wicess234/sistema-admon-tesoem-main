import { Component, OnInit } from '@angular/core';
import * as $ from 'jquery';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
})
export class AppComponent implements OnInit{
  title = 'sistema-admon-tesoem';

  ngOnInit(){
   
    $(document).ready(function() {
      $("#validarCurp").click(function(){
        var curp=$("#txtCurp").val();
          $.ajax({
            url:'https://conectame.ddns.net/rest/api.php?m=curp&user=prueba&pass=sC%7D9pW1Q%5Dc&val='+curp,
            method:"GET",
            success:function(response){
              //alert(JSON.stringify(response));
                 response=JSON.parse(JSON.stringify(response));
                 $("#txtNombre").val(response.Nombre);
                 $("#txtApellidoP").val(response.Paterno);
                 $("#txtApellidoM").val(response.Materno);
                 $("#txtFechaN").val(response.FechaNacimiento);
                 if(response.Sexo=="H"){
                  $("input#rSexo1").prop("checked", true);
                 }else{
                  $("input#rSexo2").prop("checked", true);
                 }
            }
          });
      });
      
      $("#btnGuardaDatosP").click(function(){
      var nombre= $("#txtNombre").val();
      alert(nombre);
      });

      
      $("#btnCP").click(function(){
        var endpoint_sepomex  = "http://api-sepomex.hckdrk.mx/query/";
        var method_sepomex = 'info_cp/';
        var cp = $("#txtCodigoPostal").val();
        var variable_string = '?type=simplified';
        var url = endpoint_sepomex + method_sepomex + cp + variable_string;
        
         $.ajax({
            url:url,
            method:"GET",
            success:function(data){

              data=JSON.parse(JSON.stringify(data));
              console.log(JSON.stringify(data));
              $("#txtEstado").val(data.response.estado);
              $("#txtMunicipio").val(data.response.municipio);
              $("#txtCiudad").val(data.response.ciudad);
              $("#txtPais").val(data.response.pais);
                for (let index = 0; index < data.response.asentamiento.length; index++) {
                  const element = data.response.asentamiento[index];
                  
                  $("#txtColonia").append('<option value="' + index + '">' + element + '</option>')
                }
            }
          });
      });
    });
}

}

