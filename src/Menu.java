public class Menu {
    private String diaSemana;
    private String turno; // pode ser "Almoço" ou "Jantar"
    private Refeicao refeicao;

    public Menu(String diaSemana, String turno, Refeicao refeicao) {
        this.diaSemana = diaSemana;
        this.turno = turno;
        this.refeicao = refeicao;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public String getTurno() {
        return turno;
    }

    public Refeicao getRefeicao() {
        return refeicao;
    }

    @Override
    public String toString() {
        return diaSemana + " (" + turno + "): " + refeicao;
    }
}
