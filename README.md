# Mongock Demo with Spring Boot 2 and 3

```log

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::               (v2.7.18)

2024-02-20 11:58:45.695  INFO 26164 --- [           main] com.example.demo.DemoApplication         : Starting DemoApplication using Java 17.0.10 on RBAUL02 with PID 26164
2024-02-20 11:58:45.698  INFO 26164 --- [           main] com.example.demo.DemoApplication         : No active profile set, falling back to 1 default profile: "default"
2024-02-20 11:58:46.361  INFO 26164 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data MongoDB repositories in DEFAULT mode.
2024-02-20 11:58:46.430  INFO 26164 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 59 ms. Found 1 MongoDB repository interfaces.
2024-02-20 11:58:47.057  INFO 26164 --- [           main] org.mongodb.driver.client                : MongoClient with metadata {"driver": {"name": "mongo-java-driver|sync|spring-boot", "version": "4.6.1"}, "os": {"type": "Windows", "name": "Windows 10", "architecture": "amd64", "version": "10.0"}, "platform": "Java/IBM Corporation/17.0.10+7"} created with settings MongoClientSettings{readPreference=primary
, writeConcern=WriteConcern{w=null, wTimeout=null ms, journal=null}, retryWrites=true, retryReads=true, readConcern=ReadConcern{level=null}, credential=null, streamFactoryFactory=null, commandListeners=[], codecRegistry=ProvidersCodecRegistry{codecProviders=[ValueCodecProvider{}, BsonValueCodecProvider{}, DBRefCodecProvider{}, DBObjectCodecProvider{}, DocumentCodecProvider{}, IterableCodecProvider{}, MapCo
decProvider{}, GeoJsonCodecProvider{}, GridFSFileCodecProvider{}, Jsr310CodecProvider{}, JsonObjectCodecProvider{}, BsonCodecProvider{}, EnumCodecProvider{}, com.mongodb.Jep395RecordCodecProvider@9c0a970f]}, clusterSettings={hosts=[localhost:27017], srvServiceName=mongodb, mode=SINGLE, requiredClusterType=UNKNOWN, requiredReplicaSetName='null', serverSelector='null', clusterListeners='[]', serverSelectionT
imeout='30000 ms', localThreshold='30000 ms'}, socketSettings=SocketSettings{connectTimeoutMS=10000, readTimeoutMS=0, receiveBufferSize=0, sendBufferSize=0}, heartbeatSocketSettings=SocketSettings{connectTimeoutMS=10000, readTimeoutMS=10000, receiveBufferSize=0, sendBufferSize=0}, connectionPoolSettings=ConnectionPoolSettings{maxSize=100, minSize=0, maxWaitTimeMS=120000, maxConnectionLifeTimeMS=0, maxConne
ctionIdleTimeMS=0, maintenanceInitialDelayMS=0, maintenanceFrequencyMS=60000, connectionPoolListeners=[], maxConnecting=2}, serverSettings=ServerSettings{heartbeatFrequencyMS=10000, minHeartbeatFrequencyMS=500, serverListeners='[]', serverMonitorListeners='[]'}, sslSettings=SslSettings{enabled=false, invalidHostNameAllowed=false, context=null}, applicationName='null', compressorList=[], uuidRepresentation=
JAVA_LEGACY, serverApi=null, autoEncryptionSettings=null, contextProvider=null}
2024-02-20 11:58:47.076  INFO 26164 --- [localhost:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:2, serverValue:102}] to localhost:27017
2024-02-20 11:58:47.076  INFO 26164 --- [localhost:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:1, serverValue:101}] to localhost:27017
2024-02-20 11:58:47.078  INFO 26164 --- [localhost:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=localhost:27017, type=STANDALONE, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=8, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=42559159}
2024-02-20 11:58:47.807  INFO 26164 --- [           main] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:3, serverValue:103}] to localhost:27017
2024-02-20 11:58:47.980  INFO 26164 --- [           main] i.m.r.core.builder.RunnerBuilderBase     : Mongock runner COMMUNITY version[5.2.2]
2024-02-20 11:58:47.981  INFO 26164 --- [           main] i.m.r.core.builder.RunnerBuilderBase     : Running Mongock with NO metadata
2024-02-20 11:58:47.981  WARN 26164 --- [           main] i.m.r.core.builder.RunnerBuilderBase     : Property transaction-enabled not provided. It will become true as default in next versions. Set explicit value to false in case transaction are not desired.
2024-02-20 11:58:47.983  WARN 26164 --- [           main] i.m.r.core.builder.RunnerBuilderBase     : Property transaction-enabled not provided and is unknown if driver is transactionable. BY DEFAULT MONGOCK WILL RUN IN NO-TRANSACTION MODE.
2024-02-20 11:58:48.271  INFO 26164 --- [           main] com.example.demo.DemoApplication         : Started DemoApplication in 3.208 seconds (JVM running for 3.743)
2024-02-20 11:58:48.363  INFO 26164 --- [           main] org.reflections.Reflections              : Reflections took 67 ms to scan 1 urls, producing 2 keys and 2 values
2024-02-20 11:58:48.373  INFO 26164 --- [           main] org.reflections.Reflections              : Reflections took 1 ms to scan 1 urls, producing 2 keys and 2 values
2024-02-20 11:58:48.406  INFO 26164 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock trying to acquire the lock
2024-02-20 11:58:48.446  INFO 26164 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock acquired the lock until: Tue Feb 20 11:59:48 IST 2024
2024-02-20 11:58:48.454  INFO 26164 --- [       Thread-2] i.m.driver.core.lock.LockManagerDefault  : Starting mongock lock daemon...
2024-02-20 11:58:48.457  INFO 26164 --- [           main] i.m.r.c.e.system.SystemUpdateExecutor    : Mongock starting the system update execution id[2024-02-20T11:58:47.979947900-990]...
2024-02-20 11:58:48.459  INFO 26164 --- [       Thread-2] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:4, serverValue:104}] to localhost:27017
2024-02-20 11:58:48.464  INFO 26164 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[io.mongock.runner.core.executor.system.changes.SystemChangeUnit00001] with arguments: []
2024-02-20 11:58:48.467  INFO 26164 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[beforeExecution] with arguments: [io.mongock.driver.mongodb.springdata.v3.SpringDataMongoV3ChangeEntryRepository]
2024-02-20 11:58:48.469  INFO 26164 --- [           main] i.m.r.core.executor.ChangeExecutorBase   : APPLIED - {"id"="system-change-00001_before", "type"="before-execution", "author"="mongock", "class"="SystemChangeUnit00001", "method"="beforeExecution"}
2024-02-20 11:58:48.479  INFO 26164 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[execution] with arguments: [io.mongock.driver.mongodb.springdata.v3.SpringDataMongoV3ChangeEntryRepository]
2024-02-20 11:58:48.482  INFO 26164 --- [           main] i.m.r.core.executor.ChangeExecutorBase   : APPLIED - {"id"="system-change-00001", "type"="execution", "author"="mongock", "class"="SystemChangeUnit00001", "method"="execution"}
2024-02-20 11:58:48.487  INFO 26164 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock waiting to release the lock
2024-02-20 11:58:48.488  INFO 26164 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock releasing the lock
2024-02-20 11:58:48.498  INFO 26164 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock released the lock
2024-02-20 11:58:48.498  INFO 26164 --- [           main] i.m.r.c.e.system.SystemUpdateExecutor    : Mongock has finished the system update execution
2024-02-20 11:58:48.500  INFO 26164 --- [           main] org.reflections.Reflections              : Reflections took 1 ms to scan 1 urls, producing 1 keys and 2 values
2024-02-20 11:58:48.503  INFO 26164 --- [           main] org.reflections.Reflections              : Reflections took 2 ms to scan 1 urls, producing 1 keys and 2 values
2024-02-20 11:58:48.510  INFO 26164 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock trying to acquire the lock
2024-02-20 11:58:48.513  INFO 26164 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock acquired the lock until: Tue Feb 20 11:59:48 IST 2024
2024-02-20 11:58:48.514  INFO 26164 --- [       Thread-3] i.m.driver.core.lock.LockManagerDefault  : Starting mongock lock daemon...
2024-02-20 11:58:48.517  INFO 26164 --- [           main] i.m.r.c.e.o.migrate.MigrateExecutorBase  : Mongock starting the data migration sequence id[2024-02-20T11:58:47.979947900-990]...
2024-02-20 11:58:48.518  INFO 26164 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[com.example.demo.migrate.DemoModelInit] with arguments: []
2024-02-20 11:58:48.626  INFO 26164 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[beforeExecution] with arguments: [org.springframework.data.mongodb.core.MongoTemplate]
2024-02-20 11:58:48.664  INFO 26164 --- [           main] i.m.r.core.executor.ChangeExecutorBase   : APPLIED - {"id"="demo-1_before", "type"="before-execution", "author"="mongock", "class"="DemoModelInit", "method"="beforeExecution"}
2024-02-20 11:58:48.670  INFO 26164 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[execution] with arguments: [jdk.proxy2.$Proxy58]
2024-02-20 11:58:48.740  INFO 26164 --- [           main] i.m.r.core.executor.ChangeExecutorBase   : APPLIED - {"id"="demo-1", "type"="execution", "author"="mongock", "class"="DemoModelInit", "method"="execution"}
2024-02-20 11:58:48.745  INFO 26164 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[com.example.demo.migrate.DemoModelUpdate] with arguments: []
2024-02-20 11:58:48.745  INFO 26164 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[execution] with arguments: [jdk.proxy2.$Proxy58]
2024-02-20 11:58:48.816  INFO 26164 --- [           main] i.m.r.core.executor.ChangeExecutorBase   : APPLIED - {"id"="demo-2", "type"="execution", "author"="mongock", "class"="DemoModelUpdate", "method"="execution"}
2024-02-20 11:58:48.820  INFO 26164 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock waiting to release the lock
2024-02-20 11:58:48.821  INFO 26164 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock releasing the lock
2024-02-20 11:58:48.826  INFO 26164 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock released the lock
2024-02-20 11:58:48.826  INFO 26164 --- [           main] i.m.r.c.e.o.migrate.MigrateExecutorBase  : Mongock has finished
```

