

## create a database "simple_crud"


## create a table with the following fields

create table employees
(
    id         varchar(100) null,
    name       varchar(50)  not null,
    mobile     varchar(20)  not null,
    salary     double       not null,
    created_at datetime     not null
);