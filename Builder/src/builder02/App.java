/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder02;

import modelo.Paciente;

/**
 *
 * @author Alison Abrantes
 */
public class App {
    
    public static void main(String[] args) {
        
        Paciente paciente = PacienteBuilder.novoPacienteBuilder()
                .comNome("Alison").nascidoEm("19/06/1998")
                .comCPF("476.128.666.666").comRG("25025125-x")
                .doSexo('M')
                .moraEstado("SP").moraCidade("Itaquauqecetuba")
                .moraLogradouro("Rua Solano")
                .temNumero(40).temCep("08584-250")
                .temPeso(70)
                .Sangue("O+")
                .temAltura(1.79)
                .constroi();
        
        System.out.println(paciente);
        
    }
    
}
