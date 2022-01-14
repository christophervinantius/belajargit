package makhluk_hidup;

public class Hewan {
	
	private int jumlahKaki;
	private String nama;
	
	public Hewan(int jumlahKaki, String nama) {
		this.jumlahKaki = jumlahKaki;
		this.nama = nama;
	}
	
	public void bicara() {
		System.out.println("Saya adalah hewan, nama saya " + this.nama);
		System.out.println("Saya memiliki " + this.jumlahKaki + " kaki");
	}
	
}
