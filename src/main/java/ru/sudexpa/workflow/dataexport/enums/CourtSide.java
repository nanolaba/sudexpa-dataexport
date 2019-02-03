package ru.sudexpa.workflow.dataexport.enums;

public enum CourtSide {
    CLAIMANT("истец"),
    DEFENDANT("ответчик"),
    COURT("суд");

    private final String title;

    CourtSide(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
