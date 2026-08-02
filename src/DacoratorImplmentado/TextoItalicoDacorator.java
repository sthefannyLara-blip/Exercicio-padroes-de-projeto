package DacoratorImplmentado;

public class TextoItalicoDacorator extends TextoSimples{
    public TextoItalicoDacorator(String conteudo) {
        super(conteudo);
    }
    @Override
    public String getConteudo() {
        return "<i>" + super.getConteudo() + "</i>";
    }
}
