public class temperatura {
    public static void main(String[]args){
        int[] temperaturas = {23, 27, 31, 28, 25, 30, 26};
        int maior = temperaturas[0];
 
        for(int i = 0; i < temperaturas.length; i++) { 
     
        if(temperaturas[i] > maior){
          maior = temperaturas[i];
          }
       } 
        System.out.println("    A maior temperatura é " + maior +"°");
    }
}