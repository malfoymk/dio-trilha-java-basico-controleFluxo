import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite o valor do primeiro parametro: ");
            int primeiroParametro = sc.nextInt();

            System.out.print("Digite o valor do segundo parametro: ");
            int segundoParametro = sc.nextInt();

            try {
                contar(primeiroParametro, segundoParametro);
            } catch (parametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }
        }

        static void contar(int primeiroParametro, int segundoParametro) throws parametrosInvalidosException {
            if (primeiroParametro >= segundoParametro) {
                throw new parametrosInvalidosException("O valor do primeiro parametro deve ser menor que o valor do segundo parametro");
            }
            int contagem = segundoParametro - primeiroParametro;
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprima o número: " + i);
            }
        }
    }

    class parametrosInvalidosException extends Exception {
        public parametrosInvalidosException(String message) {
            super(message);
        }
    }