package com.arnoldgalovics.blog.codegen;

import io.swagger.codegen.languages.SpringCodegen;

public class CustomCodegen extends SpringCodegen {
    @Override
    public void processOpts() {
        super.processOpts();
        if (SPRING_CLOUD_LIBRARY.equals(getLibrary())) {
            apiTemplateFiles.put("apiClientWrapper.mustache", "ClientWrapper.java");
        }
    }

    @Override
    public String getName() {
        return "custom";
    }
}
