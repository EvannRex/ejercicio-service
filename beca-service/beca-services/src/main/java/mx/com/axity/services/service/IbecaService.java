package mx.com.axity.services.service;

import mx.com.axity.commons.to.UserTO;
import java.util.List;

public interface IbecaService {

    List<UserTO> getUsers();
    int sum(int sum1,int sum2);
    int sub(int sub1,int sub2);
    int mult(int mult);
    int div(int div1);
}
