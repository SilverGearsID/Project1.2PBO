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
public class KegalauanPakBejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Keramik kA = new Keramik();
        /* atribut/properties Keramik A */
        kA.huruf = 'A';
        kA.luasTotal = kA.hitungLuas();
        kA.luasMeter();
        kA.luasBox();
        kA.box();
        kA.biaya();
        
        Keramik kB = new Keramik(40);
        /* atribut/properties Keramik B */
        kB.huruf = 'B';
        kB.luasTotal = kB.hitungLuas();
        kB.luasMeter();
        kB.luasBox();
        kB.box();
        kB.biaya();
        
        Keramik kC = new Keramik(30, 40);
        /* atribut/properties Keramik C */
        kC.huruf = 'C';
        kC.luasTotal = kC.hitungLuas();
        kC.luasMeter();
        kC.luasBox();
        kC.box();
        kC.biaya();
        
        /* menentukan harga keramik yang paling murah */
        if (kA.hargaTotal < kB.hargaTotal){
            if (kA.hargaTotal < kC.hargaTotal){
                System.out.println("Harga Keramik yang paling murah adalah: Keramik " + kA.huruf);
            }
        }
        if (kB.hargaTotal < kA.hargaTotal){
            if (kB.hargaTotal < kC.hargaTotal){
                System.out.println("Harga Keramik yang paling murah adalah: Keramik " + kB.huruf);
            }
        }
        if (kC.hargaTotal < kA.hargaTotal){
            if (kC.hargaTotal < kB.hargaTotal){
                System.out.println("Harga Keramik yang paling murah adalah: Keramik " + kC.huruf);
            }
        }
    }
    
}
