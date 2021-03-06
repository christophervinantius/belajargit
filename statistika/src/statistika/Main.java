package statistika;

import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	int jumlahSiswa;
	int jumlahNilai;
	double rataan;
	
	public Main() {
		do{
			System.out.print("Masukkan banyaknya siswa: ");
			jumlahSiswa = scan.nextInt();
			scan.nextLine();
			if(jumlahSiswa < 10) {
				System.out.println("Banyak siswa harus 10 atau lebih!");
			}
		}while(jumlahSiswa < 10);
		int daftarNilai[] = new int[jumlahSiswa];
		int nilaiSiswa;
		for(int i=0; i<jumlahSiswa; i++) {
			do{
				System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
				nilaiSiswa = scan.nextInt();
				scan.nextLine();
			}while(nilaiSiswa < 1 || nilaiSiswa > 10);
			daftarNilai[i] = nilaiSiswa;
		}
		for(int i=0; i<jumlahSiswa; i++) {
			jumlahNilai += daftarNilai[i];
		}
		rataan = (double)jumlahNilai/jumlahSiswa;
		System.out.println("Rata-rata: " + rataan);
		scan.close();
		
		for(int i=0; i<jumlahSiswa; i++) {
			for(int j=1; j<(jumlahSiswa-i); j++) {
				if(daftarNilai[j-1] > daftarNilai[j]) {
					int temp = daftarNilai[j-1];
					daftarNilai[j-1] = daftarNilai[j];
					daftarNilai[j] = temp;
				}
			}
		}
		
		for(int i=0; i<jumlahSiswa; i++) {
			System.out.print(daftarNilai[i] + " ");
		}
		int mode = 0;
		
		for(int i=0; i<jumlahSiswa; i++) {
			int value = daftarNilai[i];
			int count = 1, maxCount = 0;
			for(int j=0; j<jumlahSiswa; i++) {
				if(daftarNilai[j] == value) {
					count++;
				}
			}
			if(count > maxCount) {
				mode = value;
				maxCount = count;
			}
		}
		
		System.out.println("Modus: " + mode);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
