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
public class SalariedEmployee extends Employee {
    private double salary;
    
    @Override
    public double getAnnualWages(){
       return(salary * 12); 
    }
    

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
