# The FormulaOne project
## Goals
The FormulaOne project intends to

## Tasks
 - [ ] spring boot app
 - [ ] dockeriser : labsFormulaOne, mysql 
 - [ ] Modules gradle : apis, java-streams, 
 - [ ] 

## Useful commands
docker-compose
docker exec -ti labsformulaone_db_1 bash
mysql -u userFormulaOne -p
    (passwordUserFormulaOne)
use formula_one_database;
show tables;

export JAVA_HOME="/usr/lib/jvm/jdk-12.0.1"
export PATH=$JAVA_HOME/bin:$PATH
=======================
docker exec -i labsformulaone_db_1 sh -c 'exec mysql -u userFormulaOne --password=passwordUserFormulaOne formula_one_database' < f1db.sql


