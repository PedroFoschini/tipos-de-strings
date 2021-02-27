public class Main{
    public static void main(String[] args){

        String palavra = "Peppa Pig";

        //Utilizado para saber se a String "palavra" é igual a "Bob Esponja". resposta(false)
        boolean resposta = palavra.equals("Bob Esponja");

        //Utilizado para saber se a String "palavra" é diferente de "Peppa Pig". reposta(true)
        boolean diferente = !palavra.equals("Bob Esponja");

        //Demonstração de sensitive case, a palavra é a mesma, mas o resultado é "false" pois a frase está em minúsculo(Lower Case)
        boolean resposta = palavra.equals("peppa pig");

        //Demonstração para ignorar as letras maiúsculas(Upper Case) da String "palavra" e retornar "true"
        //boolean resposta = palavra.equalsIgnoreCase("peppa pig");

        System.out.println(resposta);
        System.out.println(diferente);

        //Utilizado para contar a quantidade de caracteres em uma palavra ou frase OBS: Conta desde caracteres até os espaços.
        int qtd = palavra.length();

        System.out.println(qtd);

        //Transformar todas as letras de uma palavra, frase ou texto em minúsculo (Lower Case)
        String minusculo = palavra.toLowerCase();
        //Transfromar todas as letras de uma palavra, frase ou texto em maiúsculo (Upper Case)
        String maiusculo = palavra.toUpperCase();

        System.out.println(minusculo);
        System.out.println(maiusculo);

        //Utilizado para pegar uma posição fixa exemplo: "P(0) e(1) p (2)p (3) a(4) Pig", no caso a letra "a" será retornada
        char posicao = palavra.charAt(4);

        System.out.println(posicao);

        //Utilizado para comparar as palavras em ordem alfabética OBS: Sempre a primeira letra diferente da variável String que for "comparada" e se for pela mesma variável o resultado será 0
        int ordem = palavra.compareTo("Pappa Pig");

        /* 
        ordem = "Anderson".compareTo("Milena");

        o resultado será -12 pois a letra "A" de Anderson está à 12 letras antes do M
        então o número vem negativo

        caso fosse: ordem = "Victor".compareTo("Milena");

        o resultado seria 9, pois a letra "M" de Milena está à 9 letras antes do "V" de Victor
        e então o número será positivo pois a letra "V" vem depois da letra "M"  
        */

        System.out.println(ordem);

        //Utilizado para concatenar palavras OBS: Normalmente utilizado para fazer o envio da mesma mensagens para diferentes pessoas
        String frase = palavra.concat(" é rosa, mas o Patrick é mais rosa que ela");

        System.out.println(frase);

        //Utilizado para validar letras ou palavras contida em um texto. OBS: Aqui ele está verificando se contém as letras "ig" dentro da variável "palavra" que tem "Peppa Pig" como informação inserida
        boolean validador = palavra.contains("ig");

        System.out.println(validador);

        //Utilizado para identificar em qual posição a letra sugerida está (em número), começando pela primeira letra da palavra OBS: A contagem começa em 0, ou seja "P(0) e(1) p(2) p(3)a Pig"
        int pos = palavra.indexOf("pa");

        System.out.println(pos);

        //Utilizado para identificar a última letra da palavra ou frase OBS: Tem diferenças entre maiúsculas e minúsculas OBS: "P(1) e(2) p(3) p(4) a(5) P(6) i g"
        int lastPos = palavra.lastIndexOf("P");

        System.out.println(lastPos);

        /*Utilizado para identificar se há algum caracter, palavra ou frase em uma String retornando true ou false
        caso a String fosse palavra = ""; o resultado seria true */
        boolean vazio = palavra.isEmpty();

        System.out.println(vazio);

        /*Utilizado para alterar todos os caracteres por outro caracter escolhido
        caso queira mudar todos os "P" de "Peppa Pig" para "bebba big" era só digitar
        String troca = palavra.toLowerCase().replace('p', 'b') */
        String troca = palavra.replace('p', 'b');

        System.out.println(troca);

        /*Caso queira retirar os "caracteres" de uma String, também pode utilizar o replace
        por exemplo em um CPF: 789.123.456-00 */

        String cpf = "789.123.456-00";

        cpf = cpf.replace(".", "").replace("-", "");

        System.out.println(cpf);

        //Utilizado para localizar expressões regulares com padrões, exemplo: CEP, Telefone, CPF
        //palavra.replaceFirst("p", "x");

        //Utilizado para quebrar textos de cada coluna. OBS: Depois de cada célula seria como se fosse uma célula/coluna
        String celulas = "123;Lala;Rua das Flores, 200;";

        String[] vetorStr = celulas.split(";");

        System.out.println(vetorStr[0]);
        System.out.println(vetorStr[1]);
        System.out.println(vetorStr[2]);
        
       /* for(int i = 0; i < 3; i++){
            System.out.println(vetorStr[i]);
        } */

        //Utilizado para recortar pedaços de um texto, frase ou palavra
        String nomeArquivo = "Imposto_123.txt";

        //Recorte de partes fixas
        String parteInicial = nomeArquivo.substring(0, 8);
        String parteFinal = nomeArquivo.substring(12);

        System.out.println(parteInicial);
        System.out.println(parteFinal);

        //Caso queira pegar as 3 últimas letras para descobrir os tipos de extensões pode ser feito
        String extensao = nomeArquivo.substring(nomeArquivo.length()-3);

        System.out.println(extensao);

        //Utilizado para transformar uma palavra em caracteres
        char[] vetor = palavra.toCharArray();

        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
        System.out.println(vetor[3]);
        System.out.println(vetor[4]);

        /* for(int i = 0; i < 5; i++){
            System.out.println(vetor[i]);
        } */
        
        //Utilizado para retirar espaços que estão fora das frases
        String espaco = "        Socorram-me, subi no ônibus em Marrocos       ";
        String semEspacos = espaco.trim();

        System.out.println(semEspacos);

        //Utilizado para saber com o que a frase, palavra ou texto começa retornando true ou false (Não funciona com case sensitive)
        boolean comecaCom = palavra.startsWith("Pe");

        /* Caso queira fazer com case para ler a informação certa independentemente se estiver maiúscula ou não, só utilizar
        boolean comecaCom = palavra.toUpperCase().startWith("PE");           ou
        boolean comecaCom = palavra.toLowerCase().startWith("pe"); */
        System.out.println(comecaCom);

        //Utilizado para alterar o tipo da variável para String. A palavra sendo de boolean true se transforma em "true"
        String valor = palavra.valueOf(true);

        System.out.println(valor);
    }
}
