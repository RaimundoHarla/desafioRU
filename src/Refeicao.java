public class Refeicao {
    private Alimento salada;
    private Alimento pratoPrincipal;
    private Alimento acompanhamento;

    public Refeicao(Alimento salada, Alimento pratoPrincipal, Alimento acompanhamento) {
        this.salada = salada;
        this.pratoPrincipal = pratoPrincipal;
        this.acompanhamento = acompanhamento;
    }

    public Alimento getSalada() {
        return salada;
    }

    public Alimento getPratoPrincipal() {
        return pratoPrincipal;
    }

    public Alimento getAcompanhamento() {
        return acompanhamento;
    }

    @Override
    public String toString() {
        return "Salada: " + salada + ", Prato Principal: " + pratoPrincipal + ", Acompanhamento: " + acompanhamento;
    }
}
