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
    
    public int read (String nome){
        int tamanho_lista = nomes.size();
        String nomes_busca;
        int checagem = 0;

        while(checagem <= tamanho_lista){
            nomes_busca = nomes.get(checagem);
            if(nome == nomes_busca){
                return checagem;
            }
            checagem += 1;
            
        }

        return -2;
    }

    public int create (String nome, String grupo, String grupo2, int iv, String sexo){
        
        /*checagem 
         * Defini uma variavel para pegar o tamanho completo do vetor, alem disso salvei outra variavel para receber os nomes dos pokemons de acordo com a checagem, que nesse caso tambem será o valor respectivo ao indice. O while ira continuar rodando enquanto o tamanho da lista não for do mesmo tamanho do vetor, assim ele consegue averiguar cada componente, e caso, se nessa busca, ja exista um pokemon de mesmo nome registrado, o usuario deve refazer o cadastro com um nome diferente.
        */

        /*Opções do Return
            * 1 - Pokemon Registrado com sucesso ou deu certo
            * -2 - Pokemon Já Registrado ou tem problema
         */
        
        /*Criação dos arrays */
            nomes.add(nome);
            grupos.add(grupo);
            grupos2.add(grupo2);
            ivs.add(iv);
            sexos.add(sexo);
        
        return 1;
    }

    /*A variavel checagem sera utilizada para ser o meio de busca nos arryas, e do mesmo jeito temos o tamanho da lista para ser um limite quando começar a buscar o nome do pokemon, e por ultimo temos a variavel, nome_busca que é uma strig vazia que irá receber o nome do array nomes de acordo com o index e checagem
     * 
     * Dentro do while, o index dos nomes será visto um por um até identificar um nome igual, e caso tenha, vai quebrar o looping de busca e irá realizar normalmente a deletagem do pokemon dentro do crud.
     * 
     * Alem disso, caso a busca não de nenhum resultado, vai retornar o valor 2 que sera usado para identificar que não foi possivel realizar a função
     */

    public int remove (String nome, int checagem){
        checagem = 0;
        int tamanho_lista = nomes.size();
        String nome_busca = "";
            while(checagem<= tamanho_lista){
                nome_busca = nomes.get(checagem);
                if(nome == nome_busca){
                    break;
                }
                checagem =+ 1;
                if(checagem == tamanho_lista & nome != nome_busca){
                    checagem =+ 1;
                    return -2;
                }
            }
        nomes.remove(checagem);
        grupos.remove(checagem);
        grupos2.remove(checagem);
        ivs.remove(checagem);
        sexos.remove(checagem);
        return 1;
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int  escolha_sexo; 
        int escolha_ivs;

        int escolha;
        while(true){
            System.out.println("escolha operaçao");
            System.out.println("1-adicionar pokemon");
            System.out.println("2-remover");
            escolha = input.nextInt();
            
            if(escolha ==1){
                System.out.println("qual sexo masculino(1) feminino (2)");
                escolha_sexo = input.nextInt();

                System.out.println("quantos ivs perfeitos tem de 0 a 6 ");
                escolha_ivs = input.nextInt();
            }
    }

}
