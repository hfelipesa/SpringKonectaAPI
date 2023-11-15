package com.example.konectaAPI.controladores;

import com.example.konectaAPI.entidades.Examen;
import com.example.konectaAPI.entidades.SignoVital;
import com.example.konectaAPI.servicios.ExamenGeneralServicio;
import com.example.konectaAPI.servicios.SignoVitalServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/sura/signoVital")
public class signoVitalControlador {
    @Autowired
        private SignoVitalServicio signoVitalServicio;
        @PostMapping
        public ResponseEntity<?> registrarSignoVital(@RequestBody SignoVital signoVital){
            try{
                SignoVital respuestadoSignoVital=this.signoVitalServicio.registosignovital(signoVital);
                return ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body(respuestadoSignoVital);
            }catch (Exception error){
                return ResponseEntity
                        .status(HttpStatus.BAD_REQUEST)
                        .body(error.getMessage());
            }
        }

    //BuscarSignoVital


    }



