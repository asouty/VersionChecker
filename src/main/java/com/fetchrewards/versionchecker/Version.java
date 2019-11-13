package com.fetchrewards.versionchecker;

public class Version {

    private final String versionString;

    public Version(final String versionString) {
        this.versionString = versionString;
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
