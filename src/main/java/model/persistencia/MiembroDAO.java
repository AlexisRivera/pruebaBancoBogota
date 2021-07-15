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
public class MiembroDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Miembro> obtenerTodos(){
		return em.createNamedQuery("Miembro.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Miembro obtener(Long id){
		return em.find(Miembro.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Miembro guardar(Miembro entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Miembro.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Miembro entidad){
		em.merge(entidad);
	}
	
	
}
