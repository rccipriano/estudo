package br.com.estudos.adapter.in;

import br.com.estudos.adapter.in.dto.OrcamentoRequest;
import br.com.estudos.adapter.in.dto.OrcamentoResponse;
import br.com.estudos.domain.Orcamento;
import br.com.estudos.usecase.CalculadorDeImposto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AddOrcamentoController {

    @Autowired
    private CalculadorDeImposto calculadorDeImposto;

    @PostMapping("/geraorcamento")
    @ResponseStatus(HttpStatus.CREATED)
    public OrcamentoResponse add(@RequestBody OrcamentoRequest orcamentoRequest){

        return calculadorDeImposto.realizaCalculo(orcamentoRequest);

    }

}
