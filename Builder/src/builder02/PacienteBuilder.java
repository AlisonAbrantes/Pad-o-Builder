/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.DadosFisicos;
import modelo.DadosPessoais;
import modelo.Documento;
import modelo.Endereco;
import modelo.Paciente;

/**
 *
 * @author Alison Abrantes
 */
public class PacienteBuilder {
    
    private DadosFisicos dadosFisicos = new DadosFisicos();
    private DadosPessoais dadosPessoais = new DadosPessoais();
    private Documento documento = new Documento();
    private Endereco endereco = new Endereco();
    private Paciente paciente =new Paciente();

    private PacienteBuilder(){
        
    }
    
    public static PacienteBuilder novoPacienteBuilder(){
        return new PacienteBuilder();
    }
    
    public PacienteBuilder Sangue(String tiposanquineo)
    {
        dadosFisicos.setTipoSanguineo(tiposanquineo);
        return this;    
    }
    
    public PacienteBuilder temPeso(double peso)
    {
        dadosFisicos.setPeso(peso);
        return this;    
    }
    
    public PacienteBuilder temAltura(double altura)
    {
        dadosFisicos.setAltura(altura);
        return this;    
    }
    
    public PacienteBuilder moraCidade(String cidade)
    {
        endereco.setCidade(cidade);
        return this;    
    }
    
     public PacienteBuilder moraEstado(String uf)
    {
        endereco.setUf(uf);
        return this;    
    }
     
    public PacienteBuilder temCep(String cep)
    {
        endereco.setCep(cep);
        return this;    
    }
      
   public PacienteBuilder moraLogradouro(String logradouro)
    {
        endereco.setLogradouro(logradouro);
        return this;    
    }
       
    public PacienteBuilder temNumero(int numero)
    {
        endereco.setNumero(numero);
        return this;    
    }  
    
    public PacienteBuilder comNome(String nome){
        dadosPessoais.setNome(nome);
        
        return this;
    }
    
    public PacienteBuilder nascidoEm(String data){
        
        try {
            Date dataNasc = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            
            dadosPessoais.setDataNascimento(dataNasc);
        } catch (ParseException ex) {
            Logger.getLogger(builder01.PacienteBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return this;
    }
    
    public PacienteBuilder doSexo(char sexo){
        dadosPessoais.setSexo(sexo);
        return this;
    }
    
    public PacienteBuilder comCPF(String cpf){
        documento.setCpf(cpf);
        return this;
    }
    
    public PacienteBuilder comRG(String rg){
        documento.setRg(rg);
        return this;
    }
        
    public Paciente constroi(){
        paciente.setDadosPessoais(dadosPessoais);
        paciente.setDocumento(documento);
        paciente.setDadosFisicos(dadosFisicos);
        paciente.setEndereco(endereco);
        
        return paciente;
    }
    
    
    
}
