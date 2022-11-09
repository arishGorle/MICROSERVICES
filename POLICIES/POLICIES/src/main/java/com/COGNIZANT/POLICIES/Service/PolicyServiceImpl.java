package com.COGNIZANT.POLICIES.Service;

import com.COGNIZANT.POLICIES.Repository.PolicyReppository;
import com.COGNIZANT.POLICIES.exception.ResourceNotFoundException;
import com.COGNIZANT.POLICIES.model.Policy;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PolicyServiceImpl implements PolicyService{

    @Autowired
    private  PolicyReppository policyReppository;
    @Override
    public boolean existsById(Long pid) throws ResourceNotFoundException {
        return policyReppository.existsById(pid);
    }
    @Override
    public Policy getById(Long pid) throws ResourceNotFoundException {
        return policyReppository.findById(pid).orElse(null);
    }


    @Override
    public Policy add(Policy policy) throws  ResourceNotFoundException{
            if (policy.getPid()!= null && policyReppository.existsById(policy.getPid()))
                throw new ResourceNotFoundException("Policy Exists Already");
            return policyReppository.save(policy);
        }
    }

//    @Override
//    public Policy getpolicybyid(Long id) {
//        return null;
//    }


