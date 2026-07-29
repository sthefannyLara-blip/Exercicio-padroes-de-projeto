package Dacorator.sem;

// 2. Quer apenas SMS além do E-mail
class NotificadorEmailESms extends Notificador {
    @Override
    public void enviar(String mensagem) {
        super.enviar(mensagem); // Envia E-mail
        System.out.println("Enviando SMS: " + mensagem);
    }
}