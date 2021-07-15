package model.persistencia.entity;


import javax.persistence.*;

/**
  *  @generated
  */
@Entity
@Table(name="MedioPagos")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="MedioPagos.obtenerTodos", query="select e from MedioPagos e")
})
public class MedioPagos {

	@Id
    //@Column(name = "MedioPagos_id")
    @GeneratedValue(generator = "MedioPagosGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "MedioPagosGen", sequenceName = "MedioPagos_SEQ",allocationSize = 1)
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
    
    //@Column(name = "idMedioPago")
    private Integer idMedioPago;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "descripcionTipo")
    private String descripcionTipo;
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private pagos pagos;
    
    
    /**
    * @generated
    */
    public Integer getIdMedioPago() {
        return this.idMedioPago;
    }
    
    /**
    * @generated
    */
    public void setIdMedioPago(Integer idMedioPago) {
        this.idMedioPago = idMedioPago;
    }
    
    /**
    * @generated
    */
    public String getDescripcionTipo() {
        return this.descripcionTipo;
    }
    
    /**
    * @generated
    */
    public void setDescripcionTipo(String descripcionTipo) {
        this.descripcionTipo = descripcionTipo;
    }
    
	
	/**
	* @generated
	*/
	public pagos getPagos() {
	    return this.pagos;
	}
	
	/**
	* @generated
	*/
	public void setPagos(pagos pagos) {
	    this.pagos = pagos;
	}
	
}
