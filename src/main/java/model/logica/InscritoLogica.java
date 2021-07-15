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
public class InscritoLogica {
	@EJB
    private InscritoDAO persistencia;

	private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

	
	/**
	* @generated
	*/
	public List<InscritoDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @generated
	*/
	public InscritoDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	* @generated
	*/
	public InscritoDTO guardar(InscritoDTO dto){
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
	public void actualizar(InscritoDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	private Inscrito convertirDTO(InscritoDTO dto){
		if(dto==null)return null;
		Inscrito entidad=new Inscrito();
		entidad.setId(dto.getId());
			entidad.setApellido(dto.getApellido());
			entidad.setNombre(dto.getNombre());
			if(dto.getFechaNacimiento()!=null){
				try {
					entidad.setFechaNacimiento(fecha.parse(dto.getFechaNacimiento()));
				} catch (ParseException ex) {
		            throw new RuntimeException("Error al convertir la fecha FechaNacimiento " + dto.getFechaNacimiento());
		        }
			}
		
			if(dto.getEstado()!=null){
				entidad.setEstado(new Estado());
				entidad.getEstado().setId(dto.getEstado().getId());
			}
			if(dto.getMiembro()!=null){
				entidad.setMiembro(new Miembro());
				entidad.getMiembro().setId(dto.getMiembro().getId());
			}
			if(dto.getSexo()!=null){
				entidad.setSexo(new sexo());
				entidad.getSexo().setId(dto.getSexo().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	private List<Inscrito> convertirDTO(List<InscritoDTO> dtos){
		List<Inscrito> entidades=new ArrayList<Inscrito>();
		for(InscritoDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	private InscritoDTO convertirEntidad(Inscrito entidad){
		InscritoDTO dto=new InscritoDTO();
		dto.setId(entidad.getId());
			dto.setApellido(entidad.getApellido());
			dto.setNombre(entidad.getNombre());
			if(entidad.getFechaNacimiento()!=null){
				dto.setFechaNacimiento(fecha.format(entidad.getFechaNacimiento()));
			}
		
			if(entidad.getEstado()!=null){
				dto.setEstado(
					new EstadoDTO(
						entidad.getEstado().getId()));
		        dto.getEstado().setNombre(entidad.getEstado().getNombre());
		    }
			if(entidad.getSexo()!=null){
				dto.setSexo(
					new sexoDTO(
						entidad.getSexo().getId()));
		        dto.getSexo().setNombre(entidad.getSexo().getNombre());
		    }
			if(entidad.getMiembro()!=null){
				dto.setMiembro(
					new MiembroDTO(
						entidad.getMiembro().getId()));
		        dto.getMiembro().setNombre(entidad.getMiembro().getNombre());
		    }
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	private List<InscritoDTO> convertirEntidad(List<Inscrito> entidades){
		List<InscritoDTO> dtos=new ArrayList<InscritoDTO>();
		for(Inscrito entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
