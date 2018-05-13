package com.arnoldgalovics.blog.paymentservice;

import java.util.List;

class ListPayingUserResponse {
    private List<String> names;

    public ListPayingUserResponse(List<String> names) {
        this.names = names;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
