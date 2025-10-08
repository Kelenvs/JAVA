public class ValorEspecifico {
    public static void main(String[]args){

    int[] numeros = {85, 65, 92, 55, 78, 90, 45};
    int cont = 0;
    for(int i = 0; i < numeros.length; i++) { 
    if(numeros[i] >= 70){
        cont++;
    }
    } 
    System.out.println("   Existem " + cont + " notas maior que 70." );
}
}
