package InciandoNoSpring.ReservaHotelChaveEletronica.Service;



import InciandoNoSpring.ReservaHotelChaveEletronica.Model.M_Usuario;
import InciandoNoSpring.ReservaHotelChaveEletronica.Repository.R_Cadastro;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class S_Cadastro {

    private static R_Cadastro repositorioCadastro;

    public S_Cadastro(R_Cadastro repositorioCadastro) {
        this.repositorioCadastro = repositorioCadastro;
    }

    public static void registroUsuario(M_Usuario m_usuario){
        repositorioCadastro.save(m_usuario);
    }
}
