/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.Dai.Service;

import com.porfolio.Dai.Entity.Educacion;
import com.porfolio.Dai.Repository.REducacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */

@Service
@Transactional
public class SEducacion {
    @Autowired
    REducacion rEducacion;
    
    public List<Educacion> lis(){
        return rEducacion.findAll();
    }
    public Optional<Educacion> getOne(int id){
        return rEducacion.findById(id);
    }
    public Optional<Educacion> getByNombre(String nombreE){
        return rEducacion.findByNombreE(nombreE);
    }
    public void save(Educacion educacion){
        rEducacion.save(educacion);
    }
    public void delete(int id){
        rEducacion.deleteById(id);
    }
    public boolean existsById(int id){
        return rEducacion.existsById(id);
    }
    public boolean existsByNombreE(String NombreE){
        return rEducacion.existsByNombreE(NombreE); 
    }
    
}
