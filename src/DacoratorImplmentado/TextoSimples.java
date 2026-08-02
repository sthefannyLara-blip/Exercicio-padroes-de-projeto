package DacoratorImplmentado;

public class TextoSimples implements Texto {
    private String conteudo;

    public TextoSimples(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String getConteudo() {
        return conteudo;
    }
}
