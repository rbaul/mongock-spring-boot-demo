package com.example.demo.migrate;

import com.example.demo.model.DemoModel;
import com.example.demo.repositories.DemoModelRepository;
import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

@ChangeLog
public class DemoModelInit {

    @ChangeSet(id = "demo-1", order = "001", author = "mongock")
    public void execution(DemoModelRepository demoModelRepository) {
        List<DemoModel> demoModels = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            demoModels.add(DemoModel.builder()
                    .name(MessageFormat.format("Demo model name {0}", i)).build());
        }
        demoModelRepository.saveAll(demoModels);
    }
}