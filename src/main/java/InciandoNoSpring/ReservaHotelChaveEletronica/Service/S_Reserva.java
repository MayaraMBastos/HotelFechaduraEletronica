package InciandoNoSpring.PrimeiraAplicacao.Service;


import InciandoNoSpring.PrimeiraAplicacao.Model.M_Reserva;

import InciandoNoSpring.PrimeiraAplicacao.Repository.R_Reserva;

import org.springframework.stereotype.Service;


import java.util.Random;

@Service
public class S_Reserva {

    private static R_Reserva reserva;


    public S_Reserva(R_Reserva senha_porta) {
        this.reserva = senha_porta;
    }


        public static String gerarSenhaAleatoria(int length) {
            String caracteres = "0123456789";
            Random random = new Random();
            StringBuilder senha = new StringBuilder(length);

            for (int i = 0; i < length; i++) {
                int index = random.nextInt(caracteres.length());
                senha.append(caracteres.charAt(index));
            }

            return senha.toString();
        }


    public static void postReserva( Long id_hotel, Long id_quarto, String check_in_data, String check_in_hora, String check_out_data, String check_out_hora){
        M_Reserva modelReserva = new M_Reserva();



        modelReserva.setId_hotel(id_hotel);
        modelReserva.setId_quarto(id_quarto);
        modelReserva.setCheck_in_data(check_in_data);
        modelReserva.setCheck_in_hora(check_in_hora);
        modelReserva.setCheck_out_data(check_out_data);
        modelReserva.setCheck_out_hora(check_out_hora);

        int length = 4; // comprimento da senha
        String senha = gerarSenhaAleatoria(length);
        String senha_porta = senha;
        modelReserva.setSenha_porta(senha_porta);

        reserva.save(modelReserva);

    }
}
