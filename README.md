# Wisconsin Benchmark

## Description

The main objective of this part is to generate the data based on the Wisconsin benchmark specification. We created three tables namely ONEKTUP which contains 1000 tuples, TENKTUP1 and TENKTUP2 which contains 10,000 tuples in each table. We generated the data using a script developed in java. The scripts generates the data and inserts the data directly to the PostgreSQL.


## System

We are using PostgreSQL for this project. It is very reliable and is easy to use we did our CS586 project in PostgreSQL so we are quite comfortable using it. We used Java for generating the data. 


## Generate Data

The Benchmark data set (onektup, tenktup1, and tenktup2) generated from java application. The remote Java application connect to *postgres server* running on GCP VMs. 
Program connect to postgres server on GCP > Generate the table > Insert the data to table
The full database is uploaded in csv format on repo too. 

### Prequisites: 
* Create a VM on GCP
* Configure postgres on created VM (https://cloud.google.com/community/tutorials/setting-up-postgres) 
* Allow remote ip to connect to postgres server

##### Establish GCP server
![Establish GCP server](https://github.com/GouthamC7/Database_Implementation/blob/main/Google_vms.png)


##### Connecting to postgres server using psql shell on remote computer and display database
![Establish connection to GCP VMs (postgres loaded)](https://github.com/GouthamC7/Database_Implementation/blob/main/connection_to_psql_GCP_vms.png)

##### List of tables in postgres
![List of tables](https://github.com/GouthamC7/Database_Implementation/blob/main/list_tables.png)

##### Display tuples of the onektup table
![display tuples](https://github.com/GouthamC7/Database_Implementation/blob/main/display_record_from_onektup.png)

##### Display tuples on pgAdmin4 interface. The data has been pulling from the postgres remote server
![display tuples](https://github.com/GouthamC7/Database_Implementation/blob/main/access_server-throgh_pgadmin4.png) 

##### Data file available on github repo too


##  Lessons learned or issues encountered

### Issues: 
##### SqlJDBC library not found
* We encounted this issue when ran the program. After downloading postgres jdbc driver from postgres site. The .jar file has been added to program library. This fixed the issue. 
##### Program can't connect to remote server
* This issue has fixed after allowing access to laptop's ipv4 address to vm server
##### Issue with generating String4 value 

### Lessons:
* Learn Wisconsin benchmark specification and what the attributes are what they hold
* How to connect a java program to the local PostgreSQL and remote postgres serrver running on GCP platform

## Project partner

* Goutham 
* Deep
