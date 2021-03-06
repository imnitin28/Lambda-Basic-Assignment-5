package com.knoldus.assignment;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface ReturnDistinctString {
    public List<String> getDistinctFromString(ArrayList<String> listOfStrings);
}
