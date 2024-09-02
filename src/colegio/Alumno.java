package colegio;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Alumno {
    private int legajo;
    private String nombre;
    private String Apellido;
    private Set<Materia> materias;

    public Alumno(int legajo, String nombre, String Apellido) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.materias = new HashSet <>();
      }
    
    public void agregarMateria (Materia m) {
        if (materias.add(m))
            System.out.println(" El alumno " + Apellido + " se agrego a la materia " + m.getNombre());
        else System.out.println(" El alumno " + Apellido + " ya esta incripto en la materia " + m.getNombre());        
        
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setMaterias(Set<Materia> materias) {
        this.materias = materias;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public Set<Materia> getMaterias() {
        return materias;
    }
     public int cantidadMaterias (){
         return materias.size();
         
     }
     public void mostrarInfo () {
         System.out.println(" Apellido y nombre "  +  Apellido +" "+  nombre + " con legajo " + legajo);
        
         
     }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.legajo;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.Apellido);
        hash = 67 * hash + Objects.hashCode(this.materias);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.Apellido, other.Apellido)) {
            return false;
        }
        return Objects.equals(this.materias, other.materias);
    }
      
        
        
        
        
    
}
