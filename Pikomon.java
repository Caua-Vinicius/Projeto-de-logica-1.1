import java.util.ArrayList;
import java.util.Scanner;
 
        
public class Pikomon {
    public static ArrayList<String> nomes = new ArrayList<>(); 
    public static ArrayList<String> grupos = new ArrayList<>();
    public static ArrayList<String> grupos2 = new ArrayList<>();
    public static ArrayList<Integer> ivs = new ArrayList<>();
    public static ArrayList<String> sexos = new ArrayList<>(); 
    public static ArrayList<Integer> pesquisa = new ArrayList<>();

    /* Criado os 5 primeiros arraylist para o cadastro de pokemon, e por ultimo um array para ser usado de filtro */

    /*No recebimento dos grupos, teremos uma lista com numeros que o cliente decidira o grupo com base no numero do grupo indicado em uma lista, e no codigo esse numero sera transformado em uma string e adicionada no array com o nome correto do grupo */

    /*Em relação, ao sexo, sera a mesma coisa acima */


    public int create (String nome, String grupo, String grupo2, int iv, String sexo, int teste){
        
        /*checagem 
         * Defini uma variavel para pegar o tamanho completo do vetor, alem disso salvei outra variavel para receber os nomes dos pokemons de acordo com a checagem, que nesse caso tambem será o valor respectivo ao indice. O while ira continuar rodando enquanto o tamanho da lista não for do mesmo tamanho do vetor, assim ele consegue averiguar cada componente, e caso, se nessa busca, ja exista um pokemon de mesmo nome registrado, o usuario deve refazer o cadastro com um nome diferente.
        */

        /*Opções do Return
            * 1 - Pokemon Registrado com sucesso ou deu certo
            * 2 - Pokemon Já Registrado ou tem problema
         */

        int tamanho_lista = nomes.size();
        String nomes_busca;
        int checagem = 0;
        
        while(checagem <= tamanho_lista){
            nomes_busca = nomes.get(checagem);
            if(nome == nomes_busca){
                return 2;
            }
        }
        

        /*Criação dos arrays */

        if (teste == 2){
            nomes.add(nome);
            grupos.add(grupo);
            grupos2.add(grupo2);
            ivs.add(iv);
            sexos.add(sexo);

        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int escolha;
    }

}
