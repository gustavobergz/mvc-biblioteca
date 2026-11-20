package com.gustavo.bibliotecamvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gustavo.bibliotecamvc.model.Categoria;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    @GetMapping
    public String inicio() {
        return "categorias/inicio";
    }

    @GetMapping("/categoria")
    public String exibirLivro(Model model) {
        Categoria categoria = new Categoria();
        categoria.setGenero("Roadside Picnic");

        model.addAttribute("categoria", categoria);

        return "categoria";
    }
}
