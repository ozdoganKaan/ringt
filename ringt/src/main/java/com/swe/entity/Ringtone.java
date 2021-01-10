package com.swe.entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "RingtoneTable")
public class Ringtone {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private int satinalmasayisi=0;
	
	
	private ArrayList<Integer> trueBinary;
	private ArrayList<Integer> shorTrueBinary;
	
	private ArrayList<Integer> monoBinary;
	private ArrayList<Integer> shortMonoBinary;
	
	private ArrayList<Integer> polyphonicBinary;
	private ArrayList<Integer> shortPolyphonicBinary;
	
	
	
	
	
	
	public int getSatinalmasayisi() {
		return satinalmasayisi;
	}
	public void setSatinalmasayisi(int satinalmasayisi) {
		this.satinalmasayisi = satinalmasayisi;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Integer> getTrueBinary() {
		return trueBinary;
	}
	public void setTrueBinary(ArrayList<Integer> trueBinary) {
		this.trueBinary = trueBinary;
	}
	public ArrayList<Integer> getShorTrueBinary() {
		return shorTrueBinary;
	}
	public void setShorTrueBinary(ArrayList<Integer> shorTrueBinary) {
		this.shorTrueBinary = shorTrueBinary;
	}
	public ArrayList<Integer> getMonoBinary() {
		return monoBinary;
	}
	public void setMonoBinary(ArrayList<Integer> monoBinary) {
		this.monoBinary = monoBinary;
	}
	public ArrayList<Integer> getShortMonoBinary() {
		return shortMonoBinary;
	}
	public void setShortMonoBinary(ArrayList<Integer> shortMonoBinary) {
		this.shortMonoBinary = shortMonoBinary;
	}
	public ArrayList<Integer> getPolyphonicBinary() {
		return polyphonicBinary;
	}
	public void setPolyphonicBinary(ArrayList<Integer> polyphonicBinary) {
		this.polyphonicBinary = polyphonicBinary;
	}
	public ArrayList<Integer> getShortPolyphonicBinary() {
		return shortPolyphonicBinary;
	}
	public void setShortPolyphonicBinary(ArrayList<Integer> shortPolyphonicBinary) {
		this.shortPolyphonicBinary = shortPolyphonicBinary;
	}
	
	
	
}
