import java.util.ArrayList;
import java.util.Scanner;

public class Pikomon {
    public static ArrayList<String> nomes = new ArrayList<>();
    public static ArrayList<String> grupos1 = new ArrayList<>();
    public static ArrayList<String> grupos2 = new ArrayList<>();

    public static ArrayList<Integer> grupos1_int = new ArrayList<>();
    public static ArrayList<Integer> grupos2_int = new ArrayList<>();

    public static ArrayList<Integer> ivs = new ArrayList<>();

    
    public static ArrayList<Integer> sexos_int = new ArrayList<>();
    public static ArrayList<String> sexos = new ArrayList<>();

    public static ArrayList<Integer> pesquisa = new ArrayList<>();

    /*
     * Criado os 5 primeiros arraylist para o cadastro de pokemon, e por ultimo um
     * array para ser usado de filtro
     */

    /*
     * No recebimento dos grupos, teremos uma lista com numeros que o cliente
     * decidira o grupo com base no numero do grupo indicado em uma lista, e no
     * codigo esse numero sera transformado em uma string e adicionada no array com
     * o nome correto do grupo
     */

    /* Em relação, ao sexo, sera a mesma coisa acima */

    /*
     * Opções do Return
     * 1 - Pokemon Registrado com sucesso ou deu certo
     * -2 - Pokemon Já Registrado ou tem problema
     */

    public static int read_nome(String nome) {
        int tamanho_lista = nomes.size();
        String nomes_busca;
        int checagem = 0;

        /*
         * Nessa função temos a pesquisa baseada no nome do pokemon, que traduzindo o
         * codigo para um portugol, temos:
         * ENQUANTO a checagem for menor que o tamanho da lista, o programa vai de linha
         * em linha procurando um nome identico ao digitado, SE o nome existir, ele ira
         * RETORNAR o valor da função, com o indice que se encontra o nome, CASO não
         * exista nenhum nome na lista de nomes identico ao informado, o codigo sairá do
         * WHILE e ira retornar -2 que é o valor de erro ou de não encontrado
         */

        while (checagem < tamanho_lista) {
            nomes_busca = nomes.get(checagem);
            if (nome.equals(nomes_busca)) {
                return checagem;
            }
            checagem += 1;

        }

        return -2;
    }

    /*As funções de transcrição estão servindo para transformar o grupo recebido em inteiros e transcreve-los para uma String */


    public static String transcricao2(int grupo_int){
        
        if(grupo_int == 0){
            return "NaN";
        }
        if(grupo_int == 1){
            return "Amorphous";
        }
        if(grupo_int == 2){
            return "Bug";
        }
        if(grupo_int == 3){
            return "Dragon";
        }
        if(grupo_int == 4){
            return "Fairy";
        }
        if(grupo_int == 5){
            return "Field";
        }
        if(grupo_int == 6){
            return "Flying";
        }
        if(grupo_int == 7){
            return "Grass";
        }
        if(grupo_int == 8){
            return "Human-Like";
        }
        if(grupo_int == 9){
            return "Mineral";
        }
        if(grupo_int == 10){
            return "Monster";
        }
        if(grupo_int == 11){
            return "Water_1";
        }
        if(grupo_int == 12){
            return "Water_2";
        }
        if(grupo_int == 13){
            return "Water_3";
        }
        else{
            return "Não informado corretamente";
        }
    }

    public static String transcricao1(int grupo_int){
        if(grupo_int == 1){
            return "Amorphous";
        }
        if(grupo_int == 2){
            return "Bug";
        }
        if(grupo_int == 3){
            return "Dragon";
        }
        if(grupo_int == 4){
            return "Fairy";
        }
        if(grupo_int == 5){
            return "Field";
        }
        if(grupo_int == 6){
            return "Flying";
        }
        if(grupo_int == 7){
            return "Grass";
        }
        if(grupo_int == 8){
            return "Human-Like";
        }
        if(grupo_int == 9){
            return "Mineral";
        }
        if(grupo_int == 10){
            return "Monster";
        }
        if(grupo_int == 11){
            return "Water_1";
        }
        if(grupo_int == 12){
            return "Water_2";
        }
        if(grupo_int == 13){
            return "Water_3";
        }
        else{
            return "Não informado corretamente";
        }
    }

    public static String transcricao_sexo(int sexo_int){

        /*Ao receber o valor inteiro da escolha do sexo do pokemon, será retornado a String com o nome escrito do sexo definido */
        if(sexo_int == 1){
            return "Masculino";
        }
        else{
            return "Feminino";
        }
    }

