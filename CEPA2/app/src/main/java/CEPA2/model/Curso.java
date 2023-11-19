/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CEPA2.model;

/**
 *
 * @author jordi
 */
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Cursos")
@Data
public class Curso implements Serializable{

    @Id
    @Column(name = "CursoID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cursoID;

    @Column(name = "Nombre")
    private String nombre;

    @OneToOne
    @JoinColumn(name = "LibroID")
    private Libro libro;
    
    @ManyToMany(cascade=CascadeType.PERSIST,
            fetch=FetchType.LAZY,
            mappedBy="cursos")
    private List<Estudiante> estudiantes;
    
    @Override
    public String toString(){
        return "ÏD: "+this.cursoID+", nombre: "+this.nombre;
    }
}

