package InciandoNoSpring.ReservaHotelChaveEletronica.Model;



import jakarta.persistence.*;


@Entity
@Table(name = "reserva")
public class M_Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva", unique = true)
    private Long id_reserva;
    private Long id_usuario;
    private Long id_hotel;
    private Long id_quarto;
    private String check_in_data;
    private String check_in_hora;
    private String check_out_data;
    private String check_out_hora;
    private String senha_porta;






    public Long getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(Long id_reserva) {
        this.id_reserva = id_reserva;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Long getId_hotel() {
        return id_hotel;
    }

    public void setId_hotel(Long id_hotel) {
        this.id_hotel = id_hotel;
    }

    public Long getId_quarto() {
        return id_quarto;
    }

    public void setId_quarto(Long id_quarto) {
        this.id_quarto = id_quarto;
    }

    public String getCheck_in_data() {
        return check_in_data;
    }

    public void setCheck_in_data(String check_in_data) {
        this.check_in_data = check_in_data;
    }

    public String getCheck_in_hora() {
        return check_in_hora;
    }

    public void setCheck_in_hora(String check_in_hora) {
        this.check_in_hora = check_in_hora;
    }

    public String getCheck_out_data() {
        return check_out_data;
    }

    public void setCheck_out_data(String check_out_data) {
        this.check_out_data = check_out_data;
    }

    public String getCheck_out_hora() {
        return check_out_hora;
    }

    public void setCheck_out_hora(String check_out_hora) {
        this.check_out_hora = check_out_hora;
    }

    public String getSenha_porta() {
        return senha_porta;
    }

    public void setSenha_porta(String senha_porta) {
        this.senha_porta = senha_porta;
    }
}