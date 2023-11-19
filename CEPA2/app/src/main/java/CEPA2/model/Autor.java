/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CEPA2.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author jordi
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Autores")
public class Autor implements Serializable{

    @Id
    @Column(name = "AutorID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int autorID;

    @Column(name = "Nombre")
    private String nombre;
    
    @OneToMany(mappedBy = "autor",cascade=CascadeType.PERSIST,fetch = FetchType.LAZY)
    private List<Libro> libros;
    
    @Override
    public String toString(){
        return "ID: "+this.autorID+", Nombre: "+this.nombre;
    }
}
