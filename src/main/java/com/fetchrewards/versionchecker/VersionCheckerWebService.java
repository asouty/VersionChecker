package com.fetchrewards.versionchecker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionCheckerWebService {

    @RequestMapping("/compare")
    public String compare(@RequestParam(value="version1") final Version version1,
                          @RequestParam(value="version2") final Version version2) {
        return version1.compareTo(version2).name();
    }
}
