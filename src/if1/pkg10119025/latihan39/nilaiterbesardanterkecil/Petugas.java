/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Petugas {
    Scanner scan = new Scanner(System.in);
    private String namaPetugas;
    private int[] arrNilai;

    public void masukkanNama(){
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scan.next();
    }

    public void masukkanNilai(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int jumlah = scan.nextInt();
        arrNilai = new int[jumlah];
        for(int i = 0; i < jumlah; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" = ");
            arrNilai[i] = scan.nextInt();
        }
        menentukanNilai(arrNilai);
    }

    private void menentukanNilai(int[] nilaiMhs){
        Nilai nilai = new Nilai();
        nilai.penentuanNilai(nilaiMhs, namaPetugas);
    }

   
    }


