package com.radhsyn83;

import java.util.Scanner;

public class GajiPegawai {
    private String nama;
    private String alamat;
    private int uangTransport;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }

    public int totalGaji(int uangTransport, int uangTunjangan, int gajiPokok) {
        return this.totalGaji = uangTransport + uangTunjangan + gajiPokok;
    }

    public void tampilData(String nama, String alamat, int uangTransport, int uangTunjangan, int gajiPokok, int totalGaji) {
        System.out.println("### Data Gaji Pegawai Karyawan PT. KAKATU ###");
        System.out.println("------------------");
        System.out.println ("Nama Karyawan : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Uang Transport : Rp. " + uangTransport);
        System.out.println("Uang Tunjangan : Rp. " + uangTunjangan);
        System.out.println("Gaji Pokok : Rp. " + gajiPokok);
        System.out.println("TOTAL GAJI : Rp. " + totalGaji);
    }

}
