package com.example.dtodemo.MapperService;

import com.example.dtodemo.DTO.UserLocationDTO;
import com.example.dtodemo.Entity.Location;
import com.example.dtodemo.Entity.User;
import com.example.dtodemo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MappingService {
    @Autowired
    private UserRepository userRepository;

    //create getAllUsersLocation() method that returns a list of UserLocationDTO
    public List<UserLocationDTO> getAllUsersLocation(){
        return ((List<User>) userRepository
                .findAll()).stream()
                .map(this::convertDataIntoDTO).collect(Collectors.toList());
    }

    // create convertDataIntoDTO() method that returns UserLocationDTO
    private UserLocationDTO convertDataIntoDTO(User userData) {
        // create instance of our UserLocationDTO class
        UserLocationDTO dto = new UserLocationDTO();

        //set username and userId in dto from the userData
        dto.setUserId(userData.getId());
        dto.setUsername(userData.getUserName());

        // create instance of the Location class
        Location loc = userData.getLoc();

        dto.setLatitude(loc.getLatitude());
        dto.setLongitude(loc.getLongitude());
        dto.setPlace(loc.getPlaceName());

        return dto;
    }
}
