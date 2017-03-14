/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sygnity.test.validators;

import pl.sygnity.test.util.FieldPlayer;
import pl.sygnity.test.util.GoalKeeper;
import pl.sygnity.test.util.Player;
import pl.sygnity.test.util.Striker;

/**
 *
 * @author jarek
 */
public class QualityValidator implements PlayerValidator {

    @Override
    public boolean validate(Player player) {
        if (player instanceof Striker) {
            Striker striker = (Striker) player;
            return (striker.getFinishing() > 80);
        }
        if (player instanceof FieldPlayer) {
            FieldPlayer fplayer = (FieldPlayer) player;
            return (fplayer.getPassing() > 50 && fplayer.getTechnique() > 50);
        }
                
        if (player instanceof GoalKeeper) {
            GoalKeeper goalKeeper = (GoalKeeper) player;
            return (goalKeeper.getHandling() > 70 && goalKeeper.getAerialAbility() > 70);
        }
        return false;
    }
}
