package InciandoNoSpring.ReservaHotelChaveEletronica.Controller;




import InciandoNoSpring.ReservaHotelChaveEletronica.Model.M_Usuario;
import InciandoNoSpring.ReservaHotelChaveEletronica.Service.S_Cadastro;
import InciandoNoSpring.ReservaHotelChaveEletronica.Service.S_Usuario;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class C_Cadastro {

private S_Cadastro s_cadastro;

    public C_Cadastro(S_Cadastro s_cadastro) {
        this.s_cadastro = s_cadastro;
    }

    @GetMapping("/cadastro")
    public String pagCadastro() {
        return "/cadastro";
    }


    @PostMapping("/cadastro")
    public ResponseEntity<String> postCadastro(@RequestBody M_Usuario m_usuario){
        try {
            // Passa os dados do usuário para o serviço que faz o registro
            s_cadastro.registroUsuario(m_usuario);
            return ResponseEntity.ok("Usuário registrado com sucesso!");
        } catch (RuntimeException e) {
            // Retorna erro caso algo dê errado (ex.: username já existe)
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
