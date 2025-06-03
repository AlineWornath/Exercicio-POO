import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.UUID;

public class BalcaoAtendimento implements Relatorio{
    private String id;
    private Atendente atendente;
    private String nomeAtendente;
    private String nomeLoja;;

    public BalcaoAtendimento(Atendente atendente, String nomeLoja) {
        this.id = UUID.randomUUID().toString();
        this.atendente = atendente;
        this.nomeAtendente = atendente.getNome();
        this.nomeLoja = nomeLoja;
    }

    public Chamado gerarChamado(String nomeCliente, Atendente atendente, String nomeProduto) {
        Chamado chamado = new Chamado(nomeCliente, atendente, nomeProduto);
        atendimentos.put(chamado, LocalDateTime.now());
        return chamado;

    }


    public String gerarRelatorio() {
        StringBuilder datasHorasAtendimentos = new StringBuilder();
        for (LocalDateTime dataHora : atendimentos.values()) {
            datasHorasAtendimentos.append(dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
            datasHorasAtendimentos.append("\n");}

        String relatorio = "Atendente: " + nomeAtendente + "\nLoja: " + nomeLoja + "\nQuantidade de atendimentos: " + atendimentos.size() + "\nData atendimentos: " + datasHorasAtendimentos + "\n";
        return relatorio;
        }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    HashMap <Chamado, LocalDateTime> atendimentos = new HashMap();

    public HashMap<Chamado, LocalDateTime> getAtendimentos() {
        return atendimentos;
    }
}
