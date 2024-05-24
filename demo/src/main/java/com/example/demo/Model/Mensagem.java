package com.example.demo.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.bytecode.enhance.spi.EnhancementInfo;

@Entity
@Table(name = "mensagem")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class Mensagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mensagem")
    private long id;

    @Column(name = "nome_pessoa")
    private String nomePessoa;

    @Column(name = "email_pessoa")
    private String emailPessoa;

    @NotBlank(message = "preencha a mensagem")
    @Column(name = "corpo_mensagem")
    private String corpoMensagem;


}
