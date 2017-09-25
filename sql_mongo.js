// Criar as pastas 
D:\mongodb\data
D:\mongodb\log\mongo.log

// incluir as config e o arquivo d:\mongodb\mongo.config

##store data here
dbpath=D:\mongodb\data

##all output go here
logpath=D:\mongodb\log\mongo.log

##log read and write operations
diaglog=3


// criando database
use database_omc

//use database
use omc


// criando usuario
db.createUser(
{
    user: "root",
    pwd: "root",
    roles: [
              { role: "userAdminAnyDatabase", db: "admin" },
              { role: "readWriteAnyDatabase", db: "admin" },
              { role: "dbAdminAnyDatabase", db: "admin" },
              { role: "clusterAdmin", db: "admin" }
           ]
})


// Criando uma collection
db.createCollection("mycollection"){"ok":1}
db.createCollection("mycol",{ capped :true, autoIndexID :true, size :6142800, max :10000}){"ok":1}


//insert na collection
db.item.insert({"_class" : "org.omc.seguro.mongo.domain.ItemDomain", "cdItem" : NumberLong(1), "tpHistoItem" : "0", "cdApoli" : NumberLong(1), "cdApoliSusepRenov" : NumberLong(1), "cdClien" : NumberLong(1), "cdEndos" : NumberLong(1), "cdNgoco" : NumberLong(1), "tpHistoNgoco" : "0", "cdMdupr" : NumberLong(1), "dtUltmaAlter" : ISODate("2017-09-23T03:00:00Z"), "dtEmissItem" : ISODate("2017-09-23T03:00:00Z")})

// Consultando uma collection
db.item.fin()



