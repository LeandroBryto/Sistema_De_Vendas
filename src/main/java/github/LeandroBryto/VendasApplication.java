package github.LeandroBryto;



import java.util.List;
import github.LeandroBryto.domain.entity.Cliente;
import github.LeandroBryto.domain.repositorio.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

import javax.swing.*;
@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes){
        return args -> {
            System.out.println("salvando clientes");
            clientes.salvar(new Cliente("Dougllas"));
            clientes.salvar(new Cliente("outro Cliente"));

            List<Cliente> todosClientes = clientes.obterTodos();
            todosClientes.forEach(System.out::println);

            System.out.println("atualizando clientes");
            todosClientes.forEach(c -> {
                c.setNome(c.getNome() + "atualizar.");
                clientes.atualizar(c);
            });

            todosClientes = clientes.obterTodos();
            todosClientes.forEach(System.out::println);

            System.out.println("buscando clientes");
             clientes.buscarPorNome("CLI").forEach(System.out::println);

            System.out.println("deletando clientes");
            clientes.obterTodos().forEach(c -> {
                clientes.deletar(c);
            });
            todosClientes = clientes.obterTodos();
            if (todosClientes.isEmpty()) {
                System.out.println("Nenhum cliente encontrado.");
            } else {
                todosClientes.forEach(System.out::println);
            }
        };
    }

    public static void main(String[] args)
    {
        SpringApplication.run(VendasApplication.class,args);
    }
}
