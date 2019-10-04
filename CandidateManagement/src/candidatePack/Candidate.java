package candidatePack;

public class Candidate {

	private int candidateId;
	private String candidateName;
	private int experience;
	private String graduationLevel;
	private String[] skillSet = { "java", "c" };
	private String status;

	public Candidate() {

	}

	public Candidate(int candidateId, String candidateName, int experience, String graduationLevel, String[] skillSet,
			String status) {
		super();
		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.experience = experience;
		this.graduationLevel = graduationLevel;
		this.skillSet = skillSet;
		this.status = status;
	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getGraduationLevel() {
		return graduationLevel;
	}

	public void setGraduationLevel(String graduationLevel) {
		this.graduationLevel = graduationLevel;
	}

	public String[] getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String[] skillSet) {
		this.skillSet = skillSet;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}