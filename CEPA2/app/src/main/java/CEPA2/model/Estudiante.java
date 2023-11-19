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
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Estudiantes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante implements Serializable {

    @Id
    @Column(name = "EstudianteID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int estudianteID;

    @Column(name = "Nombre")
    private String nombre;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinTable(name = "EstudiantesCursos",
            joinColumns = {
                @JoinColumn(name = "EstudianteID",
                        foreignKey = @ForeignKey(name = "FK_DOC_EST"))},
            inverseJoinColumns = {
                @JoinColumn(name = "CursoID", foreignKey = @ForeignKey(name = "FK_DOC_CUR"))})
    private List<Curso> cursos;
    
    @Override
    public String toString(){
        return "ID: "+this.estudianteID+",Nombre: "+this.nombre;
    }
}
