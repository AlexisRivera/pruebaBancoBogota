package model.persistencia.entity;


import java.util.Date;
import javax.persistence.*;

/**
  *  @generated
  */
@Entity
@Table(name="Inscrito")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Inscrito.obtenerTodos", query="select e from Inscrito e")
})
public class Inscrito {

	@Id
    //@Column(name = "Inscrito_id")
    @GeneratedValue(generator = "InscritoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "InscritoGen", sequenceName = "Inscrito_SEQ",allocationSize = 1)
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
    
    //@Column(name = "apellido")
    private String apellido;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "nombre")
    private String nombre;
    
    /**
    * @generated
    * 1-1-false
    */
    @Temporal(TemporalType.DATE)
    //@Column(name = "fechaNacimiento")
    private Date fechaNacimiento;
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Miembro miembro;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private sexo sexo;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Estado estado;
    
    
    /**
    * @generated
    */
    public String getApellido() {
        return this.apellido;
    }
    
    /**
    * @generated
    */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /**
    * @generated
    */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
    * @generated
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
    * @generated
    */
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    /**
    * @generated
    */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
	
	/**
	* @generated
	*/
	public Estado getEstado() {
	    return this.estado;
	}
	
	/**
	* @generated
	*/
	public void setEstado(Estado estado) {
	    this.estado = estado;
	}
	
	/**
	* @generated
	*/
	public sexo getSexo() {
	    return this.sexo;
	}
	
	/**
	* @generated
	*/
	public void setSexo(sexo sexo) {
	    this.sexo = sexo;
	}
	
}
