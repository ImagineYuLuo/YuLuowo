package me.yuluowo.utils;

public enum Location {
    ISLAND("Your Island"),
    GUEST_ISLAND("'s Island");

    private final String scoreboardName;

    Location(String scoreboardName) {
        this.scoreboardName = scoreboardName;
    }

    public String getScoreboardName() {
        return scoreboardName;
    }
}
