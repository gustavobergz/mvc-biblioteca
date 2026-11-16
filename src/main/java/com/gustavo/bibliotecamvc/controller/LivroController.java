package com.gustavo.bibliotecamvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gustavo.bibliotecamvc.model.Livro;


@Controller
@RequestMapping("/livros")
public class LivroController {

    @GetMapping
    public String inicio() {
        return "livros/inicio";
    }

    @GetMapping("/livro")
    public String exibirLivro(Model model) {

        Livro livro = new Livro();
        livro.setId(1);
        livro.setTitulo("O Senhor dos Anéis");
        livro.setAutor("J.R.R. Tolkien");
        livro.setIsbn("978-0261102385");
        model.addAttribute("livro", livro);
        return "livro";
    }
    
}
