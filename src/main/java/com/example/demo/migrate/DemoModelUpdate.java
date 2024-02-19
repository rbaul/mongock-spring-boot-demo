package com.example.demo.migrate;

import com.example.demo.model.DemoModel;
import com.example.demo.repositories.DemoModelRepository;
import io.mongock.api.annotations.*;

import java.util.List;

@ChangeUnit(id = "demo-2", order = "002", author = "mongock")
public class DemoModelUpdate {

    @Execution
    public void execution(DemoModelRepository demoModelRepository) {
        List<DemoModel> demoModels = demoModelRepository.findAll();
        for (int i = 0; i < demoModels.size(); i++) {
            demoModels.get(i).setNumber(i);
        }
        demoModelRepository.saveAll(demoModels);
    }

    @RollbackExecution
    public void rollbackExecution(DemoModelRepository demoModelRepository) {
//        demoModelRepository.deleteAll();
    }

}