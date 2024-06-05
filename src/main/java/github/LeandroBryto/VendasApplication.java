package github.LeandroBryto;


import github.LeandroBryto.domain.entity.Cliente;
import github.LeandroBryto.domain.repositorio.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes){
        return args -> {
            Cliente cliente = new Cliente();
            cliente.setNome("Dougles");
            clientes.salvar(cliente);
        };
    }

    public static void main(String[] args)
    {
        SpringApplication.run(VendasApplication.class,args);
    }
}
