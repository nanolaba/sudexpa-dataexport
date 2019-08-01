package ru.sudexpa.workflow.dataexport.enums;

public enum ExpertiseType {
    EXTRA("внесудебная"),
    PRE("досудебная"),
    JUDICAL("судебная"),
    NONJUDICAL("не будет использоваться в суде"),
    EVALUATION_REPORT("отчет об оценке");

    private final String title;

    ExpertiseType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
