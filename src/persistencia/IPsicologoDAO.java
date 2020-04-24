package persistencia;
import negocio.Psicologo;
import java.util.ArrayList; 
/**
 *
 * @author Aryel
 */
public interface IPsicologoDAO {
    public void adiciona(Psicologo um_psicologo);
    public void altera(Psicologo um_psicologo);
    public void remove(int id);
    public ArrayList<Psicologo> listarTodos();
    public Psicologo getByID(int id);
}
