package main.java.Spring_Lesson1.Model;

import jdk.nashorn.internal.objects.annotations.Setter;

public class User implements ValidInputs.ValidInput {
    @Override
    public boolean checkPhone(String numberPhone) {
        if(numberPhone.length()!=10)
        return false;
        else return true;
    }

    @Override
    public boolean checkPassword(String password) {
        if(password.length()<8)
        return false;
        else return true;
    }

    @Override
    public boolean checkEmail(String email) {
        if(email.endsWith("@gmail.com")==false)
        return false;
        else return true;
    }

}
