/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CEPA2.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author jordi
 */
@Data
@Entity
@Table(name = "Libros")
public class Libro {

    @Id
    @Column(name = "LibroID")
    private int libroID;

    @Column(name = "Titulo")
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "AutorID", nullable = false)
    private Autor autor;
}