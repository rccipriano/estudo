package br.com.estudos.usecase.impostos;

import br.com.estudos.domain.Orcamento;

public class Icms implements Imposto {

    @Override
    public double calcula(Orcamento orcamento){
        return orcamento.getValor() *0.1;
    }

}
