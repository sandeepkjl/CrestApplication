package org.suncorp.com.fatcaapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.suncorp.com.fatcaapp.model.FatcaModel;
import org.suncorp.com.fatcaapp.repositry.FatcaRepository;

import java.util.List;

@Component
public class FatcaService {

    @Autowired
    private FatcaRepository repository;

    public List<FatcaModel> getFatcaById(int id){
        List<FatcaModel>  results= repository.getFatcaDetails(id);
        return results;
    }

    public FatcaModel createFatca(FatcaModel model){
        return repository.postFatcaDetails(model);
    }

}
