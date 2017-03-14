/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sygnity.test.validators;

import pl.sygnity.test.util.*;

/**
 *
 * @author jarek
 */
public class AverageSkillValidator implements PlayerValidator {

    @Override
    public boolean validate(Player player) {
        
        if (player instanceof Striker){
            Striker striker = (Striker)player;
            double score=(striker.getPassing()+striker.getSpeed()+striker.getStamina()+striker.getTechnique()+striker.getFinishing())/5;
            return (score>50);
        } 
        if (player instanceof FieldPlayer){
            FieldPlayer fplayer=(FieldPlayer) player;
            double score=(fplayer.getPassing()+fplayer.getSpeed()+fplayer.getStamina()+fplayer.getTechnique())/4;
            return (score>50);
        }         
        if (player instanceof GoalKeeper){
            GoalKeeper goalKeeper =(GoalKeeper) player;
            return (goalKeeper.getHandling()>50);
        }
        return false;
        
    }
    
}
