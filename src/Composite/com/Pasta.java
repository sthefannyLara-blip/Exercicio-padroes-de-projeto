package Composite.com;

import java.util.List;

public class Pasta implements ComponenteFileSystem{
    List<ComponenteFileSystem> listaComponentes;
    @Override
    public void exibir() {
        for (ComponenteFileSystem componente : listaComponentes) {
            componente.exibir();
        }

    }

    @Override
    public int getTamanhoKB() {
        int soma = 0;
        for (ComponenteFileSystem componente : listaComponentes) {
            soma += componente.getTamanhoKB();
        }
            return soma;
    }

    public void adicionarComponente(ComponenteFileSystem componente) {
        listaComponentes.add(componente);
    }
}
