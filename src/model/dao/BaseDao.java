package model.dao;

import model.entity.AEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;
import java.util.Optional;

/**
 * Created by simon on 01/03/17.
 */
public class BaseDao {

//    private Class<E> getEntityType() {
//        return (Class<E>) ((ParameterizedType) getClass()
//                .getGenericSuperclass()).getActualTypeArguments()[0];
//    }

    @PersistenceContext
    protected static EntityManager entityManager = Persistence.createEntityManagerFactory("jpa").createEntityManager();

    private EntityTransaction transaction = entityManager.getTransaction();

    protected CriteriaBuilder getCriteriaBuilder() {
        return entityManager.getCriteriaBuilder();
    }

    protected <N extends Number, T extends AEntity> T find(N key, Class<T> clazz) {
        return entityManager.find(clazz, key);
    }

    protected <T> List<T> getResultList(CriteriaQuery<T> query) {
        return entityManager.createQuery(query).getResultList();
    }

    protected <N> Optional<N> getCountResult(CriteriaQuery<N> query) {
        return Optional.ofNullable(entityManager.createQuery(query).getSingleResult());
    }

}
