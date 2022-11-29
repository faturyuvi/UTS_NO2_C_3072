/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts2_3072;

/**
 *
 * @author fatur
 */
public class ProjectPlanner_3072 extends Employee {
    public float Komisi;
    public float TotalHslProyek;
    public double Totalgaji;
    
    public ProjectPlanner_3072(){
        
    }
            
    public double TotalGaji(){
        Totalgaji = GajiPokok + (Komisi * TotalHslProyek) - (GajiPokok*5/100);
        return Totalgaji;
    }
    
    public void TampilData(){
        System.out.println("Project Plannner");
        Tampil();
        System.out.println("Total Gaji: " + Totalgaji);
    }
}

