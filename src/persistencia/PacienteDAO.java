package persistencia;

import negocio.Paciente;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aryel
 */
public class PacienteDAO implements IPacienteDAO {
    public static String CAMINHO_ARQUIVOS = System.getProperty("user.home") + "/Desktop/";
    
    @Override
    public void adiciona(Paciente um_paciente)  {
        String nomeDoArquivo = um_paciente.getNome().replaceAll(" ","") + um_paciente.getNome().hashCode()+ ".json";
        File arquivo = new File( CAMINHO_ARQUIVOS + nomeDoArquivo );

        try {
            if (!arquivo.exists()){
                arquivo.createNewFile();
            }
            
            FileWriter fw = new FileWriter( arquivo );
            BufferedWriter bw = new BufferedWriter( fw );
            bw.write( um_paciente.toString() );

            bw.close();
            fw.close();     
        } catch (IOException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
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
