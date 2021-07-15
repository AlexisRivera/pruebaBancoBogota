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
public class InscritoDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Inscrito> obtenerTodos(){
		return em.createNamedQuery("Inscrito.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Inscrito obtener(Long id){
		return em.find(Inscrito.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Inscrito guardar(Inscrito entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Inscrito.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Inscrito entidad){
		em.merge(entidad);
	}
	
	
}
