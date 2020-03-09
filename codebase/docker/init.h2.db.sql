create table users(
    id serial,
    first_name varchar(100),
    last_name varchar(100),
    age integer
);

insert into users(first_name, last_Name, age) values ('Jan', 'Kowalski', 45);
insert into users(first_name, last_Name, age) values ('Jan', 'Nowak', 33);
insert into users(first_name, last_Name, age) values ('Jerzy', 'Malinowski', 50);
insert into users(first_name, last_Name, age) values ('Maciej', 'Kwiatkowski', 11);