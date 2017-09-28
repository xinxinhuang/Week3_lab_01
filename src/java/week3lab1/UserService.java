package week3lab1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 721292
 */
public class UserService {
   
    public boolean login(String u, String p)
    {
        if(u.equals("adam") && p.equals("password"))
        {
            return true;
        }
        else if(u.equals("betty") && p.equals("password"))
        {
            return true;
        }
        return false;
    }
    
}
