/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author Justin
 */
public class HourlyEmployee extends Employee {
  private double hourlyRate;
  private double hoursPerWeek;
  
  @Override
  public double getAnnualWages(){
      return(hourlyRate * hoursPerWeek);      
  }
  
}
