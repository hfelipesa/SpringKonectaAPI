package com.example.konectaAPI.controladores;

import com.example.konectaAPI.entidades.Afiliado;
import com.example.konectaAPI.servicios.AfiliadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/sura/afiliados") //Epoints
public class AfiliadoControlador {
    @Autowired
    private AfiliadoServicio afiliadoServicio;
    //agragarAfiliado
    //Status=Ver si el codigo tuvo problemas o no. Estados 200,300,400,500 back 200 y 400
    @PostMapping
    public ResponseEntity<?>AgregarAfiliado(@RequestBody Afiliado afiliado){
        try{
            Afiliado respuestaServicio=this.afiliadoServicio.registrarAfiliado(afiliado);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(respuestaServicio);
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
    //Buscar afiliado
    @GetMapping("/{id}")
    public  ResponseEntity<?>buscarAfiliado(@PathVariable Integer id){
        try{
            Afiliado respuestaServicio=this.afiliadoServicio.consultarAfiliado(id);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(respuestaServicio);
        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

}
