package model.logica;

import model.dto.*;
import model.persistencia.*;
import model.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
  *  @generated
  */
@Stateless
public class MiembroLogica {
	@EJB
    private MiembroDAO persistencia;

	private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

	
	/**
	* @generated
	*/
	public List<MiembroDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @generated
	*/
	public MiembroDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	* @generated
	*/
	public MiembroDTO guardar(MiembroDTO dto){
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
	public void actualizar(MiembroDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	private Miembro convertirDTO(MiembroDTO dto){
		if(dto==null)return null;
		Miembro entidad=new Miembro();
		entidad.setId(dto.getId());
			entidad.setIdInscripcion(dto.getIdInscripcion());
			if(dto.getFechaNotificacion()!=null){
				try {
					entidad.setFechaNotificacion(fecha.parse(dto.getFechaNotificacion()));
				} catch (ParseException ex) {
		            throw new RuntimeException("Error al convertir la fecha FechaNotificacion " + dto.getFechaNotificacion());
		        }
			}
			entidad.setMotivo(dto.getMotivo());
		
			if(dto.getTargeta()!=null){
				entidad.setTargeta(new Targeta());
				entidad.getTargeta().setId(dto.getTargeta().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	private List<Miembro> convertirDTO(List<MiembroDTO> dtos){
		List<Miembro> entidades=new ArrayList<Miembro>();
		for(MiembroDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	private MiembroDTO convertirEntidad(Miembro entidad){
		MiembroDTO dto=new MiembroDTO();
		dto.setId(entidad.getId());
			dto.setIdInscripcion(entidad.getIdInscripcion());
			if(entidad.getFechaNotificacion()!=null){
				dto.setFechaNotificacion(fecha.format(entidad.getFechaNotificacion()));
			}
			dto.setMotivo(entidad.getMotivo());
		
			if(entidad.getTargeta()!=null){
				dto.setTargeta(
					new TargetaDTO(
						entidad.getTargeta().getId()));
		        dto.getTargeta().setNombre(entidad.getTargeta().getNombre());
		    }
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	private List<MiembroDTO> convertirEntidad(List<Miembro> entidades){
		List<MiembroDTO> dtos=new ArrayList<MiembroDTO>();
		for(Miembro entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
