package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

import java.util.Scanner;

public class Main {

    private static String nama = "Fathur Radhy";
    private static String alamat = "Jl. Teuku Umar";
    private static int uTransport = 250000;
    private static int uTunjangan = 300000;
    private static int gapok = 4500000;

    public static void main(String[] args) {
	// write your code here

        Pegawai p = new Pegawai();

        p.setNama(nama);
        p.setAlamat(alamat);
        p.setUangTransport(uTransport);
        p.setUangTunjangan(uTunjangan);
        p.setGajiPokok(gapok);
        p.totalGaji(p.getUangTransport(), p.getUangTunjangan(), p.getGajiPokok());
        p.tampilData(
                p.getNama(),
                p.getAlamat(),
                p.getUangTransport(),
                p.getUangTunjangan(),
                p.getGajiPokok(),
                p.getTotalGaji()
        );
    }
}
