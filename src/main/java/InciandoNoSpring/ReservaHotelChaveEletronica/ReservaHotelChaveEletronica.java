package InciandoNoSpring.PrimeiraAplicacao;

import InciandoNoSpring.PrimeiraAplicacao.Controller.C_Reserva;
import InciandoNoSpring.PrimeiraAplicacao.Model.M_Reserva;
import InciandoNoSpring.PrimeiraAplicacao.Program.ArduinoSerial;
import InciandoNoSpring.PrimeiraAplicacao.Repository.R_Reserva;
import InciandoNoSpring.PrimeiraAplicacao.Service.S_Reserva;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeiraAplicacaoApplication {
    public static void main(String[] args) {

        SpringApplication.run(PrimeiraAplicacaoApplication.class, args);
//ArduinoSerial conArduino = new ArduinoSerial("COM7");
//C_Reserva conR = new C_Reserva();
//        conR.conectaArduino();

    }
}
