/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ls.dao;

import com.ls.bll.UserLogin;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class UserDaoImpl implements UserDao {

    @Override
    public boolean checkUser(UserLogin u) throws IOException{
        boolean found=false;
        try{
            FileReader fr = new FileReader("UserLoginDetails.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            String[] splt = null;
            while((line=br.readLine())!=null){
                splt = line.split(",");
                if(splt[0].equals(u.getUsername()) && splt[1].equals(u.getPassword())){
                    found = true;
                    break;
                }
            }
            br.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return found;
    }
    
}
