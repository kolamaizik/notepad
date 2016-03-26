package by.training.epam.maizik;

/**
 * 
 * public class Notepad.
 * <p>
 * Notepad.
 * </p>
 */
public class Notepad {
	private RecordNotepad arrRec[] = new RecordNotepad[50];

	{
		System.out.println("Before run constructor");
	}

	public void addRecord(int index, RecordNotepad value) {
		try {
			arrRec[index] = value;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is out of Bounds" + e);
		}
	}

	public void editRecord(int index, RecordNotepad value) {
		try {
			arrRec[index] = value;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is out of Bounds" + e);
		}
	}

	public void delRecord(int index) {
		try {
			arrRec[index] = null;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is out of Bounds" + e);
		}
	}

	public void showRecord(int index) {
		try {
			// System.out.println(arrRec[index].getRec());
			System.out.println(arrRec[index].toString());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is out of Bounds" + e);
		}
	}

	public void showRecord(RecordNotepad rec) {
		System.out.println(rec.toString());
	}

	public void showAllRecords() {
		for (int i = 0; i < arrRec.length; i++) {
			if (arrRec[i] != null) {
				showRecord(i);
			}
		}
	}
}