

  create table medicos(

        id varchar(100) not null  default (uuid()),
        nome varchar(100) not null,
        email varchar(100) not null unique,
        crm varchar(6) not null unique,
        especialidade varchar(100) not null,



        primary key(id)

    );
