/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuelconsumption;

/**
 *
 * @author tanagishunsuke
 */
class FuelConsumptionCalculation {
   private double fuelConsumptionOldRegulation = 0;
   private double fuelConsumptionNewRegulation = 0;
   private SimpleCar[] cars;

   FuelConsumptionCalculation() {
      /* your code is here */
      
   } 
   FuelConsumptionCalculation(SimpleCar[] cars) {
      /* your code is here */
      this.cars=cars;
   }
   
   private void calculateFuelConsumption() {
      /* your code to calculate values of
        fuelConsumptionOldRegulation and
        fuelConsumptionNewRegulation is here */
      fuelConsumptionOldRegulation= 
      cars[1].calculateFuelConsumptionOldRegulations(15, 9.5)+cars[2].calculateFuelConsumptionOldRegulations(13, 0);
      
      fuelConsumptionNewRegulation=
      cars[0].calculateFuelConsumptionNewRegulations(14, 10.5)+cars[3].calculateFuelConsumptionNewRegulations(10.5, 6);
     
      
   }
   
   float getFuelConsumptionOldRegulations() {
      /* your code is here */
      calculateFuelConsumption();
      return (float)fuelConsumptionOldRegulation;
   }
   
   float getFuelConsumptionNewRegulations() {
      /* your code is here */
      calculateFuelConsumption();
      return (float)fuelConsumptionNewRegulation;
   }
}

public class FuelConsumption{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FuelConsumptionCalculation a=new FuelConsumptionCalculation();
        
       
    }
}
