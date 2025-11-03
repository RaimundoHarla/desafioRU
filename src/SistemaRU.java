import java.util.Scanner;

public class SistemaRU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CardapioSemanal cardapio = new CardapioSemanal();

        System.out.println("=== 🍽️ Sistema do RU - Cadastro de Cardápio ===");

        boolean continuar = true;
        while (continuar) {
            System.out.print("\nDigite o dia da semana:");
            String dia = sc.nextLine();

            System.out.print("Digite o turno (Almoço ou Jantar):");
            String turno = sc.nextLine();

            // Cadastrar os alimentos da refeição
            System.out.print("Informe o nome da salada:");
            Alimento salada = new Alimento(sc.nextLine());

            System.out.print("Informe o prato principal:");
            Alimento prato = new Alimento(sc.nextLine());

            System.out.print("Informe o acompanhamento:");
            Alimento acomp = new Alimento(sc.nextLine());

            // Criar refeição e menu
            Refeicao refeicao = new Refeicao(salada, prato, acomp);
            Menu menu = new Menu(dia, turno, refeicao);

            // Adicionar ao cardápio
            cardapio.adicionarMenu(menu);

            System.out.println("\n✅ Menu adicionado com sucesso!");

            // Perguntar se deseja continuar
            System.out.print("\nDeseja cadastrar outro menu? (s/n)");
            String resposta = sc.nextLine();

            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        System.out.println("\n--- CARDÁPIO FINAL ---");
        cardapio.exibirCardapio();

        sc.close();
    }
}
