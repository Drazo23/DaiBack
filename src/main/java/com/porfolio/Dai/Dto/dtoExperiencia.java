/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.Dai.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author User
 */
public class dtoExperiencia {

    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String periodo;

    //constructores
    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String periodo) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.periodo = periodo;
    }

    //Getter y Setter
    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

}
