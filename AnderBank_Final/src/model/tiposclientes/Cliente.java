/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.tiposclientes;

import java.util.ArrayList;
import model.geralconta.Conta;


/**
 *
 * @author Alysson
 */

public abstract class Cliente {
	private String nome;
	private String cpf;
        
        public Cliente() {}
	
	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
        }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return this.cpf;
	}
	
        
        
        
        @Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + "]";
	}


}