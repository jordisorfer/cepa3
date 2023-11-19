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
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Table(name = "Estudiantes")
@Data
@AllArgsConstructor
public class Estudiante {

    @Id
    @Column(name = "EstudianteID")
    private int estudianteID;

    @Column(name = "Nombre")
    private String nombre;
    
    @ManyToMany(cascade=CascadeType.PERSIST,fetch=FetchType.LAZY)
    @JoinTable(name="EstudiantesCursos",
            joinColumns={@JoinColumn(name="EstudianteID",
                foreignKey=@ForeignKey(name="FK_DOC_EST"))},
            inverseJoinColumns={@JoinColumn(name="CursoID",foreignKey=@ForeignKey(name="FK_DOC_CUR"))})
    private ArrayList cursos;
            
}
