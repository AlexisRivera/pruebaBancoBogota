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
public class TargetaDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Targeta> obtenerTodos(){
		return em.createNamedQuery("Targeta.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Targeta obtener(Long id){
		return em.find(Targeta.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Targeta guardar(Targeta entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Targeta.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Targeta entidad){
		em.merge(entidad);
	}
	
	
}
