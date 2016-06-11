
Il faut autoriser l'IP appelante dans l'admin JIRA
https://tempoplugin.jira.com/wiki/display/TEMPO/Access+Control

Il faut valoriser le parametre tempoApiToken=

Exemple de requête GET à l'API JIRA TEMPO
http://jira.svc.cat-amania.com/plugins/servlet/tempo-getWorklog/?dateFrom=2016-05-24&dateTo=2016-05-25&format=xml&diffOnly=false&tempoApiToken=

Génération des classes JAX-B (juste pour Worklogs.java)
D:\dt\jdk1.8.0_60\bin\xjc -d src -p com.catamania.model jira_tempo.xsd

pi@raspberrypi:~/dev/micro-tempo $ /home/pi/dev/apache-maven-3.3.9/bin/mvn clean compile assembly:single

pi@raspberrypi:~/dev/micro-tempo/target $ java -jar micro-tempo-1.0-SNAPSHOT-jar-with-dependencies.jar

Main class : com.catamania.main.StartMicroService
http://localhost:4567/api
http://192.168.0.32:4567/api

Standards REST :
https://api.github.com/
https://spring.io/understanding/HATEOAS