package com.keiz.projectlibrary;

import java.util.ArrayList;
import java.util.List;

public class RestoreData {
    private static final List<LaptopSpecs> specsList = new ArrayList<>();

    public static void saveSpecs(LaptopSpecs specs) {
        specsList.add(specs);
    }

    public static List<LaptopSpecs> getAllSpecs() {
        return new ArrayList<>(specsList);
    }
}
