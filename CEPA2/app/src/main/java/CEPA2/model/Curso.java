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
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.ArrayList;
import lombok.Data;


@Entity
@Table(name = "Cursos")
@Data
public class Curso {

    @Id
    @Column(name = "CursoID")
    private int cursoID;

    @Column(name = "Nombre")
    private String nombre;

    @OneToOne
    @JoinColumn(name = "LibroID")
    private Libro libro;
    
    @ManyToMany(cascade=CascadeType.PERSIST,
            fetch=FetchType.LAZY,
            mappedBy="cursos")
    private ArrayList estudiantes;
}

