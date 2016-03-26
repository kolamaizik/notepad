package by.training.epam.maizik;

/**
 * public class RecordNotepad.
 * <p>Record in notepad.</p>
 */
public class RecordNotepad {
	private String rec;

	public RecordNotepad() {
	}

	public RecordNotepad(String rec){
		this.rec=rec;
	}

	public String getRec() {
		return rec;
	}

	public void setRec(String rec) {
		this.rec = rec;
	}

	@Override
	public String toString() {
		return rec;
	}

	public void editRec(String newRec) {
		this.rec = newRec;
	}
}