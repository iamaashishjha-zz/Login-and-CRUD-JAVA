
package com.ls.dao;

import com.ls.bll.UserLogin;
import java.io.IOException;


public interface UserDao {
    public boolean checkUser(UserLogin u) throws IOException;
}
