package InciandoNoSpring.ReservaHotelChaveEletronica.Service;


import InciandoNoSpring.ReservaHotelChaveEletronica.Model.M_Cadastro;
import InciandoNoSpring.ReservaHotelChaveEletronica.Repository.R_Cadastro;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class S_Cadastro {

    private static R_Cadastro repositorioCadastro;

    public S_Cadastro(R_Cadastro repositorioCadastro) {
        this.repositorioCadastro = repositorioCadastro;
    }

    public static void postCadastro(String nome, String usuario, String senha, String endereco){
        M_Cadastro modelCadastro = new M_Cadastro();
        modelCadastro.setNome(nome);
        modelCadastro.setUsuario(usuario);
        modelCadastro.setSenha(senha);
        modelCadastro.setEndereco(endereco);
        repositorioCadastro.save(modelCadastro);
    }
}
