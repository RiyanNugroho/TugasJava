package com.pbo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mleasingtransaction")

public class LeasingTransaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="Nokontrak")
	private Double Nokontrak;
	@Column(name="idLeasing")
	private Double idLeasing;
	@Column(name="idCustomer")
	private Double idCustomer;
	@Column(name="Nominal")
	private Double Nominal;
	@Column(name="TglTry")
	private Double TglTry;
	@Column(name="idVehicle")
	private Double idVehicle;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getNokontrak() {
		return Nokontrak;
	}
	public void setNokontrak(Double nokontrak) {
		Nokontrak = nokontrak;
	}
	public Double getIdLeasing() {
		return idLeasing;
	}
	public void setIdLeasing(Double idLeasing) {
		this.idLeasing = idLeasing;
	}
	public Double getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(Double idCustomer) {
		this.idCustomer = idCustomer;
	}
	public Double getNominal() {
		return Nominal;
	}
	public void setNominal(Double nominal) {
		Nominal = nominal;
	}
	public Double getTglTry() {
		return TglTry;
	}
	public void setTglTry(Double tglTry) {
		TglTry = tglTry;
	}
	public Double getIdVehicle() {
		return idVehicle;
	}
	public void setIdVehicle(Double idVehicle) {
		this.idVehicle = idVehicle;
	}
}
