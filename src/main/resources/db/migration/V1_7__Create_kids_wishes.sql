CREATE TABLE KIDS_WISH
(
    ID INT GENERATED ALWAYS AS IDENTITY,
    KID_NAME VARCHAR(255),
    WISH VARCHAR(255),
    PRIMARY KEY(ID)
)