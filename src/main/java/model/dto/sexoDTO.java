package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
* @generated
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class sexoDTO {

    public sexoDTO(){
        //constructor base
    }
    
    public sexoDTO(Long id){
        this.id=id;
    }

	private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	
    
    /**
    * @generated
    */
    private String TipoSexo;
    
    /**
    * @generated
    */
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
