package InciandoNoSpring.PrimeiraAplicacao.Controller;


import InciandoNoSpring.PrimeiraAplicacao.Service.S_Cadastro;
import InciandoNoSpring.PrimeiraAplicacao.Service.S_Usuario;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



@Controller

public class C_Cadastro {


    @GetMapping("/cadastro")
    public ModelAndView getFormAdd() {
        ModelAndView mv = new ModelAndView("cadastro");
        return mv;
    }

    @PostMapping("/cadastro")
    public String salvaCadastro(@RequestParam("nome") String nome, @RequestParam("usuario") String usuario, @RequestParam("senha") String senha, @RequestParam("endereco") String endereco, HttpSession session, HttpServletRequest request) {

        S_Cadastro.postCadastro(nome, usuario, senha, endereco);
        S_Usuario.postUsuario(usuario, senha);
        return "redirect:/";
    }

//    @PostMapping("/cadastro")
//    public M_Cadastro salvaCadastro(@RequestBody M_Cadastro cadastro) {
//        return repositorioCadastro.save(cadastro);
//    }

//    @PutMapping("/cadastro")
//    public M_Cadastro atualizaCadastro(@RequestBody M_Cadastro cadastro){
//       return repositorioCadastro.save(cadastro);
//    }
//
//    @DeleteMapping("/cadastro")
//    public void deletaCadastro(@RequestBody M_Cadastro cadastro){
//        repositorioCadastro.delete(cadastro);
//    }
}
