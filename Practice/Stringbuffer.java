package Practice;
import java.time.LocalDate;
public class Stringbuffer {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		String str = date.toString();
		
		String [] x = str.split("-");
		StringBuffer br = new StringBuffer(x[2]);
		br.append("-");
		br.append(x[1]);
		br.append("-");
		br.append(x[0]);
		
		System.out.println(br);
		
		
	}

}