    public static int read_grupo(int grupo) {
        int checagem = 0;
        int grupo_busca, grupo_busca2;
        int tamanho_lista = grupos1.size();

        /*
         * Após receber o nome, a função ira averiguar todas a lista de Grupos tanto o 1
         * como o 2 ENQUANTO a checagem for menor que o tamanho da lista de pokemons, e
         * SE o grupo informado for IGUAL a algum existente em alguns dos grupos(1 ou
         * 2), ele irá salvar o indece que nesse caso é a checagem, no ARRAY pesquisa e
         * vai fazendo isso até a checagem ser igual ao tamanho do array grupos1, após
         * terminar esse looping, o programa irá averiguar se o tamanho do ARRAY de
         * pesquisa for maior que 0, assim retornando 1 e confirmando que houve
         * resultado para as buscas, SENAO ele ira retornar -2 indicando que não houve
         * resultados
         * 
         */

        while (checagem < tamanho_lista) {
            grupo_busca = grupos1_int.get(checagem);
            grupo_busca2 = grupos2_int.get(checagem);

            if (grupo == grupo_busca || grupo == grupo_busca2) {
                pesquisa.add(checagem);
            }
            checagem +=1;
        }

        if (pesquisa.size() >= 0) {
            return 1;
        } else {
            return -2;
        }

    }

    public static int create(String nome, int grupo1_int, int grupo2_int, int iv, int sexo_int) {

        /*
         * A checagem vai receber o valor do return da função read_nome(), dependendo do
         * resultado ira retornar que não foi possivel realizar o cadastro porque ja
         * existia um pokemon, ou ira adicionar normalmente
         */

        String grupo1 = transcricao1(grupo1_int);
        String grupo2 = transcricao2(grupo2_int);
        String sexo = transcricao_sexo(sexo_int);
        int checagem = read_nome(nome);
        if (checagem > 0) {
            return -1;
        }

        /* Adição do pokemon e suas informações nos respectivos arrays */
        nomes.add(nome);
        grupos1_int.add(grupo1_int);
        grupos2_int.add(grupo2_int);
        grupos1.add(grupo1);
        grupos2.add(grupo2);
        ivs.add(iv);
        sexos_int.add(sexo_int);
        sexos.add(sexo);

        return 1;
    }

