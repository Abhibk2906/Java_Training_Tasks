package Association_StudentBranchTask;

public class StudentDisplay {

	public static void main(String[] args) {
	UndergradStudent st=new UndergradStudent();
	st.setName("Abhishek");
	st.setRollno(101);
	st.setCity("Bangalore");
	st.setYear(2017);
	System.out.println("Name: "+st.getName()+"\n"+"RollNo: "
	+st.getRollno()+"\n"+"City: "+st.getCity()+"\n"+"Year: "+st.getYear());
    st.diplayBranch();
    st.diplaySociety();
    
    System.out.println("---------------------------");
    UndergradStudent st1=new UndergradStudent();
	st1.setName("Abhi");
	st1.setRollno(102);
	st1.setCity("Mumbai");
	st1.setYear(2019);
	System.out.println("Name: "+st1.getName()+"\n"+"RollNo: "
	+st1.getRollno()+"\n"+"City: "+st1.getCity()+"\n"+"Year: "+st1.getYear());
    st1.diplayBranch();
	}

}
