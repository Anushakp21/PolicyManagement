package policymanagement;

import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		PolicyManager manager = new PolicyManager();

		Calendar cal = Calendar.getInstance();
		cal.set(2025, Calendar.MARCH, 10);
		Policy policy1 = new Policy("P001", "Health", 500.00, 100000.00, cal.getTime());

		cal.set(2024, Calendar.DECEMBER, 20);
		Policy policy2 = new Policy("P002", "Life", 300.00, 50000.00, cal.getTime());

		cal.set(2023, Calendar.NOVEMBER, 15);
		Policy policy3 = new Policy("P003", "Auto", 700.00, 75000.00, cal.getTime());

		manager.addPolicy(policy1);
		manager.addPolicy(policy2);
		manager.addPolicy(policy3);

		manager.displayHashMapPolicies();
		manager.displayTreeMapPolicies();
		manager.displayLinkedHashMapPolicies();
	}
}

