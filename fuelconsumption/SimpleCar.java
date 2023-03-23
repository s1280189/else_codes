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
class SimpleCar {
     double begin=7;
    double finish=18;
    double kilo=200;
    double withPassenger=8;
    double fueleconomy;
    double air_fueleconomy;
    
    
    SimpleCar getFuelE(double x,double y){
        SimpleCar a= new SimpleCar();
        a.fueleconomy=x;
        a.air_fueleconomy=y;
        
        return a;
    }
    float calculateFuelConsumptionOldRegulations(double fueleconomy,double air_fueleconomy)
        {
        double oldRegulation;
        if(air_fueleconomy!=0){
         AdvancedCar a=new AdvancedCar();
            oldRegulation=a.calculateFuelConsumptionOldRegulations(fueleconomy, air_fueleconomy);
        return (float)oldRegulation;
        }
        else{
            return (float)(kilo/fueleconomy);
        }
    }
    float calculateFuelConsumptionNewRegulations
        (double fueleconomy,
    double air_fueleconomy)
        {
        double newRegulation;
        if(air_fueleconomy!=0){
            DeluxeCar b=new DeluxeCar();
            newRegulation=b.calculateFuelConsumptionNewRegulations(fueleconomy, air_fueleconomy);
            return (float)newRegulation;
        }
        else 
            return (float)(kilo/fueleconomy);
    }

   
}
