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
class AdvancedCar extends SimpleCar{
    @Override
    float calculateFuelConsumptionOldRegulations(double fueleconomy,double air_fueleconomy)
         {
        double oldRegulation;
        oldRegulation=kilo/fueleconomy+(finish-begin)/air_fueleconomy;
        return (float)oldRegulation;
        }

}
