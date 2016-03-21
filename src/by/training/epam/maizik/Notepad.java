package by.training.epam.maizik;

/**
 * 
 * public class Notepad.
 * <p>Notepad.</p>
 */
public class Notepad {
	private RecordNotepad arrRec[]=new RecordNotepad[50];

	/**
	 * public void addRecord(int index, RecordNotepad value)
	 * @param index - array index
	 * @param value - records value
	 * 
	 * <p>Add record in notepad</p>
	 */
	public void addRecord(int index, RecordNotepad value){
		if (index < arrRec.length)
			arrRec[index] = value;
	}
	
	/**
	 * public void editRecord(int index, RecordNotepad value)
	 * @param index - array index 
	 * @param value - records value
	 * 
	 * <p>Edit record in notepad</p>
	 */
	public void editRecord(int index, RecordNotepad value){
		if (index < arrRec.length)
			arrRec[index] = value;
	}
	
	/**
	 * public void delRecord(int index)
	 * @param index - array index
	 * 
	 * <p>Delete record in notepad</p>
	 */
	public void delRecord(int index){
		if (index < arrRec.length)
			arrRec[index] = null;
	}
	
	/**
	 * public void showRecord(int index)
	 * @param index - array index
	 * 
	 * <p>Shows record in notepad on the index</p>
	 */
	public void showRecord(int index){
		System.out.println(arrRec[index].getRec());
	}
	
	/**
	 * public void showAllRecords()
	 * 
	 * <p>Shows all records in notepad</p>
	 */
	public void showAllRecords(){
		for(int i=0; i<arrRec.length; i++){
			if (arrRec[i]!=null) {
				showRecord(i);
			}
		}
	}
}