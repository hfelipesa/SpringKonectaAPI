package com.example.konectaAPI.entidades;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "signoVital")// esto crea una tabla
public class SignoVital {
    @Id // Esto dice que es una primari key
    @GeneratedValue(strategy = GenerationType.IDENTITY)// incrementa el ID
    @Column(name = "id", nullable = false)//creo una columna y le digo que no puede quedar vacia
    private Integer id;

    @Column(name = "nombre",length = 50,nullable = false)
    private String nombre;

    @Column(name = "unidadMedida",length =20,nullable = false)
    private Integer unidadMedida;

    @Column(name = "maximoNormal",nullable = false)
    private Double maximoNormal;

    @Column(name = "minimoNormal",nullable = false)
    private Double minimoNormal;

    @Column(name = "fechaMedida",nullable = false)
    private LocalDate fechaMedida;

    public SignoVital() {
    }

    public SignoVital(Integer id, String nombre, Integer unidadMedida, Double maximoNormal, Double minimoNormal, LocalDate fechaMedida) {
        this.id = id;
        this.nombre = nombre;
        this.unidadMedida = unidadMedida;
        this.maximoNormal = maximoNormal;
        this.minimoNormal = minimoNormal;
        this.fechaMedida = fechaMedida;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(Integer unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Double getMaximoNormal() {
        return maximoNormal;
    }

    public void setMaximoNormal(Double maximoNormal) {
        this.maximoNormal = maximoNormal;
    }

    public Double getMinimoNormal() {
        return minimoNormal;
    }

    public void setMinimoNormal(Double minimoNormal) {
        this.minimoNormal = minimoNormal;
    }

    public LocalDate getFechaMedida() {
        return fechaMedida;
    }

    public void setFechaMedida(LocalDate fechaMedida) {
        this.fechaMedida = fechaMedida;
    }
}
