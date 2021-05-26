CREATE TABLE tb_usuario(
idUsuario			SERIAL,
loginUsuario		VARCHAR(40),
senhaUsuario		VARCHAR(40),
CONSTRAINT pk_tb_usuario_idUsuario PRIMARY KEY(idUsuario)
);

CREATE TABLE tb_cliente(
idCliente			INTEGER NOT NULL,
nomeCliente			VARCHAR(60),
cpfCliente			VARCHAR(11),
rgCliente			VARCHAR(60),
estCivilClientE		VARCHAR(60),
emailCliente		VARCHAR(60),
sexoCliente			VARCHAR(60),
celularCliente		VARCHAR(60),
telefoneCliente		VARCHAR(60),
enderecoCliente		VARCHAR(60),
numero				VARCHAR(60),
bairro				VARCHAR(60),
cep					VARCHAR(60),
cidade				VARCHAR(60),
estado				VARCHAR(60),
CONSTRAINT pk_tb_clientes_idCliente PRIMARY KEY(idCliente),
CONSTRAINT fk_tb_cliente_idCliente FOREIGN KEY(idCliente)
	REFERENCES tb_usuario(idUsuario)
);

CREATE TABLE tb_administrador(
idAdministrador			INTEGER NOT NULL,
nomeAdministrador		VARCHAR(60),
cpfAdministrador		VARCHAR(11),
rgAdministrador			VARCHAR(60),
CONSTRAINT pk_tb_admin_idAdministrador PRIMARY KEY(idAdministrador),
CONSTRAINT fk_tb_admin_idAdministrador FOREIGN KEY(idAdministrador)
	REFERENCES tb_usuario(idUsuario)
);

CREATE TABLE tb_fornecedor(
idFornecedor			SERIAL,
nomeFornecedor			VARCHAR(60),
cnpjFornecedor			VARCHAR(14),
razaoSocialFornecedor	VARCHAR(60),
empresaFornecedor		VARCHAR(60),
emailFornecedor			VARCHAR(60),
enderecoFornecedor		VARCHAR(60),
bairro					VARCHAR(60),
numero					VARCHAR(60),
cidade					VARCHAR(60),
estado					VARCHAR(60),
cep						VARCHAR(60),
CONSTRAINT pk_tb_fornecedor_idFornecedor PRIMARY KEY(idFornecedor)
);

CREATE TABLE tb_produto(
idProduto			SERIAL,
idUsuario			INTEGER,
idFornecedor		INTEGER,
nomeProduto			VARCHAR(40),
categoriaProduto	VARCHAR(40),
codBarrasProduto	INTEGER,
valorProduto		NUMERIC,
precoVendaProduto	NUMERIC,
qtdProduto			INTEGER,
qtdMinimaProduto	INTEGER,
CONSTRAINT pk_tb_produto_idProduto PRIMARY KEY(idProduto),
CONSTRAINT fk_tb_produto_idFornecedor FOREIGN KEY(idFornecedor)
	REFERENCES tb_fornecedor(idFornecedor),
CONSTRAINT fk_tb_produto_idUsuario FOREIGN KEY(idUsuario)
	REFERENCES tb_usuario(idUsuario)
);

CREATE TABLE tb_comprador(
idComprador			SERIAL,
idFornecedor		SERIAL,
nomeComprador		VARCHAR(60),
CONSTRAINT pk_tb_comprador_idComprador PRIMARY KEY(idComprador),
CONSTRAINT fk_tb_comprador_idFornecedor FOREIGN KEY (idFornecedor)
	REFERENCES tb_fornecedor(idFornecedor)
);

CREATE TABLE tb_compra(
idCliente			SERIAL,
idProduto			SERIAL,
dataCompra			VARCHAR(60),
CONSTRAINT pk_tb_compra_idCliente_idProduto PRIMARY KEY(idCliente, idProduto),
CONSTRAINT fk_tb_compra_idCliente FOREIGN KEY(idCliente)
	REFERENCES tb_cliente(idCliente),
CONSTRAINT fk_tb_compra_idProduto FOREIGN KEY(idProduto)
	REFERENCES tb_produto(idProduto)
);