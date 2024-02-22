# Mongock Demo with Spring Boot 2 and 3

```log

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::               (v2.7.18)

2024-02-22 13:10:37.527  INFO 26936 --- [           main] com.example.demo.DemoApplication         : Starting DemoApplication using Java 17.0.7 on RBAUL02 with PID 26936 (C:\github\experements\mongock-demo\build\classes\java\main started by rbaul in C:\github\experements\mongock-demo)
2024-02-22 13:10:37.533  INFO 26936 --- [           main] com.example.demo.DemoApplication         : No active profile set, falling back to 1 default profile: "default"
2024-02-22 13:10:38.230  INFO 26936 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data MongoDB repositories in DEFAULT mode.
2024-02-22 13:10:38.301  INFO 26936 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 63 ms. Found 1 MongoDB repository interfaces.
2024-02-22 13:10:38.917  INFO 26936 --- [           main] org.mongodb.driver.client                : MongoClient with metadata {"driver": {"name": "mongo-java-driver|sync|spring-boot", "version": "4.6.1"}, "os": {"type": "Windows", "name": "Windows 10", "architecture": "amd64", "version": "10.0"}, "platform": "Java/Oracle Corporation/17.0.7+8-LTS-224"} created with settings MongoClientSettings{readPreference=primary, writeConcern=WriteConcern{w=null, wTimeout=null ms, journal=null}, retryWrites=true, retryReads=true, readConcern=ReadConcern{level=null}, credential=null, streamFactoryFactory=null, commandListeners=[], codecRegistry=ProvidersCodecRegistry{codecProviders=[ValueCodecProvider{}, BsonValueCodecProvider{}, DBRefCodecProvider{}, DBObjectCodecProvider{}, DocumentCodecProvider{}, IterableCodecProvider{}, MapCodecProvider{}, GeoJsonCodecProvider{}, GridFSFileCodecProvider{}, Jsr310CodecProvider{}, JsonObjectCodecProvider{}, BsonCodecProvider{}, EnumCodecProvider{}, com.mongodb.Jep395RecordCodecProvider@60d1b21f]}, clusterSettings={hosts=[localhost:27017], srvServiceName=mongodb, mode=SINGLE, requiredClusterType=UNKNOWN, requiredReplicaSetName='null', serverSelector='null', clusterListeners='[]', serverSelectionTimeout='30000 ms', localThreshold='30000 ms'}, socketSettings=SocketSettings{connectTimeoutMS=10000, readTimeoutMS=0, receiveBufferSize=0, sendBufferSize=0}, heartbeatSocketSettings=SocketSettings{connectTimeoutMS=10000, readTimeoutMS=10000, receiveBufferSize=0, sendBufferSize=0}, connectionPoolSettings=ConnectionPoolSettings{maxSize=100, minSize=0, maxWaitTimeMS=120000, maxConnectionLifeTimeMS=0, maxConnectionIdleTimeMS=0, maintenanceInitialDelayMS=0, maintenanceFrequencyMS=60000, connectionPoolListeners=[], maxConnecting=2}, serverSettings=ServerSettings{heartbeatFrequencyMS=10000, minHeartbeatFrequencyMS=500, serverListeners='[]', serverMonitorListeners='[]'}, sslSettings=SslSettings{enabled=false, invalidHostNameAllowed=false, context=null}, applicationName='null', compressorList=[], uuidRepresentation=JAVA_LEGACY, serverApi=null, autoEncryptionSettings=null, contextProvider=null}
2024-02-22 13:10:38.943  INFO 26936 --- [localhost:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:1, serverValue:125}] to localhost:27017
2024-02-22 13:10:38.943  INFO 26936 --- [localhost:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:2, serverValue:126}] to localhost:27017
2024-02-22 13:10:38.943  INFO 26936 --- [localhost:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=localhost:27017, type=STANDALONE, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=8, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=43349915}
2024-02-22 13:10:39.549  INFO 26936 --- [           main] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:3, serverValue:127}] to localhost:27017
2024-02-22 13:10:39.745  INFO 26936 --- [           main] i.m.r.core.builder.RunnerBuilderBase     : Mongock runner COMMUNITY version[5.2.2]
2024-02-22 13:10:39.748  INFO 26936 --- [           main] i.m.r.core.builder.RunnerBuilderBase     : Running Mongock with NO metadata
2024-02-22 13:10:39.748  WARN 26936 --- [           main] i.m.r.core.builder.RunnerBuilderBase     : Property transaction-enabled not provided. It will become true as default in next versions. Set explicit value to false in case transaction are not desired.
2024-02-22 13:10:39.748  WARN 26936 --- [           main] i.m.r.core.builder.RunnerBuilderBase     : Property transaction-enabled not provided and is unknown if driver is transactionable. BY DEFAULT MONGOCK WILL RUN IN NO-TRANSACTION MODE.
2024-02-22 13:10:40.012  INFO 26936 --- [           main] com.example.demo.DemoApplication         : Started DemoApplication in 3.426 seconds (JVM running for 4.116)
2024-02-22 13:10:40.135  INFO 26936 --- [           main] org.reflections.Reflections              : Reflections took 62 ms to scan 1 urls, producing 2 keys and 2 values
2024-02-22 13:10:40.145  INFO 26936 --- [           main] org.reflections.Reflections              : Reflections took 2 ms to scan 1 urls, producing 2 keys and 2 values
2024-02-22 13:10:40.182  INFO 26936 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock trying to acquire the lock
2024-02-22 13:10:40.247  INFO 26936 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock acquired the lock until: Thu Feb 22 13:11:40 IST 2024
2024-02-22 13:10:40.258  INFO 26936 --- [       Thread-2] i.m.driver.core.lock.LockManagerDefault  : Starting mongock lock daemon...
2024-02-22 13:10:40.260  INFO 26936 --- [           main] i.m.r.c.e.system.SystemUpdateExecutor    : Mongock starting the system update execution id[2024-02-22T13:10:39.743401800-88]...
2024-02-22 13:10:40.262  INFO 26936 --- [       Thread-2] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:4, serverValue:128}] to localhost:27017
2024-02-22 13:10:40.267  INFO 26936 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[io.mongock.runner.core.executor.system.changes.SystemChangeUnit00001] with arguments: []
2024-02-22 13:10:40.271  INFO 26936 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[beforeExecution] with arguments: [io.mongock.driver.mongodb.springdata.v3.SpringDataMongoV3ChangeEntryRepository]
2024-02-22 13:10:40.273  INFO 26936 --- [           main] i.m.r.core.executor.ChangeExecutorBase   : APPLIED - {"id"="system-change-00001_before", "type"="before-execution", "author"="mongock", "class"="SystemChangeUnit00001", "method"="beforeExecution"}
2024-02-22 13:10:40.282  INFO 26936 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[execution] with arguments: [io.mongock.driver.mongodb.springdata.v3.SpringDataMongoV3ChangeEntryRepository]
2024-02-22 13:10:40.286  INFO 26936 --- [           main] i.m.r.core.executor.ChangeExecutorBase   : APPLIED - {"id"="system-change-00001", "type"="execution", "author"="mongock", "class"="SystemChangeUnit00001", "method"="execution"}
2024-02-22 13:10:40.291  INFO 26936 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock waiting to release the lock
2024-02-22 13:10:40.291  INFO 26936 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock releasing the lock
2024-02-22 13:10:40.296  INFO 26936 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock released the lock
2024-02-22 13:10:40.296  INFO 26936 --- [           main] i.m.r.c.e.system.SystemUpdateExecutor    : Mongock has finished the system update execution
2024-02-22 13:10:40.315  INFO 26936 --- [           main] org.reflections.Reflections              : Reflections took 17 ms to scan 1 urls, producing 1 keys and 2 values
2024-02-22 13:10:40.323  INFO 26936 --- [           main] org.reflections.Reflections              : Reflections took 7 ms to scan 1 urls, producing 1 keys and 2 values
2024-02-22 13:10:40.331  INFO 26936 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock trying to acquire the lock
2024-02-22 13:10:40.334  INFO 26936 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock acquired the lock until: Thu Feb 22 13:11:40 IST 2024
2024-02-22 13:10:40.335  INFO 26936 --- [       Thread-3] i.m.driver.core.lock.LockManagerDefault  : Starting mongock lock daemon...
2024-02-22 13:10:40.337  INFO 26936 --- [           main] i.m.r.c.e.o.migrate.MigrateExecutorBase  : Mongock starting the data migration sequence id[2024-02-22T13:10:39.743401800-88]...
2024-02-22 13:10:40.338  INFO 26936 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[com.example.demo.migrate.DemoModelInit] with arguments: []
2024-02-22 13:10:40.395  INFO 26936 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[beforeExecution] with arguments: [org.springframework.data.mongodb.core.MongoTemplate]
2024-02-22 13:10:40.426  INFO 26936 --- [           main] i.m.r.core.executor.ChangeExecutorBase   : APPLIED - {"id"="demo-1_before", "type"="before-execution", "author"="mongock", "class"="DemoModelInit", "method"="beforeExecution"}
2024-02-22 13:10:40.435  INFO 26936 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[execution] with arguments: [jdk.proxy2.$Proxy59]
2024-02-22 13:10:40.581  INFO 26936 --- [           main] i.m.r.core.executor.ChangeExecutorBase   : APPLIED - {"id"="demo-1", "type"="execution", "author"="mongock", "class"="DemoModelInit", "method"="execution"}
2024-02-22 13:10:40.587  INFO 26936 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[com.example.demo.migrate.DemoModelUpdate] with arguments: []
2024-02-22 13:10:40.588  INFO 26936 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[execution] with arguments: [jdk.proxy2.$Proxy59]
2024-02-22 13:10:40.674  INFO 26936 --- [           main] i.m.r.core.executor.ChangeExecutorBase   : APPLIED - {"id"="demo-2", "type"="execution", "author"="mongock", "class"="DemoModelUpdate", "method"="execution"}
2024-02-22 13:10:40.676  INFO 26936 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock waiting to release the lock
2024-02-22 13:10:40.676  INFO 26936 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock releasing the lock
2024-02-22 13:10:40.679  INFO 26936 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock released the lock
2024-02-22 13:10:40.679  INFO 26936 --- [           main] i.m.r.c.e.o.migrate.MigrateExecutorBase  : Mongock has finished
```

