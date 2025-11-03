import java.util.ArrayList;
import java.util.List;

public class CardapioSemanal {
    private List<Menu> menus;

    public CardapioSemanal() {
        this.menus = new ArrayList<>();
    }

    // Adiciona um menu (um dia e turno)
    public void adicionarMenu(Menu menu) {
        menus.add(menu);
    }

    // Exibe o cardápio completo
    public void exibirCardapio() {
        System.out.println("=== 🍽️ CARDÁPIO SEMANAL DO RU ===");
        for (Menu menu : menus) {
            System.out.println(menu);
        }
    }
}
