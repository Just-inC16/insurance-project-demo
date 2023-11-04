package com.project.staragile.insureme;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyController {

	@Autowired
	PolicyService policyService;

	@PostMapping("/createPolicy")
	public Policy createPolicy(@RequestBody Policy policy) {
		if (policy != null) {
			return policyService.createPolicy(policy);
		}
		return null;
	}

	@PutMapping("/updatePolicy/{policyId}")
	public Policy updatePolicy(@PathVariable(value = "policyId") int policyId, @RequestBody Policy policy) {
		if (policy != null) {
			return policyService.updatePolicy(policyId, policy);
		}
		return null;
	}

	@GetMapping("/viewPolicy/{policyId}")
	public Optional<Policy> searchPolicy(@PathVariable(value = "policyId") int policyId) {
		return policyService.searchPolicy(policyId);
	}

	@DeleteMapping("/deletePolicy/{policyId}")
	public String deletePolicy(@PathVariable(value = "policyId") int policyId) {
		return policyService.deletePolicy(policyId);
	}
}
