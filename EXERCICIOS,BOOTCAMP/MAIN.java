public class MAIN {
    public static void main(String[] args) {
        COCHE Micoche = new COCHE();
        Micoche.Npuertas();
        System.out.println(Micoche.Apuertas);

        soma(10, 20, 30);
    }
    public static void soma(int a, int b, int c){
        int resultado;

        resultado = a + b + c;
        System.out.println(resultado);
    }
}
class COCHE{
    public int Apuertas = 0;

    public void Npuertas() {
        this.Apuertas++;
    }


}
