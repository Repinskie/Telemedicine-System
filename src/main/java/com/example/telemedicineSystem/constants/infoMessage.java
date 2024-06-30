package com.example.telemedicineSystem.constants;

public enum infoMessage {
    RESOURCE_NOT_FOUND_CODE("RESOURCE_NOT_FOUND");

    private final String value;

    infoMessage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
