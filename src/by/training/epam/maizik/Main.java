package by.training.epam.maizik;

public class Main {

	public static void main(String[] args){
		Notepad n1 = new Notepad();
		Notepad n2 = new Notepad();

		RecordNotepad r1 = new RecordNotepad("record 1");
		RecordNotepad r2 = new RecordNotepad("record 2");
		RecordNotepad r3 = new RecordNotepad("record 3");

		int n = 25;
		RecordNotepad rn = new RecordNotepad("record " + n);

		n1.addRecord(0, r1);
		n1.addRecord(1, r2);
		n1.addRecord(2, r3);
		n1.addRecord(n, rn);
		n1.showAllRecords();
		System.out.println("--------------");

		n1.editRecord(2, r1);
		r1.editRec("new record 1");
		r2.setRec("new record 2");
		n1.showAllRecords();
		System.out.println("--------------");

		n1.delRecord(0);
		n1.showAllRecords();
		System.out.println("--------------");

		n1.delRecord(1);
		n1.delRecord(50);
		n1.showAllRecords();
		System.out.println("--------------");

		n2.showRecord(r1);
		r1.editRec("new record 11");
		n2.showRecord(r1);
		
	}
}