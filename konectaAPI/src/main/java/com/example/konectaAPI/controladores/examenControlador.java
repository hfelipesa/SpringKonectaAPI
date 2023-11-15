package com.example.konectaAPI.controladores;

import com.example.konectaAPI.entidades.Afiliado;
import com.example.konectaAPI.entidades.Examen;
import com.example.konectaAPI.servicios.ExamenGeneralServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api/sura/examen")
public class examenControlador {
    @Autowired
    private ExamenGeneralServicio examenGeneralServicio;
    @PostMapping
    public ResponseEntity<?>registrarExamen(@RequestBody Examen examen){
        try{
            Examen respuestaExamen=this.examenGeneralServicio.examenRegistro(examen);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(respuestaExamen);
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
    //BuscarExamenGeneral
    
}
