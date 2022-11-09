package com.COGNIZANT.POLICIES.controller;

import com.COGNIZANT.POLICIES.Repository.PolicyReppository;
import com.COGNIZANT.POLICIES.Service.PolicyService;
import com.COGNIZANT.POLICIES.Service.PolicyServiceImpl;
import com.COGNIZANT.POLICIES.exception.ResourceNotFoundException;
import com.COGNIZANT.POLICIES.model.Policy;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class policyController {

//    private  PolicyService policyService;
    @Autowired
    private PolicyService policyService;

//    private  PolicyReppository policyReppository;

    @GetMapping("/{pid}")
    public ResponseEntity<Policy> getPolicyByIdAction(@PathVariable("pid") Long pid) throws ResourceNotFoundException {
        Policy model = policyService.getById(pid);
//                getById(ahid);
        return model==null? ResponseEntity.notFound().build() : ResponseEntity.ok(model);
    }
    @GetMapping("/{pid}/exists")
    public ResponseEntity<Boolean> existspolicyByIdAction(@PathVariable("pid") Long pid) throws ResourceNotFoundException {
        return ResponseEntity.ok(policyService.existsById(pid));
    }

    @PostMapping
    public ResponseEntity<Policy> addAction(@RequestBody Policy model) throws ResourceNotFoundException{
        return new ResponseEntity<Policy>(policyService.add(model), HttpStatus.CREATED);
    }
}
