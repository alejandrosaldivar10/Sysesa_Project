package com.example.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String telefono;
	private String correo;
	private String domicilio;
	private String fechaNacimiento;
	private String genero;
	private String empresa;
	private String ultimoServicio;
	private String servicioRealizado;
	private String remisionFactura;
	private String datosFiscales;
	private int estatus;
	
	

	public Cliente(int id, String nombre, String telefono, String correo, String domicilio, String fechaNacimiento,
			String genero, String empresa, String ultimoServicio, String servicioRealizado, String remisionFactura,
			String datosFiscales, int estatus) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
		this.domicilio = domicilio;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.empresa = empresa;
		this.ultimoServicio = ultimoServicio;
		this.servicioRealizado = servicioRealizado;
		this.remisionFactura = remisionFactura;
		this.datosFiscales = datosFiscales;
		this.estatus = estatus;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getUltimoServicio() {
		return ultimoServicio;
	}

	public void setUltimoServicio(String ultimoServicio) {
		this.ultimoServicio = ultimoServicio;
	}

	public String getRemisionFactura() {
		return remisionFactura;
	}

	public void setRemisionFactura(String remisionFactura) {
		this.remisionFactura = remisionFactura;
	}

	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public String getDatosFiscales() {
		return datosFiscales;
	}

	public void setDatosFiscales(String datosFiscales) {
		this.datosFiscales = datosFiscales;
	}

	public String getServicioRealizado() {
		return servicioRealizado;
	}

	public void setServicioRealizado(String servicioRealizado) {
		this.servicioRealizado = servicioRealizado;
	}
	
	
}
