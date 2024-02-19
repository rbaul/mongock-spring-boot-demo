# Mongock Demo with Spring Boot 2 and 3

```log

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.2)

2024-02-19T22:21:18.962+02:00  INFO 23452 --- [           main] com.example.demo.DemoApplication         : Starting DemoApplication using Java 17.0.7 with PID 23452
2024-02-19T22:21:18.966+02:00  INFO 23452 --- [           main] com.example.demo.DemoApplication         : No active profile set, falling back to 1 default profile: "default"
2024-02-19T22:21:19.807+02:00  INFO 23452 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data MongoDB repositories in DEFAULT mode.
2024-02-19T22:21:19.894+02:00  INFO 23452 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 78 ms. Found 1 MongoDB repository interface.
2024-02-19T22:21:20.716+02:00  INFO 23452 --- [           main] org.mongodb.driver.client                : MongoClient with metadata {"driver": {"name": "mongo-java-driver|sync|spring-boot", "version": "4.11.1"}, "os": {"type": "Windows", "name": "Windows 10", "architecture": "amd64", "version": "10.0"}, "platform": "Java/Oracle Corporation/17.0.7+8-LTS-224"} created with settings MongoClientSettings{readPreference=primary, writeConcern=WriteConcern{w=null, wTimeout=null ms, journal=null}, retryWrites=true, retryReads=true, readConcern=ReadConcern{level=null}, credential=null, transportSettings=null, streamFactoryFactory=null, commandListeners=[], codecRegistry=ProvidersCodecRegistry{codecProviders=[ValueCodecProvider{}, BsonValueCodecProvider{}, DBRefCodecProvider{}, DBObjectCodecProvider{}, DocumentCodecProvider{}, CollectionCodecProvider{}, IterableCodecProvider{}, MapCodecProvider{}, GeoJsonCodecProvider{}, GridFSFileCodecProvider{}, Jsr310CodecProvider{}, JsonObjectCodecProvider{}, BsonCodecProvider{}, EnumCodecProvider{}, com.mongodb.client.model.mql.ExpressionCodecProvider@7c84195, com.mongodb.Jep395RecordCodecProvider@552ed807, com.mongodb.KotlinCodecProvider@3971f0fe]}, loggerSettings=LoggerSettings{maxDocumentLength=1000}, clusterSettings={hosts=[localhost:27017], srvServiceName=mongodb, mode=SINGLE, requiredClusterType=UNKNOWN, requiredReplicaSetName='null', serverSelector='null', clusterListeners='[]', serverSelectionTimeout='30000 ms', localThreshold='15 ms'}, socketSettings=SocketSettings{connectTimeoutMS=10000, readTimeoutMS=0, receiveBufferSize=0, proxySettings=ProxySettings{host=null, port=null, username=null, password=null}}, heartbeatSocketSettings=SocketSettings{connectTimeoutMS=10000, readTimeoutMS=10000, receiveBufferSize=0, proxySettings=ProxySettings{host=null, port=null, username=null, password=null}}, connectionPoolSettings=ConnectionPoolSettings{maxSize=100, minSize=0, maxWaitTimeMS=120000, maxConnectionLifeTimeMS=0, maxConnectionIdleTimeMS=0, maintenanceInitialDelayMS=0, maintenanceFrequencyMS=60000, connectionPoolListeners=[], maxConnecting=2}, serverSettings=ServerSettings{heartbeatFrequencyMS=10000, minHeartbeatFrequencyMS=500, serverListeners='[]', serverMonitorListeners='[]'}, sslSettings=SslSettings{enabled=false, invalidHostNameAllowed=false, context=null}, applicationName='null', compressorList=[], uuidRepresentation=JAVA_LEGACY, serverApi=null, autoEncryptionSettings=null, dnsClient=null, inetAddressResolver=null, contextProvider=null}
2024-02-19T22:21:20.762+02:00  INFO 23452 --- [localhost:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=localhost:27017, type=STANDALONE, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=8, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=50565135}
2024-02-19T22:21:21.625+02:00  INFO 23452 --- [           main] i.m.r.core.builder.RunnerBuilderBase     : Mongock runner COMMUNITY version[[]]
2024-02-19T22:21:21.636+02:00  INFO 23452 --- [           main] i.m.r.core.builder.RunnerBuilderBase     : Running Mongock with NO metadata
2024-02-19T22:21:21.636+02:00  WARN 23452 --- [           main] i.m.r.core.builder.RunnerBuilderBase     : Property transaction-enabled not provided. It will become true as default in next versions. Set explicit value to false in case transaction are not desired.
2024-02-19T22:21:21.636+02:00  WARN 23452 --- [           main] i.m.r.core.builder.RunnerBuilderBase     : Property transaction-enabled not provided and is unknown if driver is transactionable. BY DEFAULT MONGOCK WILL RUN IN NO-TRANSACTION MODE.
2024-02-19T22:21:22.128+02:00  INFO 23452 --- [           main] com.example.demo.DemoApplication         : Started DemoApplication in 4.225 seconds (process running for 5.763)
2024-02-19T22:21:22.268+02:00  INFO 23452 --- [           main] org.reflections.Reflections              : Reflections took 93 ms to scan 1 urls, producing 2 keys and 2 values
2024-02-19T22:21:22.279+02:00  INFO 23452 --- [           main] org.reflections.Reflections              : Reflections took 2 ms to scan 1 urls, producing 2 keys and 2 values
2024-02-19T22:21:22.329+02:00  INFO 23452 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock trying to acquire the lock
2024-02-19T22:21:22.381+02:00  INFO 23452 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock acquired the lock until: Mon Feb 19 22:22:22 IST 2024
2024-02-19T22:21:22.393+02:00  INFO 23452 --- [       Thread-2] i.m.driver.core.lock.LockManagerDefault  : Starting mongock lock daemon...
2024-02-19T22:21:22.403+02:00  INFO 23452 --- [           main] i.m.r.c.e.system.SystemUpdateExecutor    : Mongock starting the system update execution id[2024-02-19T22:21:21.625336300-508]...
2024-02-19T22:21:22.409+02:00  INFO 23452 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[io.mongock.runner.core.executor.system.changes.SystemChangeUnit00001] with arguments: []
2024-02-19T22:21:22.414+02:00  INFO 23452 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[beforeExecution] with arguments: [io.mongock.driver.mongodb.springdata.v4.SpringDataMongoV4ChangeEntryRepository]
2024-02-19T22:21:22.418+02:00  INFO 23452 --- [           main] i.m.r.core.executor.ChangeExecutorBase   : APPLIED - {"id"="system-change-00001_before", "type"="before-execution", "author"="mongock", "class"="SystemChangeUnit00001", "method"="beforeExecution"}
2024-02-19T22:21:22.428+02:00  INFO 23452 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[execution] with arguments: [io.mongock.driver.mongodb.springdata.v4.SpringDataMongoV4ChangeEntryRepository]
2024-02-19T22:21:22.433+02:00  INFO 23452 --- [           main] i.m.r.core.executor.ChangeExecutorBase   : APPLIED - {"id"="system-change-00001", "type"="execution", "author"="mongock", "class"="SystemChangeUnit00001", "method"="execution"}
2024-02-19T22:21:22.436+02:00  INFO 23452 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock waiting to release the lock
2024-02-19T22:21:22.437+02:00  INFO 23452 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock releasing the lock
2024-02-19T22:21:22.443+02:00  INFO 23452 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock released the lock
2024-02-19T22:21:22.443+02:00  INFO 23452 --- [           main] i.m.r.c.e.system.SystemUpdateExecutor    : Mongock has finished the system update execution
2024-02-19T22:21:22.456+02:00  INFO 23452 --- [           main] org.reflections.Reflections              : Reflections took 11 ms to scan 1 urls, producing 1 keys and 2 values
2024-02-19T22:21:22.463+02:00  INFO 23452 --- [           main] org.reflections.Reflections              : Reflections took 7 ms to scan 1 urls, producing 1 keys and 2 values
2024-02-19T22:21:22.471+02:00  INFO 23452 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock trying to acquire the lock
2024-02-19T22:21:22.475+02:00  INFO 23452 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock acquired the lock until: Mon Feb 19 22:22:22 IST 2024
2024-02-19T22:21:22.475+02:00  INFO 23452 --- [       Thread-3] i.m.driver.core.lock.LockManagerDefault  : Starting mongock lock daemon...
2024-02-19T22:21:22.477+02:00  INFO 23452 --- [           main] i.m.r.c.e.o.migrate.MigrateExecutorBase  : Mongock starting the data migration sequence id[2024-02-19T22:21:21.625336300-508]...
2024-02-19T22:21:22.477+02:00  INFO 23452 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[com.example.demo.migrate.DemoModelInit] with arguments: []
2024-02-19T22:21:22.555+02:00  INFO 23452 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[beforeExecution] with arguments: [org.springframework.data.mongodb.core.MongoTemplate]
2024-02-19T22:21:22.599+02:00  INFO 23452 --- [           main] i.m.r.core.executor.ChangeExecutorBase   : APPLIED - {"id"="demo-1_before", "type"="before-execution", "author"="mongock", "class"="DemoModelInit", "method"="beforeExecution"}
2024-02-19T22:21:22.608+02:00  INFO 23452 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[execution] with arguments: [jdk.proxy2.$Proxy63]
2024-02-19T22:21:22.751+02:00  INFO 23452 --- [           main] i.m.r.core.executor.ChangeExecutorBase   : APPLIED - {"id"="demo-1", "type"="execution", "author"="mongock", "class"="DemoModelInit", "method"="execution"}
2024-02-19T22:21:22.755+02:00  INFO 23452 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[com.example.demo.migrate.DemoModelUpdate] with arguments: []
2024-02-19T22:21:22.756+02:00  INFO 23452 --- [           main] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[execution] with arguments: [jdk.proxy2.$Proxy63]
2024-02-19T22:21:22.855+02:00  INFO 23452 --- [           main] i.m.r.core.executor.ChangeExecutorBase   : APPLIED - {"id"="demo-2", "type"="execution", "author"="mongock", "class"="DemoModelUpdate", "method"="execution"}
2024-02-19T22:21:22.865+02:00  INFO 23452 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock waiting to release the lock
2024-02-19T22:21:22.865+02:00  INFO 23452 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock releasing the lock
2024-02-19T22:21:22.867+02:00  INFO 23452 --- [           main] i.m.driver.core.lock.LockManagerDefault  : Mongock released the lock
2024-02-19T22:21:22.868+02:00  INFO 23452 --- [           main] i.m.r.c.e.o.migrate.MigrateExecutorBase  : Mongock has finished
```

