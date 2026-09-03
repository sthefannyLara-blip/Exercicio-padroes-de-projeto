package Singleton.com;
class Configuracao {
    // Guarda a única instância estática
    private static Configuracao instancia;
    private String tema = "Escuro";

    // Construtor PRIVADO: impede o uso de "new Configuracao()" fora desta classe
    private Configuracao() {}

    // Ponto global de acesso
    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}