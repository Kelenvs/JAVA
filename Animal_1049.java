import java.util.Scanner;

public class Animal_1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Lê as três palavras, uma em cada linha.
        String palavra1 = sc.next(); // Ex: vertebrado ou invertebrado
        String palavra2 = sc.next(); // Ex: ave, mamifero, inseto, anelideo
        String palavra3 = sc.next(); // Ex: carnivoro, onivoro, herbivoro, hematofago
        
        String animal = ""; // Variável para armazenar o nome do animal.
        
        // 2. ESTRUTURA DE DECISÃO ANINHADA
        
        // --- RAMO 1: VERTEBRADO ---
        if (palavra1.equals("vertebrado")) {
            
            // Sub-Ramo: AVE
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    animal = "aguia";
                } else if (palavra3.equals("onivoro")) {
                    animal = "pomba";
                }
            } 
            
            // Sub-Ramo: MAMIFERO
            else if (palavra2.equals("mamifero")) {
                if (palavra3.equals("onivoro")) {
                    animal = "homem";
                } else if (palavra3.equals("herbivoro")) {
                    animal = "vaca";
                }
            }
        } 
        
        // --- RAMO 2: INVERTEBRADO ---
        else if (palavra1.equals("invertebrado")) {
            
            // Sub-Ramo: INSETO
            if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematofago")) {
                    animal = "pulga";
                } else if (palavra3.equals("herbivoro")) {
                    animal = "lagarta";
                }
            } 
            
            // Sub-Ramo: ANELIDEO
            else if (palavra2.equals("anelideo")) {
                if (palavra3.equals("hematofago")) {
                    animal = "sanguessuga";
                } else if (palavra3.equals("onivoro")) {
                    animal = "minhoca";
                }
            }
        }
        
        // 3. IMPRIME O NOME DO ANIMAL
        System.out.println(animal);
        
        sc.close();
    }
}