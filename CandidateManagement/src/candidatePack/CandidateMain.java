package candidatePack;

public class CandidateMain {

	public static void main(String[] args) throws InvalidStatusException, CandidateAlreadyExistException {
		// TODO Auto-generated method stub

		CandidateManagement candidateManagement = new CandidateManagement();
		Candidate candidate1 = new Candidate();
		Candidate candidate2 = new Candidate();

		candidate1.setCandidateId(123);
		candidate1.setCandidateName("ram");
		candidate1.setExperience(2);
		candidate1.setGraduationLevel("UG");
		candidate1.setSkillSet(new String[] { "java", "c" });
		candidate1.setStatus("new");
		
		candidate2.setCandidateId(1234);
		candidate2.setCandidateName("ram");
		candidate2.setExperience(2);
		candidate2.setGraduationLevel("UG");
		candidate2.setSkillSet(new String[] { "java", "c" });
		candidate2.setStatus("new");
	
		System.out.println(candidateManagement.addCandidate(candidate2));
		System.out.println(candidateManagement.addCandidate(candidate1));

		System.out.println(candidateManagement.shortlistCandiates(123, "UG", new String[] { "java" }));
		System.out.println(candidateManagement.shortlistCandiates(-1, "PG", new String[] { "java" }));

		System.out.println(candidateManagement.updateStatus(new int[] { 2, 1, -1, 2 }));
		
		System.out.println(candidateManagement.getCandidatesList("selected"));
	}

}
