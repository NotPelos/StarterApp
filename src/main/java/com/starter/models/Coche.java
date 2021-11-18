package com.starter.models;


public class Coche {
	
	private Long id;
	private String matricula;
	private String compania;
	private String marca;
	private String ano;
	private Double precio;

	public Coche() {
		super();
	}

	public Coche(Long id, String matricula, String compania, String marca, String ano, Double precio) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.compania = compania;
		this.marca = marca;
		this.ano = ano;
		this.precio = precio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Coche [id=" +id + ", matricula=" + matricula + ", compania=" + compania+ ", marca=" + marca + ", ano=" + ano+ ", precio="+ precio+"€ ]";
		
	}
		
}
