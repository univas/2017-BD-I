CREATE TABLE EVENTO (
CODIGO INTEGER NOT NULL,
ENTRADA DATE NOT NULL,
SAIDA TIMESTAMP,
DOCUMENTO BYTEA
);

ALTER TABLE EVENTO ADD CONSTRAINT EVENTO_pk PRIMARY KEY (CODIGO);

--Exemplos de consultas com datas
SELECT date_trunc('minute', saida), now(), extract (month from entrada) FROM EVENTO;


SELECT entrada, date_trunc('minute', saida), now(), extract (day from entrada)
FROM EVENTO e
WHERE e.entrada > '2017-11-10' AND e.entrada < '2017-11-14'

