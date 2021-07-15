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
public class MedioPagosLogica {
	@EJB
    private MedioPagosDAO persistencia;


	
	/**
	* @generated
	*/
	public List<MedioPagosDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @generated
	*/
	public MedioPagosDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	* @generated
	*/
	public MedioPagosDTO guardar(MedioPagosDTO dto){
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
	public void actualizar(MedioPagosDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	private MedioPagos convertirDTO(MedioPagosDTO dto){
		if(dto==null)return null;
		MedioPagos entidad=new MedioPagos();
		entidad.setId(dto.getId());
			entidad.setIdMedioPago(dto.getIdMedioPago());
			entidad.setDescripcionTipo(dto.getDescripcionTipo());
		
			if(dto.getPagos()!=null){
				entidad.setPagos(new pagos());
				entidad.getPagos().setId(dto.getPagos().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	private List<MedioPagos> convertirDTO(List<MedioPagosDTO> dtos){
		List<MedioPagos> entidades=new ArrayList<MedioPagos>();
		for(MedioPagosDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	private MedioPagosDTO convertirEntidad(MedioPagos entidad){
		MedioPagosDTO dto=new MedioPagosDTO();
		dto.setId(entidad.getId());
			dto.setIdMedioPago(entidad.getIdMedioPago());
			dto.setDescripcionTipo(entidad.getDescripcionTipo());
		
			if(entidad.getPagos()!=null){
				dto.setPagos(
					new pagosDTO(
						entidad.getPagos().getId()));
		        dto.getPagos().setNombre(entidad.getPagos().getNombre());
		    }
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	private List<MedioPagosDTO> convertirEntidad(List<MedioPagos> entidades){
		List<MedioPagosDTO> dtos=new ArrayList<MedioPagosDTO>();
		for(MedioPagos entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
