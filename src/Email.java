import java.util.ArrayList;
import java.util.List;

public class Email {
    private List<String> destinatarios; // Lista de destinatarios
    private String asunto; // Asunto del correo
    private String cuerpo; // Cuerpo del correo
    private List<String> adjuntos; // Lista de archivos adjuntos

    private Email(Builder builder) {
        this.destinatarios = builder.destinatarios;
        this.asunto = builder.asunto;
        this.cuerpo = builder.cuerpo;
        this.adjuntos = builder.adjuntos;
    }

    // Métodos Getters
    public List<String> getDestinatarios() {
        return destinatarios;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public List<String> getAdjuntos() {
        return adjuntos;
    }

    // Clase Builder
    public static class Builder {
        private List<String> destinatarios = new ArrayList<>();
        private String asunto;
        private String cuerpo;
        private List<String> adjuntos = new ArrayList<>();

        public Builder agregarDestinatario(String destinatario) {
            this.destinatarios.add(destinatario);
            return this;
        }

        public Builder setAsunto(String asunto) {
            this.asunto = asunto;
            return this;
        }

        public Builder setCuerpo(String cuerpo) {
            this.cuerpo = cuerpo;
            return this;
        }

        public Builder agregarAdjunto(String adjunto) {
            this.adjuntos.add(adjunto);
            return this;
        }

        public Email build() {
            if (destinatarios.isEmpty()) {
                throw new IllegalArgumentException("Debe haber al menos un destinatario.");
            }
            return new Email(this);
        }
    }
}