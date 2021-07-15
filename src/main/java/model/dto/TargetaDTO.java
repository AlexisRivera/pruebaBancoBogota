package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
* @generated
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class TargetaDTO {

    public TargetaDTO(){
        //constructor base
    }
    
    public TargetaDTO(Long id){
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
