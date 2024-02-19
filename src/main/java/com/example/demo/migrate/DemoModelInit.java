package com.example.demo.migrate;

import com.example.demo.model.DemoModel;
import com.example.demo.repositories.DemoModelRepository;
import io.mongock.api.annotations.*;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

@ChangeUnit(id = "demo-1", order = "001", author = "mongock")
public class DemoModelInit {

    @BeforeExecution
    public void beforeExecution(MongoTemplate mongoTemplate) {
        mongoTemplate.createCollection(DemoModel.DEMO_MODEL);
    }

    @RollbackBeforeExecution
    public void rollbackBeforeExecution(MongoTemplate mongoTemplate) {
        mongoTemplate.dropCollection(DemoModel.DEMO_MODEL);
    }

    @Execution
    public void execution(DemoModelRepository demoModelRepository) {
        List<DemoModel> demoModels = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            demoModels.add(DemoModel.builder()
                    .name(MessageFormat.format("Demo model name {0}", i)).build());
        }
        demoModelRepository.saveAll(demoModels);
    }

    @RollbackExecution
    public void rollbackExecution(DemoModelRepository demoModelRepository) {
        demoModelRepository.deleteAll();
    }

}