package ru.shevtsov.caloriesmng.repository.datajpa;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.shevtsov.caloriesmng.model.User;

import java.util.List;

/**
 * Created by dead_rabbit
 * 19.10.2016
 */
@Transactional(readOnly = true)
public interface ProxyUserRepository  extends JpaRepository<User, Integer> {

    @Override
    @Transactional
    User save(User user);

    @Override
    User findOne(Integer id);

    @Override
    List<User> findAll(Sort sort);

    User getByEmail(String email);

    @Transactional
    @Modifying
    @Query("DELETE FROM User u WHERE u.id=?1")
    int delete(int id);
 /*
    @Query(name = User.DELETE)
    int delete(@Param("id") int id);*/

}
