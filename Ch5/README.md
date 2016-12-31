inside hsqldb folder you can found the files to start hsqldb server, just execute:

```
java -cp <hsqldb.jar path> org.hsqldb.server.Server --database.0 file:spitter --dbname.0 spitter
```

also i'm using dbcp2 that means that you need use jdk 7 + to compile or change the dependency to dbcp and the datasource property from

```
<property name="maxTotal" value="10"/>
```
to
```
<property name="maxActive" value="10"/>
```