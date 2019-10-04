import java.sql.Date;
 
public class Policy {

	private int policyId;
	private Date startDate;
	private int policyPeriod;
	private int sumAssured;
	private int premiumAmount;

	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Policy(int policyId, Date startDate, int policyPeriod, int sumAssured, int premiumAmount) {
		super();
		this.policyId = policyId;
		this.startDate = startDate;
		this.policyPeriod = policyPeriod;
		this.sumAssured = sumAssured;
		this.premiumAmount = premiumAmount;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getPolicyPeriod() {
		return policyPeriod;
	}

	public void setPolicyPeriod(int policyPeriod) {
		this.policyPeriod = policyPeriod;
	}

	public int getSumAssured() {
		return sumAssured;
	}

	public void setSumAssured(int sumAssured) {
		this.sumAssured = sumAssured;
	}

	public int getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

}
