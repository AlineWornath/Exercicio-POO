//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Atendente catia = new Atendente( "Cátia");
        Atendente evandro = new Atendente("Evandro");

        BalcaoAtendimento balcao = new BalcaoAtendimento(catia, "Café do Centro");

        balcao.gerarChamado("José", catia, "Café coado");
        balcao.gerarChamado("Marcos", evandro, "Pão de Queijo");
        balcao.gerarChamado("Adão", catia, "Bolo de cenoura");

        System.out.println(balcao.gerarRelatorio());

        for(Chamado chamado : balcao.getAtendimentos().keySet()) {
        System.out.println("Relatório do chamado: ");
        System.out.println(chamado.gerarRelatorio());
        System.out.println("-----------");
        }
    }
}