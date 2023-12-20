package br.com.vitoralberto.desafiotodolist.repository;

import br.com.vitoralberto.desafiotodolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
