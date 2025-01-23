package InciandoNoSpring.ReservaHotelChaveEletronica.Repository;


import InciandoNoSpring.ReservaHotelChaveEletronica.Model.M_Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface R_Reserva extends JpaRepository<M_Reserva, Long> {
    @Query(value = "SELECT * FROM reserva WHERE senha_porta = :senha_porta limit 1", nativeQuery = true)
    M_Reserva findBySenhaPorta(@Param("senha_porta") String senha_porta);


}


