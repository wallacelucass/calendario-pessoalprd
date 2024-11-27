package com.projeto.calendariopessoal.controller;

import com.projeto.calendariopessoal.service.LembreteService;
import com.projeto.calendariopessoal.model.Lembrete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/lembretes")
public class LembreteController {

    @Autowired
    private LembreteService lembreteService;

    @GetMapping
    public String getAllLembretes(Model model) {
        List<Lembrete> lembretes = lembreteService.findAll();
        model.addAttribute("lembretes", lembretes);
        return "lembretes";
    }

    @GetMapping("/novo")
    public String novoLembreteForm(Model model) {
        model.addAttribute("lembrete", new Lembrete());
        return "novo_lembrete";
    }

    @PostMapping
    public String salvarLembrete(@ModelAttribute Lembrete lembrete) {
        lembreteService.save(lembrete);
        return "redirect:/lembretes";
    }

    @GetMapping("/editar/{id}")
    public String editarLembreteForm(@PathVariable Long id, Model model) {
        Lembrete lembrete = lembreteService.findById(id).orElseThrow(() -> new IllegalArgumentException("ID inválido:" + id));
        model.addAttribute("lembrete", lembrete);
        return "editar_lembrete";
    }

    @PostMapping("/editar/{id}")
    public String atualizarLembrete(@PathVariable Long id, @ModelAttribute Lembrete lembrete) {
        lembreteService.save(lembrete);
        return "redirect:/lembretes";
    }

    @GetMapping("/deletar/{id}")
    public String deletarLembrete(@PathVariable Long id) {
        lembreteService.deleteById(id);
        return "redirect:/lembretes";
    }
}
