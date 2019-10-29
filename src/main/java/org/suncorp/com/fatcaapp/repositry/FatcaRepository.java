package org.suncorp.com.fatcaapp.repositry;


import org.springframework.stereotype.Repository;
import org.suncorp.com.fatcaapp.model.FatcaModel;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FatcaRepository {

    static List<FatcaModel> fatcaModels=new ArrayList<>();

    static{
        fatcaModels.add(new FatcaModel(1234,"India","DEOPP3833P",null,false));
        fatcaModels.add(new FatcaModel(1234,"Dubai","DBI9898P",null,false));
        fatcaModels.add(new FatcaModel(3674,"US","UNS0909A",null,false));
        fatcaModels.add(new FatcaModel(78944,"Astrailia",null,"country not issuing",false));
        fatcaModels.add(new FatcaModel(89676,"London","LO87484N",null,false));

    }

    public List<FatcaModel> getFatcaDetails(int id){
        List<FatcaModel> resultList=new ArrayList<>();

        for(FatcaModel model:fatcaModels){
            if(model.getGCSId()==id){
                resultList.add(model);
            }
        }

        return resultList;
    }

    public FatcaModel postFatcaDetails(FatcaModel model){
        fatcaModels.add(model);
        return model;
    }

}
