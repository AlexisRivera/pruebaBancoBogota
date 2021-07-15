package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
* @generated
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class MedioPagosDTO {

    public MedioPagosDTO(){
        //constructor base
    }
    
    public MedioPagosDTO(Long id){
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
    private Integer idMedioPago;
    
    /**
    * @generated
    */
    private String descripcionTipo;
    
    
    /**
    * @generated
    */
    private pagosDTO pagos;
    
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
	public pagosDTO getPagos() {
	    return this.pagos;
	}
	
	/**
	* @generated
	*/
	public void setPagos(pagosDTO pagos) {
	    this.pagos = pagos;
	}
	
}
