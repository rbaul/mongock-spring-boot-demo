# Mongock cloudyrock (Deprecated) Demo with Spring Boot 2 and 3

```log
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.2)

2024-02-20T10:19:12.597+02:00  INFO 21940 --- [           main] com.example.demo.DemoApplication         : Starting DemoApplication using Java 17.0.7 with PID 21940 (C:\github\experements\mongock-demo\build\classes\java\main started by rbaul in C:\github\experements\mongock-demo)
2024-02-20T10:19:12.603+02:00  INFO 21940 --- [           main] com.example.demo.DemoApplication         : No active profile set, falling back to 1 default profile: "default"
2024-02-20T10:19:13.691+02:00  INFO 21940 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data MongoDB repositories in DEFAULT mode.
2024-02-20T10:19:13.845+02:00  INFO 21940 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 136 ms. Found 1 MongoDB repository interface.
2024-02-20T10:19:14.671+02:00  INFO 21940 --- [           main] org.mongodb.driver.client                : MongoClient with metadata {"driver": {"name": "mongo-java-driver|sync|spring-boot", "version": "4.11.1"}, "os": {"type": "Windows", "name": "Windows 10", "architecture": "amd64", "version": "10.0"}, "platform": "Java/Oracle Corporation/17.0.7+8-LTS-224"} created with settings MongoClientSettings{readPreference=primary, writeConcern=WriteConcern{w=null, wTimeout=null ms, journal=null}, retryWrites=true, retryReads=true, readConcern=ReadConcern{level=null}, credential=null, transportSettings=null, streamFactoryFactory=null, commandListeners=[], codecRegistry=ProvidersCodecRegistry{codecProviders=[ValueCodecProvider{}, BsonValueCodecProvider{}, DBRefCodecProvider{}, DBObjectCodecProvider{}, DocumentCodecProvider{}, CollectionCodecProvider{}, IterableCodecProvider{}, MapCodecProvider{}, GeoJsonCodecProvider{}, GridFSFileCodecProvider{}, Jsr310CodecProvider{}, JsonObjectCodecProvider{}, BsonCodecProvider{}, EnumCodecProvider{}, com.mongodb.client.model.mql.ExpressionCodecProvider@506dcf55, com.mongodb.Jep395RecordCodecProvider@270b6b5e, com.mongodb.KotlinCodecProvider@7e94d093]}, loggerSettings=LoggerSettings{maxDocumentLength=1000}, clusterSettings={hosts=[localhost:27017], srvServiceName=mongodb, mode=SINGLE, requiredClusterType=UNKNOWN, requiredReplicaSetName='null', serverSelector='null', clusterListeners='[]', serverSelectionTimeout='30000 ms', localThreshold='15 ms'}, socketSettings=SocketSettings{connectTimeoutMS=10000, readTimeoutMS=0, receiveBufferSize=0, proxySettings=ProxySettings{host=null, port=null, username=null, password=null}}, heartbeatSocketSettings=SocketSettings{connectTimeoutMS=10000, readTimeoutMS=10000, receiveBufferSize=0, proxySettings=ProxySettings{host=null, port=null, username=null, password=null}}, connectionPoolSettings=ConnectionPoolSettings{maxSize=100, minSize=0, maxWaitTimeMS=120000, maxConnectionLifeTimeMS=0, maxConnectionIdleTimeMS=0, maintenanceInitialDelayMS=0, maintenanceFrequencyMS=60000, connectionPoolListeners=[], maxConnecting=2}, serverSettings=ServerSettings{heartbeatFrequencyMS=10000, minHeartbeatFrequencyMS=500, serverListeners='[]', serverMonitorListeners='[]'}, sslSettings=SslSettings{enabled=false, invalidHostNameAllowed=false, context=null}, applicationName='null', compressorList=[], uuidRepresentation=JAVA_LEGACY, serverApi=null, autoEncryptionSettings=null, dnsClient=null, inetAddressResolver=null, contextProvider=null}
2024-02-20T10:19:14.700+02:00  INFO 21940 --- [localhost:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=localhost:27017, type=STANDALONE, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=8, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=44631622}
2024-02-20T10:19:15.770+02:00  INFO 21940 --- [           main] com.example.demo.DemoApplication         : Started DemoApplication in 4.333 seconds (process running for 5.046)
2024-02-20T10:19:15.957+02:00  INFO 21940 --- [           main] c.g.c.m.d.core.lock.DefaultLockManager   : Mongock trying to acquire the lock
2024-02-20T10:19:15.997+02:00  INFO 21940 --- [           main] c.g.c.m.d.core.lock.DefaultLockManager   : Mongock acquired the lock until: Tue Feb 20 10:22:15 IST 2024
2024-02-20T10:19:16.006+02:00  INFO 21940 --- [           main] c.g.c.m.r.c.executor.MigrationExecutor   : Mongock starting the data migration sequence id[2024-02-20T10:19:15.999256100-316]...
2024-02-20T10:19:16.024+02:00  INFO 21940 --- [           main] c.g.c.m.r.c.executor.MigrationExecutor   : method[execution] with arguments: [jdk.proxy2.$Proxy67]
2024-02-20T10:19:16.124+02:00  INFO 21940 --- [           main] c.g.c.m.r.c.executor.MigrationExecutor   : APPLIED - ChangeEntry{, "id"="demo-1", "author"="mongock", "class"="DemoModelInit", "method"="execution"}
2024-02-20T10:19:16.154+02:00  INFO 21940 --- [           main] c.g.c.m.r.c.executor.MigrationExecutor   : method[execution] with arguments: [jdk.proxy2.$Proxy67]
2024-02-20T10:19:16.221+02:00  INFO 21940 --- [           main] c.g.c.m.r.c.executor.MigrationExecutor   : APPLIED - ChangeEntry{, "id"="demo-2", "author"="mongock", "class"="DemoModelUpdate", "method"="execution"}
2024-02-20T10:19:16.225+02:00  INFO 21940 --- [           main] c.g.c.m.d.core.lock.DefaultLockManager   : Mongock releasing the lock
2024-02-20T10:19:16.233+02:00  INFO 21940 --- [           main] c.g.c.m.d.core.lock.DefaultLockManager   : Mongock released the lock
2024-02-20T10:19:16.233+02:00  INFO 21940 --- [           main] c.g.c.m.r.c.executor.MigrationExecutor   : Mongock has finished
```

