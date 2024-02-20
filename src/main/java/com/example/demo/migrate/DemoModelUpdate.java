package com.example.demo.migrate;

import com.example.demo.model.DemoModel;
import com.example.demo.repositories.DemoModelRepository;
import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;

import java.util.List;

@ChangeLog
public class DemoModelUpdate {

    @ChangeSet(id = "demo-2", order = "002", author = "mongock")
    public void execution(DemoModelRepository demoModelRepository) {
        List<DemoModel> demoModels = demoModelRepository.findAll();
        for (int i = 0; i < demoModels.size(); i++) {
            demoModels.get(i).setNumber(i);
        }
        demoModelRepository.saveAll(demoModels);
    }


}