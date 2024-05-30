package github.LeandroBryto.service;

import github.LeandroBryto.model.Cliente;
import github.LeandroBryto.repository.ClientesRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {
    public  void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        ClientesRepository clientesRepository = new ClientesRepository();
        clientesRepository.persitir(cliente);
    }
    public void validarCliente(Cliente cliente){
        // aplicar validações
    }
}
