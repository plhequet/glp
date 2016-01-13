package ipint.glp.api.DTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;


public class ProfilDTO extends DTO  implements Serializable {
	private static final long serialVersionUID = 1194522427659253560L;
	
	private Integer idProfil;
	// @Temporal(TemporalType.DATE)
	// @javax.validation.constraints.Past(message="Date de naissance invalide")
	// private Calendar dateNaiss;
	@javax.validation.constraints.NotNull(message = "Veuillez remplir le champ cursus")
	private String cursus;
	@OneToMany(mappedBy = "profil")
	private List<DiplomeDTO> diplomes;
	@OneToMany(mappedBy = "profil")
	private List<CompetenceDTO> competence;
	private String centreInteret;
	//@javax.validation.constraints.Pattern(regexp = "#^0[1-9][0-9]{8}$#", message = "Téléphone invalide")
	private String telephone;
	@OneToMany(mappedBy = "profil")
	private List<ExperienceDTO> experiences;

	public ProfilDTO() {
		this.experiences = new ArrayList<>();
	}

	public Integer getIdProfil() {
		return idProfil;
	}

	public void setIdProfil(Integer idProfil) {
		this.idProfil = idProfil;
	}

	public String getCursus() {
		return cursus;
	}

	public void setCursus(String cursus) {
		this.cursus = cursus;
	}

	public List<CompetenceDTO> getCompetence() {
		return competence;
	}

	public void setCompetence(List<CompetenceDTO> competence) {
		this.competence = competence;
	}

	public String getCentreInteret() {
		return centreInteret;
	}

	public void setCentreInteret(String centreInteret) {
		this.centreInteret = centreInteret;
	}
	

	public List<DiplomeDTO> getDiplomes() {
		return diplomes;
	}

	public void setDiplomes(List<DiplomeDTO> diplomes) {
		this.diplomes = diplomes;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<ExperienceDTO> getExperiences() {
		return experiences;
	}

	public void setExperiences(List<ExperienceDTO> experiences) {
		this.experiences = experiences;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idProfil == null) ? 0 : idProfil.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProfilDTO other = (ProfilDTO) obj;
		if (idProfil == null) {
			if (other.idProfil != null)
				return false;
		} else if (!idProfil.equals(other.idProfil))
			return false;
		return true;
	}

}
