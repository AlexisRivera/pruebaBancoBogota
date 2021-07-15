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
public class pagosLogica {
	@EJB
    private pagosDAO persistencia;

	private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

	
	/**
	* @generated
	*/
	public List<pagosDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @generated
	*/
	public pagosDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	* @generated
	*/
	public pagosDTO guardar(pagosDTO dto){
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
	public void actualizar(pagosDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	private pagos convertirDTO(pagosDTO dto){
		if(dto==null)return null;
		pagos entidad=new pagos();
		entidad.setId(dto.getId());
			entidad.setIdPago(dto.getIdPago());
			entidad.setValor(dto.getValor());
			if(dto.getFechaDerecivo()!=null){
				try {
					entidad.setFechaDerecivo(fecha.parse(dto.getFechaDerecivo()));
				} catch (ParseException ex) {
		            throw new RuntimeException("Error al convertir la fecha FechaDerecivo " + dto.getFechaDerecivo());
		        }
			}
			entidad.setPagado(dto.getPagado());
			entidad.setPagado(dto.getPagado());
			if(dto.getFechaPagado()!=null){
				try {
					entidad.setFechaPagado(fecha.parse(dto.getFechaPagado()));
				} catch (ParseException ex) {
		            throw new RuntimeException("Error al convertir la fecha FechaPagado " + dto.getFechaPagado());
		        }
			}
		
			if(dto.getMiembro()!=null){
				entidad.setMiembro(new Miembro());
				entidad.getMiembro().setId(dto.getMiembro().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	private List<pagos> convertirDTO(List<pagosDTO> dtos){
		List<pagos> entidades=new ArrayList<pagos>();
		for(pagosDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	private pagosDTO convertirEntidad(pagos entidad){
		pagosDTO dto=new pagosDTO();
		dto.setId(entidad.getId());
			dto.setIdPago(entidad.getIdPago());
			dto.setValor(entidad.getValor());
			if(entidad.getFechaDerecivo()!=null){
				dto.setFechaDerecivo(fecha.format(entidad.getFechaDerecivo()));
			}
			dto.setPagado(entidad.getPagado());
			dto.setPagado(entidad.getPagado());
			if(entidad.getFechaPagado()!=null){
				dto.setFechaPagado(fecha.format(entidad.getFechaPagado()));
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
	private List<pagosDTO> convertirEntidad(List<pagos> entidades){
		List<pagosDTO> dtos=new ArrayList<pagosDTO>();
		for(pagos entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
