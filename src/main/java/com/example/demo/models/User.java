//TUDO QUE FOR VIRAR TABELA DE BANCO FICA DENTRO DESTA PASTA MODELS.

package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



//Para usar somente os metodos getters sem setters, uso @Getter
//Para usar somente os metodos setters sem getters, uso @Setter
//@Data usa todos os metodos getters, setters e toString embutidos.
//@AllArgsConstructor: cria o construtor com os argumentos
//@NoArgsConstructor: cria o construtor sem argumentos

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
	//Sempre que for utilizar para banco de dados usar classes.
	
	//O entity precisa de uma chave primaria. 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Integer idade;
	
}
