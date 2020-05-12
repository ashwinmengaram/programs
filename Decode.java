import java.io.*;


public class Decode {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String s = br.readLine();

            String out_ = decode(s);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    static String decode(String S){
         int n = S.length();
		StringBuilder op = new StringBuilder(S.charAt(0)+"");
		if (n % 2 == 1) {
			for (int i = 1; i < S.length(); i++) {
				if(i%2==1)
					op.insert(0, S.charAt(i));
				else
					op.append(S.charAt(i));
			}
		}
		else {
			for (int i = 1; i < S.length(); i++) {
				if(i%2==1)
					op.append(S.charAt(i));
				else
					op.insert(0, S.charAt(i));
					
			}
		}
		return (op.toString());
    
    }
}