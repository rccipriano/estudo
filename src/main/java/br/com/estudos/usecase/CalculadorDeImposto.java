package br.com.estudos.usecase;


import br.com.estudos.adapter.in.dto.OrcamentoRequest;
import br.com.estudos.adapter.in.dto.OrcamentoResponse;
import br.com.estudos.port.out.ItemRepositoryPortOut;
import br.com.estudos.port.out.OrcamentoItemRepositoryPortOut;
import br.com.estudos.usecase.impostos.Imposto;
import br.com.estudos.domain.Orcamento;
import br.com.estudos.port.out.OrcamentoRepositoryPortOut;
import br.com.estudos.usecase.mapper.OrcamentoRequestToOrcamentoEntityMapper;
import br.com.estudos.usecase.mapper.OrcamentoToOrcamentoResponse;
import lombok.RequiredArgsConstructor;
import org.hibernate.loader.plan.spi.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CalculadorDeImposto {

    private final OrcamentoRepositoryPortOut orcamentoRepositoryPortOut;

    private final OrcamentoRequestToOrcamentoEntityMapper orcamentoRequestToOrcamentoEntityMapper;

    private final OrcamentoToOrcamentoResponse orcamentoToOrcamentoResponse;


    public OrcamentoResponse realizaCalculo(OrcamentoRequest orcamentoRequest){


        Orcamento orcamento = orcamentoRepositoryPortOut.salvar(orcamentoRequestToOrcamentoEntityMapper.toOrcamento(orcamentoRequest));

        return orcamentoToOrcamentoResponse.toOrcamentoResponse(orcamento);
        //orcamentoItemPortOut.salvar(orcamento.getOrcamentoItens());


        //System.out.println("O valor do icms é de: " + imposto.calcula(orcamento));
    }
}

