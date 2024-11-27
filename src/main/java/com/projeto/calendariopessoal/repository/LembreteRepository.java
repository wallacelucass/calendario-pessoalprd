package com.projeto.calendariopessoal.repository;

import com.projeto.calendariopessoal.model.Lembrete;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LembreteRepository extends JpaRepository<Lembrete, Long> {
}
