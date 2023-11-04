package com.project.staragile.insureme;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {
	@Autowired
	PolicyRepository policyRepository;

	public Policy createPolicy(Policy policy) {
		return policyRepository.save(policy);
	}

	public Policy updatePolicy(int policyId, Policy newPolicy) {
		Optional<Policy> policyOptional = policyRepository.findById(policyId);
		Policy policy = policyOptional.get();

		policy.setPolicyEndDate(newPolicy.getPolicyEndDate());
		policy.setPolicyHolderName(newPolicy.getPolicyHolderName());
		policy.setPolicyStartDate(newPolicy.getPolicyStartDate());
		policy.setPolicyPrice(newPolicy.getPolicyPrice());
		policy.setPolicyType(newPolicy.getPolicyType());

		return policyRepository.save(policy);
	}

	public String deletePolicy(int policyId) {
		try {
			policyRepository.deleteById(policyId);
			return "Successful Deletion";
		} catch (Exception e) {
			return "Unsuccessful Deletion";
		}
	}

	public Optional<Policy> searchPolicy(int policyId) {
		Optional<Policy> policyOptional = policyRepository.findById(policyId);
		return policyOptional;
	}

}
