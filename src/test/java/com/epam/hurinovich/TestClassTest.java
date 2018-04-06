package com.epam.hurinovich;

import com.epam.gurinovich.TestClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

/**
 * Created by Maksim_Hurinovich on 4/6/2018.
 */
public class TestClassTest {

    private TestClass test = new TestClass();

    @Test
    public void calculateSumTest(){
        float actual = test.calculateSum('m', '=');
        float expected = 170;
        Assert.assertEquals(actual, expected);
        actual = test.calculateSum(23, test.calculateSum(1, 2));
        expected = 26;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateDiffTest(){
        float actual = test.calculateDiff('m', '=');
        float expected = -48;
        Assert.assertEquals(actual, expected);
        actual = test.calculateDiff(23, test.calculateDiff(1, 2));
        expected = -22;
        Assert.assertEquals(actual, expected);
    }

}
