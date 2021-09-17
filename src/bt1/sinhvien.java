/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author iWinter VD7
 */
public class sinhvien {
    private BufferedReader br;
    
    public sinhvien() {
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\LEGION\\Desktop\\BT-LTM\\BT1\\src\\bt1"));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public String[] read() {
        String[] a = new String[4];
        try {
            String[] s = br.readLine().split(("\\s+"));
            a[0] = s[0];
            a[1] = s[1];
            a[2] = s[3];
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        return a;
    }
    
    public void inMH(String[] a, int tt){
        System.out.println("Sinh vien thu " + x + ": ");
        System.out.println("Ma SV: " + a[0]);
        System.out.println("Ho ten: " + a[1]);
        System.out.println("Nhom: " + a[2]);
        System.out.println("");
    }
    
}
