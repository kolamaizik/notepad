package by.training.epam.maizik;

/**
 * public class RecordNotepad.
 * <p>Record in notepad.</p>
 */
public class RecordNotepad {
	private String rec;

	/**
	 * public RecordNotepad()
	 * 
	 * <p>Default constructor</p>
	 */
	public RecordNotepad() {
	}

	/**
	 * public RecordNotepad(String newRec)
	 * @param newRec - records value
	 * 
	 * <p>Constructor with param</p>
	 */
	public RecordNotepad(String newRec){
		setRec(newRec);
	}

	public String getRec() {
		return rec;
	}

	public void setRec(String rec) {
		this.rec = rec;
	}
}