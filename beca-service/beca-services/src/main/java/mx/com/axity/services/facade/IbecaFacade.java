package mx.com.axity.services.facade;

import mx.com.axity.commons.to.UserTO;

import java.util.List;

public interface IbecaFacade {

    int operation(int a,int b);
    List<UserTO> getAllUsers();
    void saveUser(UserTO userTO);
    UserTO searchById(int id);
    void updateUser(UserTO userTO);
    void deleteUser(int id);
}
