package com.hillel.java.introduction.lesson14;

import com.hillel.java.introduction.hero.HeroRandomizer;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class Fight {

    private Unit player;

    private Unit enemy;

    private List<Unit> teamPlayer;

    private List<Unit> teamEnemy;

    private Random random = new Random();

    public void attack() {
        // 1 type = physical attack
        // 2 type = magical attack
        // 3 type = freeze attack
//
//        List<com.hillel.java.introduction.hero.Unit> units = HeroRandomizer.randomizeUnits(teamPlayer, teamEnemy);
//
//
//        for (Unit unit : units) {
//            unit.hit();
//        }

//        for (Unit unit : teamPlayer) {
//            HeroR
//
//            //teamPlayer
//
//        }

//        if (player.isHealer()) {
//            Optional<Unit> optionalUnit = teamPlayer.stream().map(unit -> unit.armor).min(unit -> unit.getHealthLevel());
//
//            if (optionalUnit.isPresent()) {
//                player.heal(optionalUnit.get());
//            }
//        }
//
//        boolean playerPerformedAction = false;
//        while (!playerPerformedAction) {
//            int attackType = random.nextInt(3);
//            switch (attackType) {
//                case 1:
//                    if (player.canPhysicalAttack) {
//                        player.physicalAttack(enemy);
//                        case 2:
//                            // ...
//                    }
//            }
//        }
    }
}
