public class MAIN {
    public static void main(String[] args) { 
        for(int contador = 1; contador <= 10; contador = contador + 1){
            System.out.println(contador);
        }
        int valores[] = new int[5];
        for(int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }
        COCHE Micoche = new COCHE();
        Micoche.Npuertas();
        Micoche.Npuertas();
        Micoche.Npuertas();
        Micoche.Npuertas();
        System.out.println(Micoche.Apuertas);

        soma(10, 20, 30);
        // Bucle While:
        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
        // Bucle do while:
        int numeroDo = 0;
        while(numeroDo < 3);
        //Bucle for
        for(int numeroFor = 0; numeroFor < 3;numeroFor = numeroFor + 1){
            System.out.println(numeroFor);
        }
        // for(int i : numero)
        String estacion = "Otono";
            switch(estacion){
                case "verano":
                System.out.println("Es verano");
                    break;
                case "Invierno":
                    System.out.println("Es invierno");
                    break;
                default:
                    System.out.println("Es " + estacion);
            }
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
