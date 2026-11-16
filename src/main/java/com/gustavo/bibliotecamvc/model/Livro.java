package com.gustavo.bibliotecamvc.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 

public class Livro {
    private long id;
    private String titulo;
    private String autor;
    private String isbn;
}
