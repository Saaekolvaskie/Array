package array.pkg2.dimensi;

import javax.swing.JOptionPane;

public class Array2Dimensi {

    public static void main(String[] args) {
        int data[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4,
            2, 10}};
       String input = JOptionPane.showInputDialog("Masukkan angka yang ingin dicari:");
        int angkaCari = Integer.parseInt(input);
        System.out.println("Array sebelum diubah:");
        tampilkanArray(data);
        boolean ditemukan = false;
        int baris = -1, kolom = -1;
        for (int a = 0; a < data.length; a++) { 
            for (int b = 0; b < data[a].length; b++) { 
                if (data[a][b] == angkaCari) {
                    baris = a;
                    kolom = b;
                    ditemukan = true;
                    break;
                }
            }
            if (ditemukan) break; 
        }
            if (ditemukan) {
            String inputBaru = JOptionPane.showInputDialog("Masukkan angka baru untuk menggantikan " + angkaCari + ":");
            int angkaBaru = Integer.parseInt(inputBaru);
            data[baris][kolom] = angkaBaru;
             System.out.println("\nArray setelah perubahan:");
            tampilkanArray(data);
        } else {
            JOptionPane.showMessageDialog(null, "Angka tidak ditemukan dalam array.");
        }
        int total = jumlahkanKolomGanjil(data);
        System.out.println("\nJumlah elemen pada kolom dengan indeks ganjil: " + total);
    }
    public static void tampilkanArray(int[][] data) {
        for (int i = 0; i < data.length; i++) { 
            for (int j = 0; j < data[i].length; j++) { 
                System.out.print(data[i][j] + " "); 
            } 
            System.out.println(); 
        }
    }
    public static int jumlahkanKolomGanjil(int[][] data) {
        int total = 0;
        for (int i = 0; i < data.length; i++) { 
            for (int j = 1; j < data[i].length; j += 2) {  
                total += data[i][j];
            }
        }
        return total;
    }
}
                
     