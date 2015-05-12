package org.apache.camel.example.liquidacion.model;

import java.sql.Date;

public class Operacion {
	
	private Integer id;
	private Integer folioOperacion;
	private Date fechaConcertacion;
	private String tipoOperacion;
	private String folioBMV;
	private Agente agente;
	private Emision emision;
	private Integer numeroTitulos;
	private Integer precioPorTitulo;
	private Date fechaALiquidarse;
	private Float monto;
	private Float montoDiferencialPrecios;
	private Boolean cruce;
	private Integer plazoDias;
	private Date FechaLiquidacion;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the folioOperacion
	 */
	public Integer getFolioOperacion() {
		return folioOperacion;
	}
	/**
	 * @param folioOperacion the folioOperacion to set
	 */
	public void setFolioOperacion(Integer folioOperacion) {
		this.folioOperacion = folioOperacion;
	}
	/**
	 * @return the fechaConcertacion
	 */
	public Date getFechaConcertacion() {
		return fechaConcertacion;
	}
	/**
	 * @param fechaConcertacion the fechaConcertacion to set
	 */
	public void setFechaConcertacion(Date fechaConcertacion) {
		this.fechaConcertacion = fechaConcertacion;
	}
	/**
	 * @return the tipoOperacion
	 */
	public String getTipoOperacion() {
		return tipoOperacion;
	}
	/**
	 * @param tipoOperacion the tipoOperacion to set
	 */
	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}
	/**
	 * @return the folioBMV
	 */
	public String getFolioBMV() {
		return folioBMV;
	}
	/**
	 * @param folioBMV the folioBMV to set
	 */
	public void setFolioBMV(String folioBMV) {
		this.folioBMV = folioBMV;
	}
	/**
	 * @return the agente
	 */
	public Agente getAgente() {
		return agente;
	}
	/**
	 * @param agente the agente to set
	 */
	public void setAgente(Agente agente) {
		this.agente = agente;
	}
	/**
	 * @return the emision
	 */
	public Emision getEmision() {
		return emision;
	}
	/**
	 * @param emision the emision to set
	 */
	public void setEmision(Emision emision) {
		this.emision = emision;
	}
	/**
	 * @return the numeroTitulos
	 */
	public Integer getNumeroTitulos() {
		return numeroTitulos;
	}
	/**
	 * @param numeroTitulos the numeroTitulos to set
	 */
	public void setNumeroTitulos(Integer numeroTitulos) {
		this.numeroTitulos = numeroTitulos;
	}
	/**
	 * @return the precioPorTitulo
	 */
	public Integer getPrecioPorTitulo() {
		return precioPorTitulo;
	}
	/**
	 * @param precioPorTitulo the precioPorTitulo to set
	 */
	public void setPrecioPorTitulo(Integer precioPorTitulo) {
		this.precioPorTitulo = precioPorTitulo;
	}
	/**
	 * @return the fechaALiquidarse
	 */
	public Date getFechaALiquidarse() {
		return fechaALiquidarse;
	}
	/**
	 * @param fechaALiquidarse the fechaALiquidarse to set
	 */
	public void setFechaALiquidarse(Date fechaALiquidarse) {
		this.fechaALiquidarse = fechaALiquidarse;
	}
	/**
	 * @return the monto
	 */
	public Float getMonto() {
		return monto;
	}
	/**
	 * @param monto the monto to set
	 */
	public void setMonto(Float monto) {
		this.monto = monto;
	}
	/**
	 * @return the montoDiferencialPrecios
	 */
	public Float getMontoDiferencialPrecios() {
		return montoDiferencialPrecios;
	}
	/**
	 * @param montoDiferencialPrecios the montoDiferencialPrecios to set
	 */
	public void setMontoDiferencialPrecios(Float montoDiferencialPrecios) {
		this.montoDiferencialPrecios = montoDiferencialPrecios;
	}
	/**
	 * @return the cruce
	 */
	public Boolean getCruce() {
		return cruce;
	}
	/**
	 * @param cruce the cruce to set
	 */
	public void setCruce(Boolean cruce) {
		this.cruce = cruce;
	}
	/**
	 * @return the plazoDias
	 */
	public Integer getPlazoDias() {
		return plazoDias;
	}
	/**
	 * @param plazoDias the plazoDias to set
	 */
	public void setPlazoDias(Integer plazoDias) {
		this.plazoDias = plazoDias;
	}
	/**
	 * @return the fechaLiquidacion
	 */
	public Date getFechaLiquidacion() {
		return FechaLiquidacion;
	}
	/**
	 * @param fechaLiquidacion the fechaLiquidacion to set
	 */
	public void setFechaLiquidacion(Date fechaLiquidacion) {
		FechaLiquidacion = fechaLiquidacion;
	}
	
	
	

}
