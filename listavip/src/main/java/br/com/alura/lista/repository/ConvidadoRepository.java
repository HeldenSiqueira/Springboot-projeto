package br.com.alura.lista.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.lista.model.Convidado;

public interface ConvidadoRepository extends CrudRepository<Convidado, Long>{

}
