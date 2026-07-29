package Dacorator.com;

public class NotificadorDacorator implements Notificador{
    Notificador notificador;



    @Override
    public void enviar(String mensagem) {
        notificador.enviar(mensagem);
    }
}
