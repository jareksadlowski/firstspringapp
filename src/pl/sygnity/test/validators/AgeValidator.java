/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sygnity.test.validators;

import pl.sygnity.test.util.Player;

/**
 *
 * @author jarek
 */
public class AgeValidator implements PlayerValidator {

    @Override
    public boolean validate(Player player) {
        return player.getAge()<30;
    }
    
}
