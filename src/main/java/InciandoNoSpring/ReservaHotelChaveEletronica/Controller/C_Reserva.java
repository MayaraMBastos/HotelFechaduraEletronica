package InciandoNoSpring.ReservaHotelChaveEletronica.Controller;





import InciandoNoSpring.ReservaHotelChaveEletronica.Model.M_Reserva;
import InciandoNoSpring.ReservaHotelChaveEletronica.Repository.R_Reserva;
import InciandoNoSpring.ReservaHotelChaveEletronica.Service.S_Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class C_Reserva {


    M_Reserva modelR = new M_Reserva();
    @Autowired
    R_Reserva repositorioReserva;
    @Autowired
    S_Reserva serviceReserva;


    @GetMapping("/reserva")
    public ModelAndView pagreserva() {
        ModelAndView mv = new ModelAndView("reserva");
        return mv;
    }

    @GetMapping("/Reserva/{senha_porta}")
    public M_Reserva listaSenhaPorta(@PathVariable(value = "senha_porta") String senha_porta) {

        return repositorioReserva.findBySenhaPorta(senha_porta);
    }


    @PostMapping("/reserva")
    public String salvaReserva(@RequestParam("id_hotel") String id_hotel, @RequestParam("id_quarto") String id_quarto, @RequestParam("check_in_data") String check_in_data, @RequestParam("check_out_data") String check_out_data, @RequestParam("check_in_hora") String check_in_hora, @RequestParam("check_out_hora") String check_out_hora) {
        //Long mUsu = (Long) session.getAttribute("id_user");

        S_Reserva.postReserva(Long.parseLong(id_hotel), Long.parseLong(id_quarto), check_in_data, check_in_hora, check_out_data, check_out_hora);
        return "redirect:/reservado";
    }

    @PutMapping("/reserva")
    public M_Reserva atualizaReserva(@RequestBody M_Reserva reserva) {
        return repositorioReserva.save(reserva);
    }

    @DeleteMapping("/reserva")
    public void deletaReserva(@RequestBody M_Reserva reserva) {
        repositorioReserva.delete(reserva);
    }
}




