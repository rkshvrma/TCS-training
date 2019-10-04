package bankproject;

public class PolicyLogic extends Policy {

	
	Policy p = new Policy();
	
	public void addPolicy(Policy p) {
		
		PolicyList.add(p);
		getDuration();
		
		
	}
	
	public void updatePolciy(String NewPolicyname,int NewPolicyId, int NewSumAssured, int NewDuration  ) {
		
		for(Policy P : PolicyList) {
			
		 {
				P.setPolicyname(NewPolicyname);
				P.setPolicyId(NewPolicyId);
				P.setSumAssured(NewSumAssured);
				P.setDuration(NewDuration );
				
				}
		}
		
	}
	
	public String View() {
		
		String output = " ";
		for (Policy P : PolicyList)
		{
			output += P.toString();
		}
		
		
		return output;
	}
	
	
}
