import java.io.*;
public class reverse {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("input.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String data;
		StringBuffer all = new StringBuffer("");
		while((data = br.readLine())!=null) {
			all.insert(0,"\n");
			all.insert(0, data);
		}
		br.close();
		FileOutputStream fos = new FileOutputStream("output.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write(all.toString());
		bw.close();
	}
}
