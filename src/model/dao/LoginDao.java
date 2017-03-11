package model.dao;

import model.entity.User;
import model.entity.User_;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Optional;

/**
 * Created by simon on 01/03/17.
 */
public class LoginDao extends BaseDao {

    public Optional<Long> login(final String user, final String password) {
        CriteriaBuilder cb = getCriteriaBuilder();
        CriteriaQuery<Long> query = cb.createQuery(Long.class);
        Root<User> root = query.from(User.class);
        query.select(cb.count(root));
        query.where(cb.equal(root.get(User_.userName), user.toUpperCase()), cb.equal(root.get(User_.password), password));
        return getCountResult(query);
    }
}
