import java.util.Random;
import java.util.UUID;

public class Atendente {
    private String id;
    private String nomeUsuario;
    private String numeroMatricula;

    public Atendente(String nomeUsuario) {
        this.id = UUID.randomUUID().toString();
        this.nomeUsuario = nomeUsuario;
        this.numeroMatricula = gerarMatricula();
    }

    private String gerarMatricula(){
        Random aleatorio = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            stringBuilder.append(aleatorio.nextInt(10));
        }
        String stringNumeros = stringBuilder.toString();

        this.numeroMatricula = "BR" + stringNumeros;
        return numeroMatricula;
    }

    public String getNome(){
        return this.nomeUsuario;
    }
}
