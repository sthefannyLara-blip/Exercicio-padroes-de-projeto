package Dacorator.sem;
class NotificadorEmailEWhatsApp extends Notificador {
    @Override
    public void enviar(String mensagem) {
        super.enviar(mensagem); // Envia E-mail
        System.out.println("Enviando WhatsApp: " + mensagem);
    }
}