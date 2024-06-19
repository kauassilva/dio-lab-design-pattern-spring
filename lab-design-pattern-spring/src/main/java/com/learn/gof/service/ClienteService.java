package com.learn.gof.service;

import com.learn.gof.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter múltiplas implementações dessa mesma
 * interface.
 *
 * @author falvojr
 */
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscaPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
