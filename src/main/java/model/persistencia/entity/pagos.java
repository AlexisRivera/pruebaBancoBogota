package model.persistencia.entity;


import java.util.Date;
import javax.persistence.*;

/**
  *  @generated
  */
@Entity
@Table(name="pagos")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="pagos.obtenerTodos", query="select e from pagos e")
})
public class pagos {

	@Id
    //@Column(name = "pagos_id")
    @GeneratedValue(generator = "pagosGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pagosGen", sequenceName = "pagos_SEQ",allocationSize = 1)
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
    
    //@Column(name = "idPago")
    private Integer idPago;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "valor")
    private Long valor;
    
    /**
    * @generated
    * 1-1-false
    */
    @Temporal(TemporalType.DATE)
    //@Column(name = "fechaDerecivo")
    private Date fechaDerecivo;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "pagado")
    private Boolean pagado;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "pagado")
    private String pagado;
    
    /**
    * @generated
    * 1-1-false
    */
    @Temporal(TemporalType.DATE)
    //@Column(name = "fechaPagado")
    private Date fechaPagado;
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Miembro miembro;
    
    
    /**
    * @generated
    */
    public Integer getIdPago() {
        return this.idPago;
    }
    
    /**
    * @generated
    */
    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }
    
    /**
    * @generated
    */
    public Long getValor() {
        return this.valor;
    }
    
    /**
    * @generated
    */
    public void setValor(Long valor) {
        this.valor = valor;
    }
    
    /**
    * @generated
    */
    public Date getFechaDerecivo() {
        return this.fechaDerecivo;
    }
    
    /**
    * @generated
    */
    public void setFechaDerecivo(Date fechaDerecivo) {
        this.fechaDerecivo = fechaDerecivo;
    }
    
    /**
    * @generated
    */
    public Boolean getPagado() {
        return this.pagado;
    }
    
    /**
    * @generated
    */
    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }
    
    /**
    * @generated
    */
    public String getPagado() {
        return this.pagado;
    }
    
    /**
    * @generated
    */
    public void setPagado(String pagado) {
        this.pagado = pagado;
    }
    
    /**
    * @generated
    */
    public Date getFechaPagado() {
        return this.fechaPagado;
    }
    
    /**
    * @generated
    */
    public void setFechaPagado(Date fechaPagado) {
        this.fechaPagado = fechaPagado;
    }
    
	
	/**
	* @generated
	*/
	public Miembro getMiembro() {
	    return this.miembro;
	}
	
	/**
	* @generated
	*/
	public void setMiembro(Miembro miembro) {
	    this.miembro = miembro;
	}
	
}
