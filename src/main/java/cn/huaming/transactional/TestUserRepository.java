package cn.huaming.transactional;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;


/**
 * @author Jorvey
 * @date 2020/06/16
 */
public interface TestUserRepository extends CrudRepository<TestUser, String>, JpaSpecificationExecutor<TestUser> {

}