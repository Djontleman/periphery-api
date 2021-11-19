package com.djontleman.album;

public enum AlbumType {
    LP("LP"),
    EP("EP"),
    SINGLE("Single"),
    LIVE("Live"),
    COMP("Comp");

    private final String stringRep;

    AlbumType(String stringRep) {
        this.stringRep = stringRep;
    }

    public String getStringRep() {
        return stringRep;
    }

    @Override
    public String toString() {
        return "AlbumType{" +
                "stringRep='" + stringRep + '\'' +
                '}';
    }
}
