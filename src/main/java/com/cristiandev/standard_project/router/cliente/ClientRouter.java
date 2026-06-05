package com.cristiandev.standard_project.router.cliente;

import com.cristiandev.standard_project.dto.ClientDTO;
import com.cristiandev.standard_project.exception.StandardProjectException;
import com.cristiandev.standard_project.router.cliente.base.ClientRouterBase;
import com.cristiandev.standard_project.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ClientRouter extends ClientRouterBase {

    private final ClientService clientService;

    @PostMapping(SAVE)
    public ResponseEntity<ClientDTO> save(@RequestBody ClientDTO cliente) throws StandardProjectException {
        return ResponseEntity.ok(clientService.save(cliente));
    }
}
