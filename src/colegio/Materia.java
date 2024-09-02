
package colegio;


public class Materia {
    private int idMateria;
    private String Nombre;
    private int Anio;

    public Materia(int idMateria, String Nombre, int Anio) {
        this.idMateria = idMateria;
        this.Nombre = Nombre;
        this.Anio = Anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int Anio) {
        this.Anio = Anio;
    }

    @Override
    public String toString() {
        return "Materia{" + "idMateria=" + idMateria + ", Nombre=" + Nombre + ", Anio=" + Anio + '}';
    }

          
        }
            
    

