package com.example.konectaAPI.servicios;

import com.example.konectaAPI.entidades.Afiliado;
import com.example.konectaAPI.entidades.SignoVital;
import com.example.konectaAPI.repositorio.AfiliadoRepositorio;
import com.example.konectaAPI.repositorio.SignoVitalRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignoVitalServicio {
@Autowired
private SignoVitalRepositorio signoVitalRepositorio;
    public SignoVital registosignovital(SignoVital signoVital)throws Exception{
        try{
            return this.signoVitalRepositorio.save(signoVital);
        }catch (Exception error){
            throw new Exception("Error al registrar");
        }
    }
}
