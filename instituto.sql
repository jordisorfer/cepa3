-- Crear la base de datos Instituto y usarla
Drop database if exists instituto;
CREATE DATABASE IF NOT EXISTS Instituto;
USE Instituto;

-- Crear tabla Autores
CREATE TABLE Autores (
    AutorID int AUTO_INCREMENT PRIMARY KEY,
    Nombre varchar(100)
);

-- Crear tabla Libros
CREATE TABLE Libros (
    LibroID int AUTO_INCREMENT PRIMARY KEY,
    Titulo varchar(100),
    AutorID int,
    FOREIGN KEY (AutorID) REFERENCES Autores(AutorID)
);

-- Crear tabla Cursos
CREATE TABLE Cursos (
    CursoID int AUTO_INCREMENT PRIMARY KEY,
    Nombre varchar(100),
    LibroID int,
    FOREIGN KEY (LibroID) REFERENCES Libros(LibroID)
);

-- Crear tabla Estudiantes
CREATE TABLE Estudiantes (
    EstudianteID int AUTO_INCREMENT PRIMARY KEY,
    Nombre varchar(100)
);

-- Crear tabla EstudiantesCursos
CREATE TABLE EstudiantesCursos (
    EstudianteID int,
    CursoID int,
    PRIMARY KEY (EstudianteID, CursoID),
    FOREIGN KEY (EstudianteID) REFERENCES Estudiantes(EstudianteID),
    FOREIGN KEY (CursoID) REFERENCES Cursos(CursoID)
);

-- Insertar datos en la tabla Autores
INSERT INTO Autores (Nombre) VALUES ('Gabriel García Márquez');
INSERT INTO Autores (Nombre) VALUES ('Isabel Allende');
INSERT INTO Autores (Nombre) VALUES ('Julio Cortázar');

-- Insertar datos en la tabla Libros
INSERT INTO Libros (Titulo, AutorID) VALUES ('Cien años de soledad', 1);
INSERT INTO Libros (Titulo, AutorID) VALUES ('La casa de los espíritus', 2);
INSERT INTO Libros (Titulo, AutorID) VALUES ('Rayuela', 3);

-- Insertar datos en la tabla Cursos
INSERT INTO Cursos (Nombre, LibroID) VALUES ('Literatura Latinoamericana', 1);
INSERT INTO Cursos (Nombre, LibroID) VALUES ('Introducción a la Novela', 2);
INSERT INTO Cursos (Nombre, LibroID) VALUES ('Análisis Literario', 3);

-- Insertar datos en la tabla Estudiantes
INSERT INTO Estudiantes (Nombre) VALUES ('Juan Pérez');
INSERT INTO Estudiantes (Nombre) VALUES ('Ana Gómez');
INSERT INTO Estudiantes (Nombre) VALUES ('Luisa Fernández');

-- Insertar datos en la tabla EstudiantesCursos
INSERT INTO EstudiantesCursos (EstudianteID, CursoID) VALUES (1, 1);
INSERT INTO EstudiantesCursos (EstudianteID, CursoID) VALUES (2, 2);
INSERT INTO EstudiantesCursos (EstudianteID, CursoID) VALUES (3, 3);

