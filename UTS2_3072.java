/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts2_3072;

/**
 *
 * @author fatur
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UTS2_3072 {
    
    public static void main(String[] args) {
        SalariedEmployee_3072 se = new SalariedEmployee_3072();
        CommissionEmployee_3072 ce = new CommissionEmployee_3072();
        ProjectPlanner_3072 pp = new ProjectPlanner_3072();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        try{
            System.out.println("Data Pegawai");
            System.out.print("Nama: ");
            se.Nama = br.readLine();
            System.out.print("NIP: ");
            se.NIP = br.readLine();
            System.out.print("Gaji Pokok: ");
            se.GajiPokok = Float.parseFloat(br.readLine());
            se.TampilData();
            
            System.out.print("Nama: ");
            ce.Nama = br.readLine();
            System.out.print("NIP: ");
            ce.NIP = br.readLine();
            System.out.print("GajiPokok: ");
            ce.GajiPokok = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            ce.Komisi = Float.parseFloat(br.readLine());
            System.out.print("Total Penjualan: ");
            ce.TotalPenjualan = Float.parseFloat(br.readLine());
            ce.TotalGaji();
            ce.TampilData();
            
            System.out.print("Nama: ");
            pp.Nama = br.readLine();
            System.out.print("NIP: ");
            pp.NIP = br.readLine();
            System.out.print("Gaji Pokok: ");
            pp.GajiPokok = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            pp.Komisi = Float.parseFloat(br.readLine());
            System.out.print("Total Hasil Proyek: ");
            pp.TotalHslProyek = Float.parseFloat(br.readLine());
            pp.TotalGaji();
            pp.TampilData();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}