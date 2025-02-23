package InciandoNoSpring.ReservaHotelChaveEletronica.Repository;


import InciandoNoSpring.ReservaHotelChaveEletronica.Model.M_Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface R_Usuario extends JpaRepository<M_Usuario, Long> {
    @Query(value = "SELECT * FROM users WHERE usuario = :usuario and senha = :senha limit 1", nativeQuery = true)
    M_Usuario findByUsuarioESenha(@Param("usuario") String usuario, @Param("senha") String senha);

    @Query(value = "SELECT * FROM users WHERE id_user = :id_user and senha = :senha limit 1", nativeQuery = true)
    Long findByIdUsuario(@Param("id_user") Long id_user);
}