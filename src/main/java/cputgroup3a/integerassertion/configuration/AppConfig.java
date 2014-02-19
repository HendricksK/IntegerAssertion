/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.integerassertion.configuration;

import cputgroup3a.integerassertion.service.IntegerAssertion;
import cputgroup3a.integerassertion.service.Impl.IntegerAssertionImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author kurvin
 */
public class AppConfig {
    
    @Bean(name="IntAssert")
        public IntegerAssertion getService(){
            return new IntegerAssertionImpl();
        }
}
