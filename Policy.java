package policymanagement;

import java.util.Date;

public class Policy {
	private String policyId;
	private String type;
	private double premium;
	private double coverageAmount;
	private Date expiryDate;

	public Policy(String policyId, String type, double premium, double coverageAmount, Date expiryDate) {
		this.policyId = policyId;
		this.type = type;
		this.premium = premium;
		this.coverageAmount = coverageAmount;
		this.expiryDate = expiryDate;
	}

	
	public String getPolicyId() {
		return policyId;
	}

	public String getType() {
		return type;
	}

	public double getPremium() {
		return premium;
	}

	public double getCoverageAmount() {
		return coverageAmount;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	@Override
	public String toString() {
		return "Policy ID: " + policyId + ", Type: " + type + ", Premium: " + premium + ", Coverage Amount: "
				+ coverageAmount + ", Expiry Date: " + expiryDate;
	}
}
