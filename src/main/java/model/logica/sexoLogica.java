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
public class sexoLogica {
	@EJB
    private sexoDAO persistencia;


	
	/**
	* @generated
	*/
	public List<sexoDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @generated
	*/
	public sexoDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	* @generated
	*/
	public sexoDTO guardar(sexoDTO dto){
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
	public void actualizar(sexoDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	private sexo convertirDTO(sexoDTO dto){
		if(dto==null)return null;
		sexo entidad=new sexo();
		entidad.setId(dto.getId());
			entidad.setTipoSexo(dto.getTipoSexo());
			entidad.setIdTipo(dto.getIdTipo());
		
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	private List<sexo> convertirDTO(List<sexoDTO> dtos){
		List<sexo> entidades=new ArrayList<sexo>();
		for(sexoDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	private sexoDTO convertirEntidad(sexo entidad){
		sexoDTO dto=new sexoDTO();
		dto.setId(entidad.getId());
			dto.setTipoSexo(entidad.getTipoSexo());
			dto.setIdTipo(entidad.getIdTipo());
		
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	private List<sexoDTO> convertirEntidad(List<sexo> entidades){
		List<sexoDTO> dtos=new ArrayList<sexoDTO>();
		for(sexo entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
