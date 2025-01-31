package dao;

import java.sql.Connection;

public class PgDAOFactory extends DAOFactory {

    public PgDAOFactory(Connection connection) {
        this.connection = connection;
    }

    @Override
    public LojaDAO getLojaDAO() {
        return new PgLojaDAO(this.connection);
    }

    @Override
    public PgScriptDAO getScriptDAO() {
        return new PgScriptDAO(this.connection);
    }

    @Override
    public ExecucaoScriptDAO getExecucaoScriptDAO() {
        return new ExecucaoScriptDAO(this.connection);
    }

    @Override
    public IngredienteDAO getIngredienteDAO() {
        return new IngredienteDAO(this.connection);
    }

    @Override
    public DestilariaDAO getDestilariaDAO() {
        return new DestilariaDAO(this.connection);
    }

    @Override
    public PgWhiskyDAO getWhiskyDAO() {
        return new PgWhiskyDAO(this.connection);
    }

    @Override
    public PaisDeOrigemDAO getPaisDeOrigemDAO() {
        return new PaisDeOrigemDAO(this.connection);
    }

    @Override
    public PgHistoricoDAO getHistoricoDAO() {
        return new PgHistoricoDAO(this.connection);
    }

    @Override
    public DestilariaUtilizaIngredienteDAO getDestilariaUtilizaIngredienteDAO() {
       return new DestilariaUtilizaIngredienteDAO(this.connection);
    }
}
