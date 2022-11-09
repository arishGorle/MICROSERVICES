package com.COGNIZANT.VEHICLES.Service;


//@FeignClient(name="profiles",url = "http://localhost:9100")

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name="PROFILES",url="http://localhost:2800")
public interface UserClient {
    @GetMapping("/{id}/exists")
    Boolean checkForUserById (@PathVariable(name="id") long Id);

}

//@FeignClient(name="profiles",url = "http://localhost:9100")
//public interface ProfilesClient {
//    @GetMapping("/{ahid}/exists")
//    boolean checkForAccountHolderById(@PathVariable(name="ahid") long ahId);
//}