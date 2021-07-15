package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
* @generated
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class EstadoDTO {

    public EstadoDTO(){
        //constructor base
    }
    
    public EstadoDTO(Long id){
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
