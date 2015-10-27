package com.coderbrother;

public enum EngineType {
    JET("Jet"), TURBOPROP("Turboprop");

    private String description;

    EngineType(String description) {
        this.description = description;
    }

    public String describe() {
        return description;
    }

    public String toString() {
        return describe();
    }
}
