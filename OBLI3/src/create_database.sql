create table ANSATT (
    AnsattID INT PRIMARY KEY,
    Brukernavn VARCHAR(4) PRIMARY KEY,
    Fornavn VARCHAR(50),
    Etternavn VARCHAR(50),
    Ansettelsesdato DATE,
    Stilling VARCHAR(50),
    Maanedslonn DECIMAL(10, 2),
    AvdelingID INT,
    ProsjekterID INT,
    FOREIGN KEY (AvdelingID) REFERENCES Avdeling(AvdelingID),
    FOREIGN KEY (ProsjektID) REFERENCES Prosjekt(ProsjektID),




)
