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
public class EstadoDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Estado> obtenerTodos(){
		return em.createNamedQuery("Estado.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Estado obtener(Long id){
		return em.find(Estado.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Estado guardar(Estado entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Estado.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Estado entidad){
		em.merge(entidad);
	}
	
	
}
