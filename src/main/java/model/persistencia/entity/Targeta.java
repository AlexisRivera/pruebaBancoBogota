package model.persistencia.entity;


import javax.persistence.*;

/**
  *  @generated
  */
@Entity
@Table(name="Targeta")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Targeta.obtenerTodos", query="select e from Targeta e")
})
public class Targeta {

	@Id
    //@Column(name = "Targeta_id")
    @GeneratedValue(generator = "TargetaGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "TargetaGen", sequenceName = "Targeta_SEQ",allocationSize = 1)
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
    
    //@Column(name = "miembro")
    private String miembro;
    
    
    
    /**
    * @generated
    */
    public String getMiembro() {
        return this.miembro;
    }
    
    /**
    * @generated
    */
    public void setMiembro(String miembro) {
        this.miembro = miembro;
    }
    
	
}
