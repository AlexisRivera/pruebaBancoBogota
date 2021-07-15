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
public class sexoDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<sexo> obtenerTodos(){
		return em.createNamedQuery("sexo.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public sexo obtener(Long id){
		return em.find(sexo.class, id);
	}
	
	
	/**
	* @generated
	*/
	public sexo guardar(sexo entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(sexo.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(sexo entidad){
		em.merge(entidad);
	}
	
	
}
