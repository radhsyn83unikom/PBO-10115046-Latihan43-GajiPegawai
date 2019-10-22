package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner s = new Scanner(System.in);
        Pegawai p = new Pegawai();

        System.out.println("### Data Gaji Pegawai Karyawan PT. KAKATU ###");
        System.out.println("------------------");
        System.out.print("Nama Karyawan : ");
        p.setNama(s.nextLine());
        System.out.print("Alamat : ");
        p.setAlamat(s.nextLine());
        System.out.print("Uang Transport : Rp. ");
        p.setUangTransport(s.nextInt());
        System.out.print("Uang Tunjangan : Rp. ");
        p.setUangTunjangan(s.nextInt());
        System.out.print("Gaji Pokok : Rp. ");
        p.setGajiPokok(s.nextInt());
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
