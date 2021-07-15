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
public class pagosDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<pagos> obtenerTodos(){
		return em.createNamedQuery("pagos.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public pagos obtener(Long id){
		return em.find(pagos.class, id);
	}
	
	
	/**
	* @generated
	*/
	public pagos guardar(pagos entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(pagos.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(pagos entidad){
		em.merge(entidad);
	}
	
	
}
