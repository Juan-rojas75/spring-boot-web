package com.hqsocial.springboot.web.app.models;

public class Usuario {

	private String nombre;
	private String apellidos;
	private String usuario;
	private String pass;
	private String area;
	private String email;

	public Usuario() {
	}

	public Usuario(String nombre, String apellidos, String usuario, String pass, String area, String email) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.usuario = usuario;
		this.pass = pass;
		this.area = area;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return pass;
	}

	public void setContraseña(String pass) {
		this.pass = pass;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
