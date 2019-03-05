package mx.com.axity.services.service.impl;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.UserDO;
import mx.com.axity.persistence.UserDAO;
import mx.com.axity.services.service.IbecaService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.IntToLongFunction;

@Service
public class becaServiceImpl implements IbecaService {

    static final Logger LOG = LogManager.getLogger(becaServiceImpl.class);

    @Autowired
    UserDAO userDAO;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public int sum(int sum1, int sum2) {
        return sum1 + sum2;
    }

    @Override
    public int sub(int sub1, int sub2) {
        return sub1 - sub2;
    }

    @Override
    public int mult(int mult1) {
        return mult1 * 4;
    }

    @Override
    public int div(int div1) {
        return div1 / 4;
    }

    @Override
    public List<UserDO> getAllUsers() {

        return (List<UserDO>) this.userDAO.findAll();
    }
    @Override
    public void saveUser(UserDO userDO) {
        this.userDAO.save(userDO);
    }

    @Override
    public UserDO searchById(long id) {
        UserDO toShow= this.userDAO.findById(id).get();
        return toShow;
    }

    @Override
    public void updateUser(UserDO userDO) {
        long toValidate= userDO.getId();

        UserDO toUpdate= this.userDAO.findById(toValidate).get();
        this.userDAO.save(toUpdate);

    }

    @Override
    public void deleteUser(Long id) {
        this.userDAO.deleteById(id);
    }
}
