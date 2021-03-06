package com.knoldus.assignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnDistinctStringImpl {
     public ReturnDistinctString returnDistinctString = (list1) -> {
        return list1.stream().distinct().collect(Collectors.toList());
    };
}
