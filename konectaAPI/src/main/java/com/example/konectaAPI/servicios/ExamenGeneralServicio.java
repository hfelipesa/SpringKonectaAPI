package com.example.konectaAPI.servicios;

import com.example.konectaAPI.entidades.Examen;
import com.example.konectaAPI.repositorio.ExamenRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamenGeneralServicio {

    @Autowired
    private ExamenRepositorio examenRepositorio;
    public Examen examenRegistro(Examen examen)throws Exception{
        try{
            return this.examenRepositorio.save(examen);
        }catch (Exception error){
            throw new Exception("Error al registrar");
        }
    }
}
