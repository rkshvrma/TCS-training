package bankproject;

import java.util.ArrayList;

public class Policy {

	
	private String Policyname;
	private int PolicyId;
	private int SumAssured;
	private int Duration;
	public static ArrayList<Policy> PolicyList = new ArrayList<Policy>();
	
	public Policy(String policyname, int policyId, int sumAssured, int duration) {
		
		Policyname = policyname;
		PolicyId = policyId;
		SumAssured = sumAssured;
		Duration = duration;
	}
	
	public Policy() {
		
	}
	
	@Override
	public String toString() {
		return "Policy [Policyname=" + Policyname + ", PolicyId=" + PolicyId + ", SumAssured=" + SumAssured
				+ ", Duration=" + Duration + "]";
	}

	public String getPolicyname() {
		return Policyname;
	}

	public void setPolicyname(String policyname) {
		Policyname = policyname;
	}

	public int getPolicyId() {
		return PolicyId;
	}

	public void setPolicyId(int policyId) {
		PolicyId = policyId;
	}

	public int getSumAssured() {
		return SumAssured;
	}

	public void setSumAssured(int sumAssured) {
		SumAssured = sumAssured;
	}

	public int getDuration() {
		return Duration;
	}

	public void setDuration(int duration) {
		Duration = duration;
	}
	

 
 
}
