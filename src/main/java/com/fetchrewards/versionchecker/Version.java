package com.fetchrewards.versionchecker;

import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class Version {

    private final String versionString;

    public Version(final String versionString) {
        // Handle version format with "0" as pad character
        this.versionString = stream(versionString.split("\\.")).map(s -> String.valueOf(Integer.parseInt(s)))
                .collect(Collectors.joining("."));
}

    public CompareResult compareTo(final Version o) {
        int compareResult = this.versionString.compareTo(o.versionString);
        CompareResult result = CompareResult.before;
        if(compareResult == 0){
            result = CompareResult.equals;
        }
        else if(compareResult > 0){
            result = CompareResult.after;
        }
        return result;
    }


}
