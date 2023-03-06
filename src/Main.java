public class Main {
    public static void main(String[] args) {
        // Teste da função isPalindrome
        String palavra1 = "Evoluservices";
        String palavra2 = "Ana";
        String palavra3 = "ovo";
        System.out.println(palavra1 + " é um palíndromo? " + isPalindrome(palavra1)); // true
        System.out.println(palavra2 + " é um palíndromo? " + isPalindrome(palavra2)); // true
        System.out.println(palavra3 + " é um palíndromo? " + isPalindrome(palavra3)); // false

        // Impressão dos números de 1 a 100 com as regras de Tico Teco
        ticoTeco();
    }

    //A função 'isPalindrome' recebe uma string 's' como entrada e retorna 'true' se 's' é um palíndromo e 'false' caso
    // contrário.A primeira linha do código transforma todos os caracteres em minúsculas para que letras maiúsculas e
    // minúsculas sejam tratadas como iguais.
    // A lógica para verificar se a string é um palíndromo é simples: utilizamos dois índices 'i' e 'j' que percorrem
    // a string de ambos os lados, comparando os caracteres em cada posição. Se encontrarmos dois caracteres diferentes,
    // sabemos que a string não é um palíndromo e podemos retornar 'false'. Se percorrermos toda a string sem encontrar
    // caracteres diferentes, sabemos que a string é um palíndromo e podemos retornar 'true'.
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetter(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetter(s.charAt(right))) {
                right--;
            }
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    //O código utiliza um loop for para iterar de 1 a 100. Em cada iteração, verifica se o número é um múltiplo de três
    // e/ou cinco usando o operador %. Se for um múltiplo de ambos, imprime 'TicoTeco'. Caso contrário, verifica se é um
    // múltiplo de três e imprime 'Tico', ou se é um múltiplo de cinco e imprime 'Teco'. Se não for um múltiplo de
    // nenhum dos dois, imprime o número normalmente. O método System.out.print é utilizado para imprimir o resultado
    // na saída padrão. Note que o código imprime uma vírgula e um espaço após cada número ou palavra para separá-los.
    public static void ticoTeco() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("TicoTeco");
            } else if (i % 3 == 0) {
                System.out.print("Tico");
            } else if (i % 5 == 0) {
                System.out.print("Teco");
            } else {
                System.out.print(i);
            }
            if (i < 100) {
                System.out.print(", ");
            }
        }
    }


}
