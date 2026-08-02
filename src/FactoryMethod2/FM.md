Questão 14 (Implementação - Factory Method)
Crie a estrutura de um Factory Method para gerar conexões fictícias de banco de dados:

Interface Conexao com o método void conectar().

Implementações: ConexaoPostgreSQL e ConexaoMySQL.

Classe abstrata CriadorConexao com o método abstrato Conexao criarConexao().

Fábricas concretas: CriadorPostgreSQL e CriadorMySQL.