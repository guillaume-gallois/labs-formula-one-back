# The FormulaOne project
## Goals
The FormulaOne app displays and process the data of the Formula One World Championship.

The ultimate goal is to use different tools and frameworks from the open-source Java ecosystem.

This software is shitty and doesn't come with warranty whatsoever.

## Tasks
 - [X] spring boot app
 - [ ] docker-compose : mysql, apis, ...
 - [ ] migrate to java 12  
 - [ ] Modules gradle : apis, java-streams

## Useful commands
source /home/guillaume/tk/scripts/8.sh
### run formula_one_database
docker-compose rm -f -s -v && docker-compose up --build
docker exec -ti labsformulaone_db_1 bash
mysql -u userFormulaOne -p
    (passwordUserFormulaOne)
use formula_one_database;
show tables;

### run spring boot app
./gradlew build && java -jar build/libs/labsFormulaOne-0.1.0.jar

./gradlew build docker

## Useful resources
http://ergast.com/mrd/
https://spring.io/guides/gs/spring-boot-docker/