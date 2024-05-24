package com.example.demo.Service;

import com.example.demo.Model.Mensagem;
import com.example.demo.Repository.MensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class MensagemService {

    @Autowired
    private MensagemRepository mensagemRepository;


    public List<Mensagem> listarUsuariosPorIdCrescente() {
        List<Mensagem> mensagens = mensagemRepository.findAll();
        mensagens.sort(Comparator.comparingLong(Mensagem::getId)); // Ordena por ID crescente
        return mensagens;
    }

    /*
    explicação do metodo de listarUsuarioPorIdCrescente
    primeiro ele vai fazer o findAll né, de todos os usuarios da lista
    depois, usuarios.sort vai ordenar a lista de usuarios usando um comparador (Comparator.comparingLong(Usuario::getId)
    o que significa que a lista sera ordenada com base no ID de cada usuario, de forma crescente
    a ordem crescente é o padrao quando usando o comparinglong, se fosse ordem decrescente eu poderia colocar
    Comparator.comparingLong(Usuario::getId).reversed(), o que iria reverter a lista, fazendo com que fosse ordem desc.
     */
    public Mensagem criarMensagem(Mensagem mensagem) {
        return mensagemRepository.save(mensagem
        );
    }

}
