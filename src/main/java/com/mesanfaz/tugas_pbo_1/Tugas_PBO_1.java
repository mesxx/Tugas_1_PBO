/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mesanfaz.tugas_pbo_1;

/**
 *
 * @author mesanfaz
 */
public class Tugas_PBO_1 {
    String jenis_hp;
    int tahun_pembuatan;
    
    public void setDataHP(String jenis, int tahun){
        jenis_hp = jenis;
        tahun_pembuatan = tahun;
    }
    
    String getJenisHP(){
        return jenis_hp;
    }
    
    int getTahunPembuatan(){
        return tahun_pembuatan;
    }

    public static void main(String[] args) {
        Tugas_PBO_1 hp = new Tugas_PBO_1();
        hp.setDataHP("Sumsang", 2021);
        hp.getJenisHP();        
        hp.getTahunPembuatan();
        
        System.out.println("Jenis: " + hp.getJenisHP());        
        System.out.println("Tahun Pembuatan: " + hp.getTahunPembuatan());
    }
}
