import java.util.ArrayList;
import java.util.Scanner;
 
public class Pikomon{
    public static void main(String[] args) {
        
        public static ArrayList<String> nomes = new ArrayList<>(); 
        public static ArrayList<String> grupos = new ArrayList<>();
        public static ArrayList<Integer> ivs = new ArrayList<>();
        public static ArrayList<String> Sexos = new ArrayList<>(); 
        public static ArrayList<Integer> pesquisa = new ArrayList<>();

        /* Criado os 4 primeiros arraylist para o cadastro de pokemon, e por ultimo um array para ser usado de filtro */

        /*No recebimento dos grupos, teremos uma lista com numeros que o cliente decidira o grupo com base no numero do grupo indicado em uma lista, e no codigo esse numero sera transformado em uma string e adicionada no array com o nome correto do grupo */

        /*Em relação, ao sexo, sera a mesma coisa acima */


        public static Int Create (String nome, String grupo, int iv, String sexo, Int teste = 2){
            
            /*checagem */
            int checagem = 0;
            int tamanho_lista = nome.size();

            while (checagem <= tamanho_lista){
                if (nome == nomes[0]){
                    teste = 1;
                    break;
                 }
                checagem += 1;
            }

            /*Criação dos arrays */

            if (teste == 2){
                nomes.add(nome);
                grupos.add(grupo);
                ivs.add(iv);
                sexos.add(sexo);

            }
            
            
        
        }

    }
}