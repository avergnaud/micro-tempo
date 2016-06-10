
Il faut autoriser l'IP appelante dans l'admin JIRA
https://tempoplugin.jira.com/wiki/display/TEMPO/Access+Control

Il faut valoriser le parametre tempoApiToken=

Exemple de requête GET à l'API JIRA TEMPO
http://jira.svc.cat-amania.com/plugins/servlet/tempo-getWorklog/?dateFrom=2016-05-24&dateTo=2016-05-25&format=xml&diffOnly=false&tempoApiToken=72711f14-8af7-47b5-adbc-4a062b8a8996

Génération des classes JAX-B (juste pour Worklogs.java)
D:\dt\jdk1.8.0_60\bin\xjc -d src -p com.catamania.model jira_tempo.xsd

Main class : com.catamania.main.StartMicroService
http://localhost:4567/api

Standards REST :
https://api.github.com/
https://spring.io/understanding/HATEOAS