package Dacorator.sem;
class NotificadorCompleto extends Notificador {
    @Override
    public void enviar(String mensagem) {
        super.enviar(mensagem); // Envia E-mail
        System.out.println("Enviando SMS: " + mensagem);
        System.out.println("Enviando WhatsApp: " + mensagem);
    }
}
