# The FormulaOne project
## Goals
The FormulaOne app displays and process the data of the Formula One World Championship.

The ultimate goal is to use different tools and frameworks from the open-source Java ecosystem.

This software is shit and doesn't come with warranty whatsoever.

## Tasks
 - [X] spring boot app
 - [ ] docker-compose : mysql, apis, ...
 - [ ] migrate to java 12  
 - [ ] Modules gradle : apis, java-streams, 
 - [ ] 

## Useful commands
export JAVA_HOME="/usr/lib/jvm/jdk-12.0.1"
export PATH=$JAVA_HOME/bin:$PATH


docker-compose rm -f -s -v && docker-compose up --build

docker exec -ti labsformulaone_db_1 bash
mysql -u userFormulaOne -p
    (passwordUserFormulaOne)
use formula_one_database;
show tables;


=======================
docker exec -i labsformulaone_db_1 sh -c 'exec mysql -u userFormulaOne --password=passwordUserFormulaOne formula_one_database' < f1db.sql
============================

## Useful resources
http://ergast.com/mrd/
https://spring.io/guides/gs/spring-boot-docker/