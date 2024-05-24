package com.example.demo.Controller;

import com.example.demo.Model.Mensagem;
import com.example.demo.Service.MensagemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mensagem")
public class MensagemController {

    @Autowired
    private MensagemService mensagemService;

    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity<List<Mensagem>> listaUsuarios() {
        return ResponseEntity.status(200).body(mensagemService.listarUsuariosPorIdCrescente());
    }

    //CRIA UM USUARIO NOVO
    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<Mensagem> criarUsuario(@Valid @RequestBody Mensagem mensagem) {
        return ResponseEntity.status(201).body(mensagemService.criarMensagem(mensagem));
    }
}
