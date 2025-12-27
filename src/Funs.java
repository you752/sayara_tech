/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;
public class Funs {
    protected static boolean Manager;
    protected static String name;
    protected static String emp_national;
    ////////////////////////////////////////
       protected static boolean valid_name(String s) {
     
        for (char i : s.toCharArray()) {
            if ((!Character.isAlphabetic(i)) && !(i == '_')) {
                return false;
            }
        }
        return true;
    }
       ///////////////////////////////
        protected static boolean only_alphs(String s) {
     
        for (char i : s.toCharArray()) {
            if ((!Character.isAlphabetic(i))) {
                return false;
            }
        }
        return true;
    }
///////////////////////////////////////////
    protected static boolean only_nums(String s) {
        for (char i : s.toCharArray()) {
            if ((!Character.isDigit(i))) {
                return false;
            }
        }
        return true;
    }
    ////////////////////////////////////////
      protected static boolean only_nums_alphs_name(String s) {
     
        for (char i : s.toCharArray()) {
            if ((!Character.isAlphabetic(i)) && (!Character.isDigit(i))&& (i!='-')) {
                return false;
            }
        }
        return true;
    }
    ///////////////////////////////////////
       protected static boolean checkPasswordMatch(String password,String confirmPassword) {
          return password.equals(confirmPassword);
    }
       
}
