package InciandoNoSpring.PrimeiraAplicacao.Service;

import InciandoNoSpring.PrimeiraAplicacao.Model.M_Reserva;
import InciandoNoSpring.PrimeiraAplicacao.Model.M_Usuario;
import InciandoNoSpring.PrimeiraAplicacao.Repository.R_Usuario;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Time;

@Service
public class S_Usuario {
    private static R_Usuario usuario;

    public S_Usuario(R_Usuario usuario) {
        this.usuario = usuario;
    }

    public static M_Usuario checarLogin(String nome, String senha) {

        return usuario.findByUsuarioESenha(nome, senha);
    }

    public static void postUsuario( String usu, String senha) {
        M_Usuario modelUsuario = new M_Usuario();
        //modelUsuario.setId(id_user);
        modelUsuario.setUsuario(usu);
        modelUsuario.setSenha(senha);
        usuario.save(modelUsuario);

    }

}
