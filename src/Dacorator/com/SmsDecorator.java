package Dacorator.com;

public class SmsDecorator extends NotificadorDacorator{
    Notificador notificador;

    public SmsDecorator(Notificador notificador){
        this.notificador = notificador;
    }
    public void enviar(String mensagem){
        notificador.enviar(mensagem);
        System.out.println("Enviando SMS: " + mensagem);
    }
}
