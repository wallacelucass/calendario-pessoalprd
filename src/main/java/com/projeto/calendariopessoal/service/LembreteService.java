package com.projeto.calendariopessoal.service;

import com.projeto.calendariopessoal.model.Lembrete;
import com.projeto.calendariopessoal.repository.LembreteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LembreteService {

    @Autowired
    private LembreteRepository lembreteRepository;

    public List<Lembrete> findAll() {
        return lembreteRepository.findAll();
    }

    public Optional<Lembrete> findById(Long id) {
        return lembreteRepository.findById(id);
    }

    public Lembrete save(Lembrete lembrete) {
        return lembreteRepository.save(lembrete);
    }

    public void deleteById(Long id) {
        lembreteRepository.deleteById(id);
    }
}
