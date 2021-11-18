package com.starter.models;


public class CocheBuilder {
	
	private Long id = null;
	private String matricula = null;
	private String compania = null;
	private String marca = null;
	private String ano = null;
	private Double precio = null;
	
	public CocheBuilder id(Long id) {
		this.id = id;
		return this;
	}
	
	public CocheBuilder matricula(String matricula) {
		this.matricula = matricula;
		return this;
	}
	
	public CocheBuilder compania(String compania) {
		this.compania = compania;
		return this;
	}
	
	public CocheBuilder marca(String marca) {
		this.marca = marca;
		return this;
	}
	
	public CocheBuilder precio(Double precio) {
		this.precio = precio;
		return this;
	}
	
	public CocheBuilder ano(String ano) {
		this.ano = ano;
		return this;
	}
	
	public Coche build() {
		return new Coche(this.id,this.matricula,this.compania,this.marca,this.ano, this.precio);
	}

}
