package model.persistencia.entity;


import java.util.Date;
import javax.persistence.*;

/**
  *  @generated
  */
@Entity
@Table(name="Miembro")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Miembro.obtenerTodos", query="select e from Miembro e")
})
public class Miembro {

	@Id
    //@Column(name = "Miembro_id")
    @GeneratedValue(generator = "MiembroGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "MiembroGen", sequenceName = "Miembro_SEQ",allocationSize = 1)
	private Long id;

	public Long getId(){
		return this.id;
	}

	public void setId(Long id){
		this.id=id;
	}
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "idInscripcion")
    private Integer idInscripcion;
    
    /**
    * @generated
    * 1-1-false
    */
    @Temporal(TemporalType.DATE)
    //@Column(name = "fechaNotificacion")
    private Date fechaNotificacion;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "motivo")
    private String motivo;
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Targeta targeta;
    
    
    /**
    * @generated
    */
    public Integer getIdInscripcion() {
        return this.idInscripcion;
    }
    
    /**
    * @generated
    */
    public void setIdInscripcion(Integer idInscripcion) {
        this.idInscripcion = idInscripcion;
    }
    
    /**
    * @generated
    */
    public Date getFechaNotificacion() {
        return this.fechaNotificacion;
    }
    
    /**
    * @generated
    */
    public void setFechaNotificacion(Date fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }
    
    /**
    * @generated
    */
    public String getMotivo() {
        return this.motivo;
    }
    
    /**
    * @generated
    */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
	
	/**
	* @generated
	*/
	public Targeta getTargeta() {
	    return this.targeta;
	}
	
	/**
	* @generated
	*/
	public void setTargeta(Targeta targeta) {
	    this.targeta = targeta;
	}
	
}
