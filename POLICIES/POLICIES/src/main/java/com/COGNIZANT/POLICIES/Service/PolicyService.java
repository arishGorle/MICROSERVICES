package com.COGNIZANT.POLICIES.Service;

import com.COGNIZANT.POLICIES.exception.ResourceNotFoundException;
import com.COGNIZANT.POLICIES.model.Policy;

public interface PolicyService {
    boolean existsById(Long pid) throws ResourceNotFoundException;

    Policy getById(Long pid)  throws ResourceNotFoundException;

    Policy add(Policy policy) throws ResourceNotFoundException;

//    Policy getpolicybyid(Long id);
////            throws ResourceNotFoundException;

}
