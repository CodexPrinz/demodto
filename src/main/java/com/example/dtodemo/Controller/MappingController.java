package com.example.dtodemo.Controller;

import com.example.dtodemo.DTO.UserLocationDTO;
import com.example.dtodemo.MapperService.MappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MappingController {
    // create instance of the mapService class
    @Autowired
    private MappingService mapService;

    @GetMapping("/map")     // create endpoint
    @ResponseBody           // when user hit the endpoint, it returns the response body
    public List<UserLocationDTO> getAllUsersLocation(){
        // call getAllUsersLocation() method from the service which we created before
        // store the result in a list of UserLocationDTO
        List<UserLocationDTO> usersLocation = mapService.getAllUsersLocation();
        return usersLocation;
    }

}
