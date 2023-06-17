package tn.mdweb.aminoacido.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fiche")
public class Fiche {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;

	@Column
	private String pathologie;

	@Column
	private String identificationDuPatient;

	@Column
	private String parcoursDeSoin;

	@Column
	private String histoireFamiliale;

	@Column
	private String diagnostic;

	@Column
	private String bilanDesDeficiencesHandicap;

	@Column
	private String priseEnCharge;

	@Column
	private String enqueteFamiliale;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPathologie() {
		return pathologie;
	}

	public void setPathologie(String pathologie) {
		this.pathologie = pathologie;
	}

	public String getIdentificationDuPatient() {
		return identificationDuPatient;
	}

	public void setIdentificationDuPatient(String identificationDuPatient) {
		this.identificationDuPatient = identificationDuPatient;
	}

	public String getParcoursDeSoin() {
		return parcoursDeSoin;
	}

	public void setParcoursDeSoin(String parcoursDeSoin) {
		this.parcoursDeSoin = parcoursDeSoin;
	}

	public String getHistoireFamiliale() {
		return histoireFamiliale;
	}

	public void setHistoireFamiliale(String histoireFamiliale) {
		this.histoireFamiliale = histoireFamiliale;
	}

	public String getDiagnostic() {
		return diagnostic;
	}

	public void setDiagnostic(String diagnostic) {
		this.diagnostic = diagnostic;
	}

	public String getBilanDesDeficiencesHandicap() {
		return bilanDesDeficiencesHandicap;
	}

	public void setBilanDesDeficiencesHandicap(String bilanDesDeficiencesHandicap) {
		this.bilanDesDeficiencesHandicap = bilanDesDeficiencesHandicap;
	}

	public String getPriseEnCharge() {
		return priseEnCharge;
	}

	public void setPriseEnCharge(String priseEnCharge) {
		this.priseEnCharge = priseEnCharge;
	}

	public String getEnqueteFamiliale() {
		return enqueteFamiliale;
	}

	public void setEnqueteFamiliale(String enqueteFamiliale) {
		this.enqueteFamiliale = enqueteFamiliale;
	}

	@Override
	public String toString() {
		return "Fiche [id=" + id + ", pathologie=" + pathologie + ", identificationDuPatient=" + identificationDuPatient
				+ ", parcoursDeSoin=" + parcoursDeSoin + ", histoireFamiliale=" + histoireFamiliale + ", diagnostic="
				+ diagnostic + ", bilanDesDeficiencesHandicap=" + bilanDesDeficiencesHandicap + ", priseEnCharge="
				+ priseEnCharge + ", enqueteFamiliale=" + enqueteFamiliale + "]";
	}

}
