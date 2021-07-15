package model.persistencia.entity;


import javax.persistence.*;

/**
  *  @generated
  */
@Entity
@Table(name="sexo")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="sexo.obtenerTodos", query="select e from sexo e")
})
public class sexo {

	@Id
    //@Column(name = "sexo_id")
    @GeneratedValue(generator = "sexoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sexoGen", sequenceName = "sexo_SEQ",allocationSize = 1)
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
    
    //@Column(name = "TipoSexo")
    private String TipoSexo;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "idTipo")
    private Integer idTipo;
    
    
    
    /**
    * @generated
    */
    public String getTipoSexo() {
        return this.TipoSexo;
    }
    
    /**
    * @generated
    */
    public void setTipoSexo(String TipoSexo) {
        this.TipoSexo = TipoSexo;
    }
    
    /**
    * @generated
    */
    public Integer getIdTipo() {
        return this.idTipo;
    }
    
    /**
    * @generated
    */
    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }
    
	
}
