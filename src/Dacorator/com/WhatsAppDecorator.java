package Dacorator.com;

public class WhatsAppDecorator extends NotificadorDacorator{
    Notificador notificador;

    public WhatsAppDecorator(Notificador notificador){
        this.notificador = notificador;
    }
    public void enviar(String mensagem){
        notificador.enviar(mensagem);
        System.out.println("Enviando WhatsApp: " + mensagem);
    }
}
