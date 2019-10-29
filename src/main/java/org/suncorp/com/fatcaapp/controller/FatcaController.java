package org.suncorp.com.fatcaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.suncorp.com.fatcaapp.model.FatcaModel;
import org.suncorp.com.fatcaapp.service.FatcaService;

import java.util.List;

@RestController
public class FatcaController {

    @Autowired
    private FatcaService service;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/getDetailsByGCSId/{id}", method = RequestMethod.GET,produces = "application/json")
    public ResponseEntity<List<FatcaModel>> getFatcaDetails(@PathVariable("id") int id){
        return new ResponseEntity(service.getFatcaById(id),HttpStatus.OK);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/createDetails", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<FatcaModel>> getFatcaDetails(@RequestBody FatcaModel model){
        return new ResponseEntity(service.createFatca(model),HttpStatus.CREATED);
    }
}
