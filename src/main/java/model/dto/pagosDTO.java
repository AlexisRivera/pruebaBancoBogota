package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
* @generated
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class pagosDTO {

    public pagosDTO(){
        //constructor base
    }
    
    public pagosDTO(Long id){
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
    private Integer idPago;
    
    /**
    * @generated
    */
    private Long valor;
    
    /**
    * @generated
    */
    private String fechaDerecivo;
    
    /**
    * @generated
    */
    private Boolean pagado;
    
    /**
    * @generated
    */
    private String pagado;
    
    /**
    * @generated
    */
    private String fechaPagado;
    
    
    /**
    * @generated
    */
    private MiembroDTO miembro;
    
    /**
    * @generated
    */
    public Integer getIdPago() {
        return this.idPago;
    }
    
    /**
    * @generated
    */
    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }
    /**
    * @generated
    */
    public Long getValor() {
        return this.valor;
    }
    
    /**
    * @generated
    */
    public void setValor(Long valor) {
        this.valor = valor;
    }
    /**
    * @generated
    */
    public String getFechaDerecivo() {
        return this.fechaDerecivo;
    }
    
    /**
    * @generated
    */
    public void setFechaDerecivo(String fechaDerecivo) {
        this.fechaDerecivo = fechaDerecivo;
    }
    /**
    * @generated
    */
    public Boolean getPagado() {
        return this.pagado;
    }
    
    /**
    * @generated
    */
    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }
    /**
    * @generated
    */
    public String getPagado() {
        return this.pagado;
    }
    
    /**
    * @generated
    */
    public void setPagado(String pagado) {
        this.pagado = pagado;
    }
    /**
    * @generated
    */
    public String getFechaPagado() {
        return this.fechaPagado;
    }
    
    /**
    * @generated
    */
    public void setFechaPagado(String fechaPagado) {
        this.fechaPagado = fechaPagado;
    }
    
	/**
	* @generated
	*/
	public MiembroDTO getMiembro() {
	    return this.miembro;
	}
	
	/**
	* @generated
	*/
	public void setMiembro(MiembroDTO miembro) {
	    this.miembro = miembro;
	}
	
}
