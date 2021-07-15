package model.persistencia.entity;


import javax.persistence.*;

/**
  *  @generated
  */
@Entity
@Table(name="Estado")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Estado.obtenerTodos", query="select e from Estado e")
})
public class Estado {

	@Id
    //@Column(name = "Estado_id")
    @GeneratedValue(generator = "EstadoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "EstadoGen", sequenceName = "Estado_SEQ",allocationSize = 1)
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
    
    //@Column(name = "tipoEstado")
    private String tipoEstado;
    
    
    
    /**
    * @generated
    */
    public String getTipoEstado() {
        return this.tipoEstado;
    }
    
    /**
    * @generated
    */
    public void setTipoEstado(String tipoEstado) {
        this.tipoEstado = tipoEstado;
    }
    
	
}
