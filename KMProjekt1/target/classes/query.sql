use projekt;
create table IF NOT EXISTS Czlowiek (
    ID int(2) NOT NULL,
    Ulica varchar(30),
    Nr_domu int(3) NOT NULL,
    Nr_mieszkania int(3),
    Miasto varchar(30) NOT NULL,
    Kod_pocztowy varchar(6) NOT NULL,
    primary key (ID)
);