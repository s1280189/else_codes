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
class DeluxeCar extends AdvancedCar{
    @Override
    float calculateFuelConsumptionNewRegulations(double fueleconomy,double air_fueleconomy) {
        double newRegulation;
        newRegulation=kilo/fueleconomy+(finish-begin-withPassenger)/air_fueleconomy;
        return (float)newRegulation;
        }
}