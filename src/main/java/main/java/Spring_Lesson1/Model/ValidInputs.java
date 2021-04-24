package main.java.Spring_Lesson1.Model;

public class ValidInputs {
    public interface ValidInput {
    boolean checkPhone(String numberPhone);
    boolean checkPassword(String password);
    boolean checkEmail(String email);
    }
}
