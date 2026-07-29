package Dacorator.com;

public class Main {
    public static void main (String[] args){

        // Notificador base (apenas e-mail)
        Notificador notificador = new NotificadorEmail();

// Embala com SMS
        notificador = new SmsDecorator(notificador);

// Embala também com WhatsApp!
        notificador = new WhatsAppDecorator(notificador);

// Dispara tudo em cadeia!
        notificador.enviar("Sua senha expira em breve!");
    }
}
