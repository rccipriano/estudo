package br.com.estudos.adapter.in;

import br.com.estudos.adapter.in.dto.ItemRequest;
import br.com.estudos.adapter.in.dto.ItemResponse;
import br.com.estudos.usecase.AddItemUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AddItemController {
    private final AddItemUseCase addItemUseCase;

    @PostMapping("/item")
    @ResponseStatus(HttpStatus.CREATED)
    public ItemResponse add(@RequestBody ItemRequest itemRequest){

        return addItemUseCase.add(itemRequest);
    }

}
