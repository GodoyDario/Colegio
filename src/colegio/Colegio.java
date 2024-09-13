
package colegio;

import vistas.Sistema;
import java.util.HashSet;
import java.util.Set;
import javax.swing.SwingUtilities;

/**
 *
 * @author Xethias
 */
public class Colegio {

   
    public static void main(String[] args) {
        Materia materia = new Materia (15,"ingles 1 ", 1);
        Materia materia2 = new Materia (16,"Matematicas ", 1);
        Materia materia3 = new Materia (17,"Laboratorio 1 ", 1);
        
        Set<Materia> MateriasHash = new HashSet<>();
        MateriasHash.add(materia);
        //MateriasHash.add("Matemáticas de primer año.");
        //MateriasHash.add("Laboratorio 1 de primer año");
         System.out.println(MateriasHash);
         
         Alumno alumno = new Alumno (1001, "Martin", "Lopez");
         Alumno alumno2 = new Alumno (1002, "Brenda", "Martinez");
         
         alumno.agregarMateria(materia);
         alumno.agregarMateria(materia2);
         alumno.agregarMateria(materia3);
         
         alumno2.agregarMateria(materia);
         alumno2.agregarMateria(materia2);
         alumno2.agregarMateria(materia3);
         alumno2.agregarMateria(materia3);
         
         System.out.println(materia);
         
         System.out.println(alumno.getApellido()+ " esta inscripto en: " + alumno.cantidadMaterias() + " materias.");
         System.out.println(alumno2.getApellido()+ " esta inscripto en: " + alumno2.cantidadMaterias() + " materias.");
         
         iniciarInterfaz();
    }
            public static void iniciarInterfaz (){
            SwingUtilities.invokeLater (()-> {
                Sistema colegio = new Sistema();
                colegio.setVisible(true);
            }) ;
       
    }
    
}
