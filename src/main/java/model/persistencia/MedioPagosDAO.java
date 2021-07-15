package model.persistencia;

import model.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
  *  @generated
  */
@Stateless
public class MedioPagosDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<MedioPagos> obtenerTodos(){
		return em.createNamedQuery("MedioPagos.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public MedioPagos obtener(Long id){
		return em.find(MedioPagos.class, id);
	}
	
	
	/**
	* @generated
	*/
	public MedioPagos guardar(MedioPagos entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(MedioPagos.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(MedioPagos entidad){
		em.merge(entidad);
	}
	
	
}
