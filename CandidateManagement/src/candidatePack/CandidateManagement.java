package candidatePack;

import java.util.ArrayList;
import java.util.List;

public class CandidateManagement {

	private List<Candidate> candidateList = new ArrayList<Candidate>();
	Candidate candidate = new Candidate();

	public String addCandidate(Candidate candidate) throws InvalidStatusException, CandidateAlreadyExistException {
		@SuppressWarnings("unused")
		int numOfCandidatesAdded = 0;
		boolean found = candidateList.contains(candidate);

		if (candidate == null)
			return "Candidate Object Not Found";
		else if (candidate.getStatus() != "new")
			throw new InvalidStatusException("Invalid");
		else if (!found) {
			candidateList.add(candidate);
			numOfCandidatesAdded++;
			System.out.println(candidateList);
			return "candidate registered";
		} else
			throw new CandidateAlreadyExistException("exists");

	}

	public int shortlistCandiates(int experince, String gradlevel, String[] skillSet) {

		int count = 0;
		if (candidate.getSkillSet().equals(skillSet)) {
			candidate.setStatus("Rejected");
		}

		else if (experince < 0) {
			return -1;
		} else if (gradlevel.equals("UG") || gradlevel.equals("UG")) {
			count++;

			candidate.setStatus("Shortlisted");
			candidateList.add(candidate);
			System.out.println(candidateList);
		}

		return count;
	}

	public int updateStatus(int[] candidateId) {

		for (Candidate candidate : candidateList) {
			for (int i = 0; i < candidateList.size(); i++) {
				if (candidateId[i] == candidate.getCandidateId()) {
					if (candidate.getStatus().equals("Shortlisted")) {
						candidate.setStatus("selected");

					} else
						return -1;
				} else
					return -1;
			}
		}
		return 1;

	}

	public ArrayList<Candidate> getCandidatesList(String status) throws InvalidStatusException {

		ArrayList<Candidate> candidate1 = new ArrayList<Candidate>();

		if (status.equals(candidate.getStatus())) {
			candidate1.add(candidate);
			return candidate1;
		}

		return candidate1;

	}
}
