package br.com.blueacademy.bluebank.factories;


import br.com.blueacademy.bluebank.dtos.ContaDTO;
import br.com.blueacademy.bluebank.entities.Conta;
import br.com.blueacademy.bluebank.forms.ContaForm;

public class ContaFactory {

    public static Conta create(ContaForm contaForm) {
        return new Conta(
                contaForm.agencia,
                contaForm.numeroDaConta,
                contaForm.idClient,
                contaForm.saldo
        );
    }

    public static ContaDTO create(Conta conta) {
        return new ContaDTO()
                .builder()
                .id(conta.getId())
                .agencia(conta.getAgencia())
                .numeroDaConta(conta.getNumeroDaConta())
                .idClient(conta.getIdClient())
                .saldo(conta.getSaldo())
                .build();
    }

}
