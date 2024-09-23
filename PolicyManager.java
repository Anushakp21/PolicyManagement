package policymanagement;

import java.util.*;

public class PolicyManager {
    private Map<String, Policy> policyHashMap;
    private Map<Date, Policy> policyTreeMap;
    private Map<String, Policy> policyLinkedHashMap;

    public PolicyManager() {
        policyHashMap = new HashMap<>();
        policyTreeMap = new TreeMap<>();
        policyLinkedHashMap = new LinkedHashMap<>();
    }

     public void addPolicy(Policy policy) {
        policyHashMap.put(policy.getPolicyId(), policy);
        policyTreeMap.put(policy.getExpiryDate(), policy);
        policyLinkedHashMap.put(policy.getPolicyId(), policy);
    }

    public void displayHashMapPolicies() {
        System.out.println("Policies in HashMap:");
        for (Policy policy : policyHashMap.values()) {
            System.out.println(policy);
        }
    }

    public void displayTreeMapPolicies() {
        System.out.println("Policies in TreeMap (sorted by expiry date):");
        for (Policy policy : policyTreeMap.values()) {
            System.out.println(policy);
        }
    }

    public void displayLinkedHashMapPolicies() {
        System.out.println("Policies in LinkedHashMap (insertion order):");
        for (Policy policy : policyLinkedHashMap.values()) {
            System.out.println(policy);
        }
    }

     public Policy getPolicyById(String policyId) {
        return policyHashMap.get(policyId);
    }
}

