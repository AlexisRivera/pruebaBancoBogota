package model.logica;

import model.dto.*;
import model.persistencia.*;
import model.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
  *  @generated
  */
@Stateless
public class TargetaLogica {
	@EJB
    private TargetaDAO persistencia;


	
	/**
	* @generated
	*/
	public List<TargetaDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @generated
	*/
	public TargetaDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	* @generated
	*/
	public TargetaDTO guardar(TargetaDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(TargetaDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	private Targeta convertirDTO(TargetaDTO dto){
		if(dto==null)return null;
		Targeta entidad=new Targeta();
		entidad.setId(dto.getId());
			entidad.setMiembro(dto.getMiembro());
		
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	private List<Targeta> convertirDTO(List<TargetaDTO> dtos){
		List<Targeta> entidades=new ArrayList<Targeta>();
		for(TargetaDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	private TargetaDTO convertirEntidad(Targeta entidad){
		TargetaDTO dto=new TargetaDTO();
		dto.setId(entidad.getId());
			dto.setMiembro(entidad.getMiembro());
		
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	private List<TargetaDTO> convertirEntidad(List<Targeta> entidades){
		List<TargetaDTO> dtos=new ArrayList<TargetaDTO>();
		for(Targeta entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
