package InciandoNoSpring.ReservaHotelChaveEletronica.Repository;



import InciandoNoSpring.ReservaHotelChaveEletronica.Model.M_Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface R_Cadastro extends JpaRepository<M_Cadastro, Long> {

}