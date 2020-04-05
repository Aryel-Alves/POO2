package persistencia;

import negocio.Paciente;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aryel
 */
public class PacienteDAO implements IPacienteDAO {
    private Connection connection;
    public static String CAMINHO_ARQUIVOS = System.getProperty("user.home") + "/Desktop/";
    
    public PacienteDAO(){
        this.connection = new ConFactory().getConnection();
    }
    
    @Override
    public void adiciona(Paciente paciente)  {
        String sql = "insert into paciente " + 
                "(nome, cpf, data_nascimento, sexo, endereco, telefone, foto, plano_saude, observacoes, data_cadastro)" +
                " values (?,?,?,?,?,?,?,?,?,now())";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, paciente.getNome());
            stmt.setString(2, paciente.getCpf());
            stmt.setDate(3, (java.sql.Date) new java.sql.Date(paciente.getData_nascimento().getTimeInMillis()));
            stmt.setString(4, paciente.getSexo());
            stmt.setString(5, paciente.getEndereco());
            stmt.setString(6, paciente.getTelefone());
            stmt.setString(7, paciente.getFoto());
            stmt.setString(8, paciente.getPlano_saude());
            stmt.setString(9, paciente.getObservacoes());
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void altera(Paciente um_paciente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        //arquivo.delete();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Paciente> listarTodos() {
        //File arquivo = new File( CAMINHO_ARQUIVOS );
        //File [] arquivos = arquivo.listFiles();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Paciente getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
