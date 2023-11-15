package com.example.konectaAPI.servicios;

import com.example.konectaAPI.entidades.Afiliado;
import com.example.konectaAPI.repositorio.AfiliadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AfiliadoServicio {
    //RegistrarAfiliado
    @Autowired
    private AfiliadoRepositorio afiliadoRepositorio;

    public Afiliado registrarAfiliado(Afiliado afiliado) throws Exception {
        try {
            return this.afiliadoRepositorio.save(afiliado);
        } catch (Exception error) {
            throw new Exception("Error al registrar");
        }
    }

    //ConsultarAfiliado
    public Afiliado consultarAfiliado(Integer idAfiliado) throws Exception {
        try {
            Optional<Afiliado> consultaAfiliado = this.afiliadoRepositorio.findById(idAfiliado);
            if (consultaAfiliado.isPresent()) {//lo encuentra en la db
                return consultaAfiliado.get();
            } else {
                throw new Exception("Afiliado no encontrado en nuestra base de datos");
            }
        } catch (Exception error) {
            throw new Exception("Mensaje enum");
        }
        //ModificarDatosAfiliado

        //EliminarDatosAfiliado


    }
}
