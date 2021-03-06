package assignment.test;

import com.knoldus.assignment.ReturnDistinctStringImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnDistinctStringImplTest {
    @Test
    public void getDistinctListOfStringTest()
    {
        ReturnDistinctStringImpl returnDistinctStringImpl = new ReturnDistinctStringImpl();

        ArrayList<String> inputList1 = new ArrayList<>(Arrays.asList("java","scala","java","clojure","clojure"));
        ArrayList<String> expectedOutputList1 = new ArrayList<>(Arrays.asList("java","scala","clojure"));
        List<String> actualOutputList1 = returnDistinctStringImpl.returnDistinctString.getDistinctFromString(inputList1);
        Assert.assertEquals(actualOutputList1,expectedOutputList1);

        ArrayList<String> inputList2 = new ArrayList<>(Arrays.asList("the","three","the","three","the","three","an","an","a"));
        ArrayList<String> expectedOutputList2 = new ArrayList<>(Arrays.asList("a","an","the","three"));
        List<String> actualOutputList2 = returnDistinctStringImpl.returnDistinctString.getDistinctFromString(inputList2);
        Assert.assertSame(actualOutputList2,actualOutputList2);

        ArrayList<String> inputList3 = new ArrayList<>(Arrays.asList(""));
        ArrayList<String> expectedInputList3 = new ArrayList<>(Arrays.asList(""));
        List<String> actualOutputList3 = returnDistinctStringImpl.returnDistinctString.getDistinctFromString(inputList3);
        Assert.assertEquals(actualOutputList3,expectedInputList3);
    }
}
