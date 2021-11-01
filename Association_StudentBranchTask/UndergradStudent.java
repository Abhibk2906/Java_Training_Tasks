package Association_StudentBranchTask;

public class UndergradStudent extends Student {
int year;

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public void diplayBranch() {
	Branch br=new Branch();
	br.studeiesBranch();
}

public void diplaySociety() {
	Society sr=new Society();
	sr.collegeSociety();
}
}
