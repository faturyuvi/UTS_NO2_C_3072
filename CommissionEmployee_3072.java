/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts2_3072;

/**
 *
 * @author fatur
 */

public class CommissionEmployee_3072 extends Employee{
    public float Komisi;
    public float TotalPenjualan;
    public float Totalgaji;
    
    public CommissionEmployee_3072(){
        
    }
    
    public float TotalGaji(){
        Totalgaji = GajiPokok + (Komisi * TotalPenjualan);
        return Totalgaji;
    }
    
    public void TampilData(){
        System.out.println("Commission Employee");
        Tampil();
        System.out.println("Total Gaji: " + Totalgaji);
    }
}