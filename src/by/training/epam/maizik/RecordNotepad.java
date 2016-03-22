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
	public RecordNotepad(String rec){
		this.rec=rec;
	}

	/**
	 * Getter param rec
	 */
	public String getRec() {
		return rec;
	}

	/**
	 * Setter param rec
	 */
	public void setRec(String rec) {
		this.rec = rec;
	}
}