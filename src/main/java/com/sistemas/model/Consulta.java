package com.sistemas.model;


import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="consulta")
public class Consulta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idConsulta;
	
	@Column(name = "fecha", nullable = false)
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name="idEspecialidad", nullable=false)
	private Especialidad idEspecialidad;
	
	@ManyToOne
	@JoinColumn(name="idMedico", nullable=false)
	private Especialidad idMedico;
	
	@ManyToOne
	@JoinColumn(name="idPaciente", nullable=false)
	private Especialidad idPaciente;
	

	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "consuta_examen", joinColumns = @JoinColumn(name="idConsulta", referencedColumnName = "idConsulta"),
	inverseJoinColumns =  @JoinColumn(name = "idExamen", referencedColumnName = "idExamen"))
	List<Examen> examen;

	public int getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Especialidad getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(Especialidad idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public Especialidad getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Especialidad idMedico) {
		this.idMedico = idMedico;
	}

	public Especialidad getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Especialidad idPaciente) {
		this.idPaciente = idPaciente;
	}

	public List<Examen> getExamen() {
		return examen;
	}

	public void setExamen(List<Examen> examen) {
		this.examen = examen;
	}
	
	
	
	

}
