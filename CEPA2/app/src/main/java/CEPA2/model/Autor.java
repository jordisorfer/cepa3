/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CEPA2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author jordi
 */
@Data
@AllArgsConstructor
@Entity
@Table(name = "Autores")
public class Autor {

    @Id
    @Column(name = "AutorID")
    private int autorID;

    @Column(name = "Nombre")
    private String nombre;
}
