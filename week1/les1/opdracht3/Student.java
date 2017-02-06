package week1.les1.opdracht3;
//opdracht 3 en 4
public class Student {
	
	private String naam;
	public int studentNummer;
	
	
	public Student(String nm){
		naam=nm;
	
	}
	public Student(String nm,int sn){
		naam=nm;
		studentNummer=sn;
	}

	public String getNaam(){
		return naam;
	}
	public int getStudentNummer(){
		return studentNummer;
	}
	public void setStudentNummer(Integer sn){
		studentNummer=sn;
	}
	public String toString(){
		String s = "deze student heet "+ naam +" en heeft nummer: "+studentNummer;
		return s;
	}

}
