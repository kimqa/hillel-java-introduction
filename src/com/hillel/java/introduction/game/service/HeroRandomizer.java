package com.hillel.java.introduction.game.service;

import com.hillel.java.introduction.game.model.Team;
import com.hillel.java.introduction.game.model.Unit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HeroRandomizer {

    private HeroRandomizer() {
        throw new RuntimeException();
    }

    public static List<Unit> randomizeUnits(Team team1, Team team2) {
        List<Unit> teams = new ArrayList<>();
        teams.addAll(team1.getUnits());
        teams.addAll(team2.getUnits());

        Collections.shuffle(teams);

        return teams;
    }
}
