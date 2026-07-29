package Dacorator.sem;
public class Main {
    public static void main(String[] args) {
        String msg = "Seu código de verificação é 1234";

        System.out.println("--- Envio Completo ---");
        Notificador notificador = new NotificadorCompleto();
        notificador.enviar(msg);
    }
}
