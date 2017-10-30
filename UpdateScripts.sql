--TESTES COM UPDATE

UPDATE AREA_PESQUISA SET DESCRICAO = 'C++', INDICE_RELEVANCIA = 4
WHERE CODIGO = 104

UPDATE AREA_PESQUISA SET NOME = 'Programação' 
WHERE NOME = 'Linguagem'

--teste modificando uma chave primária para um valor que já existe
--VAI DAR ERRO
UPDATE AREA_PESQUISA SET CODIGO = 101
WHERE CODIGO = 106

--tentativa de salvar null em um campo not null
UPDATE AREA_PESQUISA SET NOME = NULL
WHERE CODIGO = 101

