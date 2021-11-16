package br.com.estudos.usecase.impostos;

import br.com.estudos.domain.Orcamento;
import br.com.estudos.usecase.impostos.Imposto;

public class Iss implements Imposto {

    @Override
    public double calcula(Orcamento orcamento){
        return orcamento.getValor() * 0.6;
    }
}