    public static int remove(String nome, int checagem) {
        checagem = 0;
        int tamanho_lista = nomes.size();
        String nome_busca = "";
        /*
         * A variavel checagem sera utilizada para ser o meio de busca nos arryas, e do
         * mesmo jeito temos o tamanho da lista para ser um limite quando começar a
         * buscar o nome do pokemon, e por ultimo temos a variavel, nome_busca que é uma
         * strig vazia que irá receber o nome do array nomes de acordo com o index e
         * checagem
         * 
         * Dentro do while, o index dos nomes será visto um por um até identificar um
         * nome igual, e caso tenha, vai quebrar o looping de busca e irá realizar
         * normalmente a deletagem do pokemon dentro do crud.
         * 
         * Alem disso, caso a busca não de nenhum resultado, vai retornar o valor 2 que
         * sera usado para identificar que não foi possivel realizar a função
         */

        while (checagem < tamanho_lista) {
            nome_busca = nomes.get(checagem);
            if (nome == nome_busca) {
                break;
            }
            checagem = +1;
            if (checagem == tamanho_lista & nome != nome_busca) {
                checagem = +1;
                return -2;
            }
        }
        nomes.remove(checagem);
        grupos1.remove(checagem);
        grupos2.remove(checagem);
        grupos1_int.remove(checagem);
        grupos2_int.remove(checagem);
        ivs.remove(checagem);
        sexos.remove(checagem);
        sexos_int.remove(checagem);
        return 1;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int escolha_sexo, teste;
        int escolha_ivs;
        String escolha_nome;
        int escolha_grupo1;
        int escolha_grupo2;
        String nome_match1;
        String nome_match2;
        String escolha_excluir;
        int tipo_busca;
        int escolha;
        while (true) {
            System.out.println("escolha operaçao");
            System.out.println("1-adicionar pokemon");
            System.out.println("2-remover");
            System.out.println("3- Buscar");
            escolha = input.nextInt();

            if (escolha == 1) {
                System.out.println("Adicionar o nome do pokemon");
                escolha_nome = input.next();


                /*
                 É necessário Adicionar um while na decisão das respostar para sempre perguntar e repetir a pergunta enquanto a resposta não for valida  
                */
                System.out.println("Lista dos grupos");
                System.out.println(" 1- Amorphous");
                System.out.println(" 2- Bug");
                System.out.println(" 3- Dragon");
                System.out.println(" 4- Fairy");
                System.out.println(" 5- Field");
                System.out.println(" 6- Flying");
                System.out.println(" 7- Grass");
                System.out.println(" 8- Human-like");
                System.out.println(" 9- Mineral");
                System.out.println(" 10- Monster");
                System.out.println(" 11- Water 1");
                System.out.println(" 12- Water 2");
                System.out.println(" 13- Water 3");
                System.out.println("Escolha um dos grupos listados");
                escolha_grupo1 = input.nextInt();

                System.out.println("Lista do grupo 2");
                System.out.println(" 0- sem grupo 2");
                System.out.println(" 1- Amorphous");
                System.out.println(" 2- Bug");
                System.out.println(" 3- Dragon");
                System.out.println(" 4- Fairy");
                System.out.println(" 5- Field");
                System.out.println(" 6- Flying");
                System.out.println(" 7- Grass");
                System.out.println(" 8- Human-like");
                System.out.println(" 9- Mineral");
                System.out.println(" 10- Monster");
                System.out.println(" 11- Water 1");
                System.out.println(" 12- Water 2");
                System.out.println(" 13- Water 3");
                System.out.println("Escolha um dos grupos listados");
                escolha_grupo2 = input.nextInt();

                System.out.println("Qual sexo masculino(1) feminino (2)");
                escolha_sexo = input.nextInt();

                System.out.println("Quantos ivs perfeitos tem de 0 a 6 ");
                escolha_ivs = input.nextInt();

                teste = create(escolha_nome, escolha_grupo1, escolha_grupo2, escolha_ivs, escolha_sexo);
                if(teste > 0){
                    System.out.println("Pokemon adicionado com sucesso");
                }else {
                    System.out.println("deu erro");
                }
            }
            if (escolha == 2) {
                System.out.println("qual o nome do pokemon quer excluir");
                escolha_excluir = input.next();
            }

            if (escolha == 3) {
                System.out.println("escolha o tipo de busca");
                System.out.println("1- buscar por nome");
                System.out.println("2- buscar por grupo");

                tipo_busca = input.nextInt();
                if (tipo_busca == 1){
                    System.out.println("Digite o nome do pokemon: ");
                    String escolha_buscanome = input.next();
                    int nome_busca = read_nome(escolha_buscanome);
                    if (nome_busca >= 0){
                        System.out.println(nomes.get(nome_busca));
                        System.out.println(grupos1.get(nome_busca));
                        System.out.println(grupos2.get(nome_busca));
                        System.out.println(ivs.get(nome_busca));
                        System.out.println(sexos.get(nome_busca));
                    }

                }

                if (tipo_busca == 2) {
                    System.out.println(" 1- Amorphous");
                    System.out.println(" 2- Bug");
                    System.out.println(" 3- Dragon");
                    System.out.println(" 4- Fairy");
                    System.out.println(" 5- Field");
                    System.out.println(" 6- Flying");
                    System.out.println(" 7- Grass");
                    System.out.println(" 8- Human-like");
                    System.out.println(" 9- Mineral");
                    System.out.println(" 10- Monster");
                    System.out.println(" 11- Water 1");
                    System.out.println(" 12- Water 2");
                    System.out.println(" 13- Water 3");
                    System.out.println("Escolha um dos grupos listados");
                    
                    int escolha_buscagrupo = input.nextInt();
                    int busca_grupo = read_grupo(escolha_buscagrupo);
                    if (busca_grupo > 0){
                        int contagem = 0;
                        int tamanho_lista = pesquisa.size();
                        while(contagem < tamanho_lista){
                            System.out.println("Lista dos grupos");
                            int pesquisa_index = pesquisa.get(contagem);
                            System.out.println(nomes.get(pesquisa_index));
                            System.out.println(grupos1.get(pesquisa_index));
                            System.out.println(grupos2.get(pesquisa_index));
                            System.out.println(ivs.get(pesquisa_index));
                            System.out.println(sexos.get(pesquisa_index));
                            contagem+=1;
                        }
                        pesquisa.clear();
                    }

                    
                }
            }

            if (escolha == 4) {
                System.out.println("Escolha dois pokemons para testar o match");
                System.out.println("Digite o nome do primeiro pokemon");
                nome_match1 = input.next();

                System.out.println("Digite o nome do segundo pokemon");
                nome_match2 = input.next();

            }
            if (escolha == 5) {
            }

            if (escolha == 6) {
                break;
            }
        }
    }

}