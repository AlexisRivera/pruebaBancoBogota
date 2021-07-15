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
public class EstadoLogica {
	@EJB
    private EstadoDAO persistencia;


	
	/**
	* @generated
	*/
	public List<EstadoDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @generated
	*/
	public EstadoDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	* @generated
	*/
	public EstadoDTO guardar(EstadoDTO dto){
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
	public void actualizar(EstadoDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	private Estado convertirDTO(EstadoDTO dto){
		if(dto==null)return null;
		Estado entidad=new Estado();
		entidad.setId(dto.getId());
			entidad.setTipoEstado(dto.getTipoEstado());
		
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	private List<Estado> convertirDTO(List<EstadoDTO> dtos){
		List<Estado> entidades=new ArrayList<Estado>();
		for(EstadoDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	private EstadoDTO convertirEntidad(Estado entidad){
		EstadoDTO dto=new EstadoDTO();
		dto.setId(entidad.getId());
			dto.setTipoEstado(entidad.getTipoEstado());
		
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	private List<EstadoDTO> convertirEntidad(List<Estado> entidades){
		List<EstadoDTO> dtos=new ArrayList<EstadoDTO>();
		for(Estado entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
