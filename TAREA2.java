public class TAREA2 {
    public static void TAREA(String[] args) {
        Persona edad = new Persona();
        edad.setEdad(20);

        Persona nombre = new Persona();
        nombre.setNombre("Osmando");

        Persona telefono = new Persona();
        telefono.setTelefono("44882299123");

        System.out.println(edad.getEdad());
        System.out.println(nombre.getNombre());
        System.out.println(telefono.getTelefono());

    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }

}