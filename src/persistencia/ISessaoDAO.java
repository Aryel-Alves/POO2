package persistencia;
import java.util.ArrayList; 
import negocio.Sessao;
/**
 *
 * @author Aryel
 */
public interface ISessaoDAO {
    public void adiciona(Sessao uma_sessao);
    public void altera(Sessao uma_sessao);
    public void remove(int id);
    public ArrayList<Sessao> listarTodos();
    public Sessao getByID(int id);
}
