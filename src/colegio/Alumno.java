package colegio;

import java.util.HashSet;
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
     public int cantidadMaterias (){
         return materias.size();
         
     }
     public void mostrarInfo () {
         System.out.println(" Apellido y nombre "  +  Apellido +" "+  nombre + " con legajo " + legajo);
        
         
     }
      
        
        
        
        
    
}
