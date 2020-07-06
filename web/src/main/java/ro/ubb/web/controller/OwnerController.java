package ro.ubb.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.ubb.core.service.OwnerService;
import ro.ubb.web.converter.converter;
import ro.ubb.web.dto.OwnerDTO;

import java.util.List;
import java.util.Set;

@RestController
public class OwnerController {

    @Autowired
    private OwnerService ownerService;


    @RequestMapping(value="/owners", method= RequestMethod.GET)
    Set<OwnerDTO> getOwners()
    {
        return converter.convertModelsToDtos(  ownerService.getAllOwners() );
    }
}
