import Enums.EstadoChamado;

public class Chamado implements Relatorio{
    private String nomeCliente;
    private Atendente atendente;
    private String nomeAtendente;
    private String nomeProduto;
    private EstadoChamado estadoChamado;


    public Chamado(String nomeCliente, Atendente atendente, String nomeProduto) {
        this.nomeCliente = nomeCliente;
        this.nomeAtendente = atendente.getNome();
        this.nomeProduto = nomeProduto;
        this.estadoChamado = EstadoChamado.ABERTO;

    }
    public String gerarRelatorio(){
        String relatorio = "Produto: " + nomeProduto + "\nEstado do chamado: " + estadoChamado;
        return relatorio;
    }
}
