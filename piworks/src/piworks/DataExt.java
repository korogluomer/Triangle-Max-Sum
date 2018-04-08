package piworks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DataExt {
	
	private String [][] arr;
	private int [][] a;
	private File file;
	private String line;
	private int row=0,i=0;
	private BufferedReader br=null; 

	public void yukle() throws IOException {
		br = new BufferedReader(new FileReader(file));
		while ((line = br.readLine()) != null) {
			row++;
		}
		br = new BufferedReader(new FileReader(file));
		arr=new String[row][];
		while ((line = br.readLine()) != null) {
		    arr[i++]=line.split(" ");
		}
		a=new int[row][arr[arr.length-1].length];
		for(int i=0;i<arr.length;i++) {
		  a[i]=new int[arr[i].length];
			for(int j=0;j<arr[i].length;j++) {
				a[i][j]=Integer.valueOf(arr[i][j]);
			}
		}
		br.close();
	}

	public String[][] getArr() {
		return arr;
	}

	public void setArr(String[][] arr) {
		this.arr = arr;
	}

	public int[][] getA() {
		return a;
	}

	public void setA(int[][] a) {
		this.a = a;
	}

	public File getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = new File(file);
	}
	
	
	
	
}
