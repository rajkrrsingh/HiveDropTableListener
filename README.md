# HiveDropTableListener
sample metastore event listener which will trigger on the DropTable event

##### How to Build/Deploy
```kubernetes helm
mvn clean package
cd target
add the DropTableListener.jar to HiveServer2/HiveMetastore classpath

add following config to the hive-site.xml

hive.metastore.event.listeners=org.example.DropTableListener

Restart services
```

##### How to Test
```kubernetes helm
nnRun Drop table command after connecting to beeline and search for following long in HMS log
"Table dropped succesfully"
```

