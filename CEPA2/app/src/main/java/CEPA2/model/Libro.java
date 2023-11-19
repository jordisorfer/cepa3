/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CEPA2.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author jordi
 */
@Data
@Entity
@Table(name = "Libros")
@NoArgsConstructor
@AllArgsConstructor
public class Libro implements Serializable{

    @Id
    @Column(name = "LibroID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int libroID;

    @Column(name = "Titulo")
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "AutorID", nullable = false)
    private Autor autor;
    
    @Override
    public String toString(){
        return "Libro: "+this.libroID+", Titulo: "+this.titulo;
    }
}