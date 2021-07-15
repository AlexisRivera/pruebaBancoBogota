package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
* @generated
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class InscritoDTO {

    public InscritoDTO(){
        //constructor base
    }
    
    public InscritoDTO(Long id){
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
    private String apellido;
    
    /**
    * @generated
    */
    private String nombre;
    
    /**
    * @generated
    */
    private String fechaNacimiento;
    
    
    /**
    * @generated
    */
    private sexoDTO sexo;
    
    /**
    * @generated
    */
    private MiembroDTO miembro;
    
    /**
    * @generated
    */
    private EstadoDTO estado;
    
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
    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    /**
    * @generated
    */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
	/**
	* @generated
	*/
	public sexoDTO getSexo() {
	    return this.sexo;
	}
	
	/**
	* @generated
	*/
	public void setSexo(sexoDTO sexo) {
	    this.sexo = sexo;
	}
	/**
	* @generated
	*/
	public EstadoDTO getEstado() {
	    return this.estado;
	}
	
	/**
	* @generated
	*/
	public void setEstado(EstadoDTO estado) {
	    this.estado = estado;
	}
	
}
