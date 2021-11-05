package br.com.blueacademy.bluebank.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import java.util.UUID;

@Data
@Entity
@Builder
public class Conta extends AbstractEntity {
    private String agencia;
    private String numeroDaConta;
    private UUID idClient;
    private Float saldo;
}