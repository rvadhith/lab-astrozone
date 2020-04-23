package service;
import java.time.LocalDate;

import model.User;

public class AstroCalculator {
	public String findSign(User user) {
		
		LocalDate birthYear = user.getDob();
		int month = birthYear.getMonthValue();
		int day = birthYear.getDayOfMonth();
		String astroSign = ""; 
		
		if (month == 1){ 
            if (day < 20)  
            	astroSign = "Capricorn"; 
            else 
            	astroSign = "Aquarius"; 
        }
		else if (month == 2){ 
            if (day < 19) 
            	astroSign = "Aquarius"; 
            else
            	astroSign = "Pisces"; 
        } 
              
        else if(month == 3){ 
            if (day < 21)  
            	astroSign = "Pisces"; 
            else
            	astroSign = "Aries"; 
        } 
        else if (month == 4){ 
            if (day < 20) 
            	astroSign = "Aries"; 
            else
            	astroSign = "Taurus"; 
        } 
              
        else if (month == 5){ 
            if (day < 21) 
            	astroSign = "Taurus"; 
            else
            	astroSign = "Gemini"; 
        } 
              
        else if( month == 6){ 
            if (day < 21) 
            	astroSign = "Gemini"; 
            else
            	astroSign = "Cancer"; 
        } 
              
        else if (month == 7){ 
            if (day < 23) 
            	astroSign = "Cancer"; 
            else
            	astroSign = "Leo"; 
        } 
              
        else if( month == 8){ 
            if (day < 23)  
            	astroSign = "Leo"; 
            else
            	astroSign = "Virgo"; 
        } 
              
        else if (month == 9){ 
            if (day < 23) 
            	astroSign = "Virgo"; 
            else
            	astroSign = "Libra"; 
        } 
              
        else if (month == 10){ 
            if (day < 23) 
            	astroSign = "Libra"; 
            else
            	astroSign = "Scorpio"; 
        } 
              
        else if (month == 11){ 
            if (day < 22) 
            	astroSign = "Scorpio"; 
            else
            	astroSign = "Sagittarius"; 
        } 
        else if (month == 12){ 
            
            if (day < 22) 
            	astroSign = "Sagittarius"; 
            else
            	astroSign ="Capricorn"; 
        }
		
		return astroSign;
	}
}