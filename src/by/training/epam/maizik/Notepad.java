package by.training.epam.maizik;

/**
 * 
 * public class Notepad.
 * <p>Notepad.</p>
 */
public class Notepad {
	private RecordNotepad arrRec[]=new RecordNotepad[50];

	{
		System.out.println("Before run constructor");
	}
	/**
	 * public void addRecord(int index, RecordNotepad value)
	 * @param index - array index
	 * @param value - records value
	 * 
	 * <p>Add record in notepad by index</p>
	 */
	public void addRecord(int index, RecordNotepad value){
		try {
			arrRec[index] = value;
		}
	    catch (ArrayIndexOutOfBoundsException e) {
	    	System.out.println("Array is out of Bounds" + e);
	    }		
	}
	
	/**
	 * public void editRecord(int index, RecordNotepad value)
	 * @param index - array index 
	 * @param value - records value
	 * 
	 * <p>Edit record in notepad by index</p>
	 */
	public void editRecord(int index, RecordNotepad value){
		try {
			arrRec[index] = value;
		}
	    catch (ArrayIndexOutOfBoundsException e) {
	    	System.out.println("Array is out of Bounds" + e);
	    }
	}
	
	/**
	 * public void delRecord(int index)
	 * @param index - array index
	 * 
	 * <p>Delete record in notepad by index</p>
	 */
	public void delRecord(int index){
		try {
			arrRec[index] = null;
		}
	    catch (ArrayIndexOutOfBoundsException e) {
	    	System.out.println("Array is out of Bounds" + e);
	    }
	}
	
	/**
	 * public void showRecord(int index)
	 * @param index - array index
	 * 
	 * <p>Shows record in notepad by index</p>
	 */
	public void showRecord(int index){
		try {
			//System.out.println(arrRec[index].getRec());
			System.out.println(arrRec[index].toString());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is out of Bounds" + e);
		}
	}
	
	public void showRecord(RecordNotepad rec){
		System.out.println(rec.toString());
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