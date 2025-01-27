package j0124;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Ja0124_07 {

	public static void main(String[] args) {
		int no=0;
		String name="";
		int kor,eng,mat,total,rank=0;
		double avg=0;
		ArrayList<Stu> list = new ArrayList<Stu>();
		try {
			FileReader fr = new FileReader("c:/save2/abc.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line==null) {
					break;
				}
				else {
					String[] str = line.split(",");
					no = Integer.parseInt(str[0]);
					name = str[1];
					kor = Integer.parseInt(str[2]);
					eng = Integer.parseInt(str[3]);
					mat = Integer.parseInt(str[4]);
					total = Integer.parseInt(str[5]);
					avg = Double.parseDouble(str[6]);
					rank = Integer.parseInt(str[7]);
					list.add(new Stu(no,name,kor,eng,mat,total,avg,rank));
				}
			}
			fr.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int i=0 ; i<list.size() ; i++) {
			System.out.printf("%d,%s,%d,%d,%d,%d,%.2f,%d\n",list.get(i).getNo(),
					list.get(i).getName(),list.get(i).getKor(),list.get(i).getEng()
					,list.get(i).getMat(),list.get(i).getTotal(),list.get(i).getAvg()
					,list.get(i).getRank());
		}
		System.out.println("종료");
	}

}
