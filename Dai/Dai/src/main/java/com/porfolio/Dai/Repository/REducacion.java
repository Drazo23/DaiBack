/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfolio.Dai.Repository;

import com.porfolio.Dai.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public interface REducacion extends JpaRepository<Educacion, Integer> {

    public Optional<Educacion> findByNombreE(String nombreE);

    public boolean existsByNombreE(String nombreE);

}
