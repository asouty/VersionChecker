package com.fetchrewards.versionchecker;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CompareUnitTest {
    @Test
    void test(){
        Assert.assertEquals(CompareResult.equals, new Version("1.0.1").compareTo(new Version("1.0.1")));
        Assert.assertEquals(CompareResult.after, new Version("1.0.1").compareTo(new Version("0.0.0.1")));
        Assert.assertEquals(CompareResult.before, new Version("1.0.1").compareTo(new Version("2.0.0.1")));
        Assert.assertEquals(CompareResult.after, new Version("1.5.0.6.9.0.1").compareTo(new Version("0.0.0.0.0.1")));
        Assert.assertEquals(CompareResult.after, new Version("25.54.14").compareTo(new Version("0.9876542.0.0.98782551.1")));
        Assert.assertEquals(CompareResult.after, new Version("1.0.6").compareTo(new Version("0.9876542.98525.55514.98782551.1")));
        Assert.assertEquals(CompareResult.after, new Version("0.0.1").compareTo(new Version("0")));
        Assert.assertEquals(CompareResult.before, new Version("2.5.4.8.9.4.1").compareTo(new Version("2.5.4.8.9.4.1.1")));
    }

}
