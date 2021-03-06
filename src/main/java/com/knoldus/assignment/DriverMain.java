package com.knoldus.assignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class DriverMain {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("java","scala","java","clojure","clojure"));
        ReturnDistinctStringImpl returnDistinctString = new ReturnDistinctStringImpl();
        List<String> distinctList = returnDistinctString.returnDistinctString.getDistinctFromString(list1);
        System.out.println(distinctList);
    }
}
