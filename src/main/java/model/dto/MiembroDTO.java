package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
* @generated
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class MiembroDTO {

    public MiembroDTO(){
        //constructor base
    }
    
    public MiembroDTO(Long id){
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
    private Integer idInscripcion;
    
    /**
    * @generated
    */
    private String fechaNotificacion;
    
    /**
    * @generated
    */
    private String motivo;
    
    
    /**
    * @generated
    */
    private TargetaDTO targeta;
    
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
    public String getFechaNotificacion() {
        return this.fechaNotificacion;
    }
    
    /**
    * @generated
    */
    public void setFechaNotificacion(String fechaNotificacion) {
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
	public TargetaDTO getTargeta() {
	    return this.targeta;
	}
	
	/**
	* @generated
	*/
	public void setTargeta(TargetaDTO targeta) {
	    this.targeta = targeta;
	}
	
}
