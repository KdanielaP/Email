public class Main {
    public static void main(String[] args) {
        // correo electrónico usando el Builder
        Email email = new Email.Builder()
                .agregarDestinatario("javier.perez@empresa.com")
                .agregarDestinatario("maria.lopez@empresa.com")
                .agregarDestinatario("juan.garcia@empresa.com")
                .setAsunto("Reunión Programada")
                .setCuerpo("Estimados:\n\nNos gustaría recordarles que la reunión está programada para el próximo lunes a las 10:00 AM en la sala de conferencias.\n\nSaludos,\nEl equipo de dirección.")
                .agregarAdjunto("agenda_reunion.pdf")
                .agregarAdjunto("presentacion_reunion.pptx")
                .build();

        // Mostrar información del correo
        System.out.println("Destinatarios: " + email.getDestinatarios());
        System.out.println("Asunto: " + email.getAsunto());
        System.out.println("Cuerpo: " + email.getCuerpo());
        System.out.println("Adjuntos: " + email.getAdjuntos());
    }
}