/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kegalauanpakbejo;

/**
 *
 * @author Rizky Alif
 */
import java.lang.Math;

public class Keramik {
    char huruf; /* huruf keramik */
    int panjang;
    int lebar;
    int tanah;
    int harga;
    int isiBox;
    int totalAll;
    float luasTotal;
    int hargaTotal;
    
    /* construction */
    Keramik(){
        this.panjang = 30;
        this.lebar = 30;
        this.tanah = 100;
        this.isiBox = 10;
        this.harga = 54000;
    }
    
    Keramik(int x){
        this.panjang = x;
        this.lebar = 40;
        this.tanah = 100;
        this.isiBox = 5;
        this.harga = 65000;
    }
    
    Keramik(int x, int y){
        this.panjang = x;
        this.lebar = y;
        this.tanah = 100;
        this.isiBox = 8;
        this.harga = 60000;
    }
    
    int hitungLuas(){
        /* menghitung luas keramik */
        return this.panjang * this.lebar;
    }
    
    float luasMeter(){
        /* mengubah luas centimeter ke meter */
        return this.luasTotal = this.luasTotal/10000;
    }
    
    float luasBox(){
        /* menghitung luas keramik dalam satu box */
        return this.luasTotal = this.luasTotal * this.isiBox;
    }
    
    void box(){
        /* menghitung keramik yang dibutuhkan */
        float total;
        total = this.tanah / this.luasTotal;
        this.totalAll = (int)total;
        System.out.println("Keramik " + this.huruf + " yang dibutuhkan adalah sebanyak: " + Math.round(total));
        System.out.println("");
    }
    
    void biaya(){
        /* menghitung biaya yang dibutuhkan setiap keramik */
        this.hargaTotal = Math.round(this.totalAll) * this.harga;
        System.out.println("Biaya yang dibutuhkan untuk membeli keramik " + this.huruf + " sebesar: Rp. " + this.hargaTotal + ",-");
        System.out.println("");
    }
}
