package mx.com.axity.services.service;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.UserDO;

import java.util.List;

public interface IbecaService {


    int sum(int sum1,int sum2);
    int sub(int sub1,int sub2);
    int mult(int mult);
    int div(int div1);

    List<UserDO>getAllUsers();
    void saveUser(UserDO userDO);
    UserDO searchById(long id);
    void updateUser(UserDO userDO);
    void deleteUser(Long id);
}
