package DacoratorImplmentado;

public class TextonegritoDacorator extends TextoSimples{
    public TextonegritoDacorator(String conteudo) {
        super(conteudo);
    }
    @Override
    public String getConteudo() {
        return "<b>" + super.getConteudo() + "</b>";
    }
}
