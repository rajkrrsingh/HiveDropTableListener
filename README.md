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
If you are facing issues in deploying JAR on HDP platform please have a look at following question from cloudera community:
https://community.cloudera.com/t5/Support-Questions/HiveMetaStore-logs-not-showing-logs-from-custom-event/td-p/298988

##### How to Test
```kubernetes helm
nnRun Drop table command after connecting to beeline and search for following long in HMS log
"Table dropped succesfully"
```

