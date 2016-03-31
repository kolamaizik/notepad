package by.training.epam.mk_task1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
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
		System.out.println("--------------");

		int[][] array = { { 1, 2, 3 }, { 0, 0, 0, }, };
		System.out.println(Arrays.deepToString(array));
		System.out.println("--------------");
		double $ = 0XD_EP2F;
		System.out.println($);

		double _ = 8.0;
		System.out.println(_);
		System.out.println("--------------");

		ha�ra();
		System.out.println("--------------");

		Byte[] Byte[] = { { 0 } };
		System.out.println(Byte);
		System.out.println(Byte.class);
		System.out.println(Byte.length);
		System.out.println(new Byte("8"));
	}

	static void ha�ra() {
		System.out.println("Hello habrahabr!");
	}
}