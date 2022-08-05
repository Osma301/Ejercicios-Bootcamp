// TAREA HERENCIA :D
public class PERSONA1 {
    public int edad = 0;
    public String nombre;
    public String telefono;
}
class ClIENTE extends PERSONA1{ 
    private double credito;

    public void setCredito(double credito){
        this.credito = credito;
    }
    public double getCredito(){
        return this.credito;
    }
}
class TRABAJADOR extends PERSONA1 {
    private double salario;

    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }

}